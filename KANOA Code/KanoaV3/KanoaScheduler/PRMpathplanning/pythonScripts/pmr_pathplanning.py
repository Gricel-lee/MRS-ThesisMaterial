"""
Probablistic Road Map (PRM) Planner
author: Atsushi Sakai (@Atsushi_twi)
"""

import random
import math
import numpy as np
import scipy.spatial
import matplotlib.pyplot as plt

# parameter
N_SAMPLE = 500  # number of sample_points
N_KNN = 10  # number of edge from one sampled point
MAX_EDGE_LEN = 30.0  # [m] Maximum edge length

show_animation = True


class Node:
    """
    Node class for dijkstra search
    """

    def __init__(self, x, y, cost, pind):
        self.x = x
        self.y = y
        self.cost = cost
        self.pind = pind

    def __str__(self):
        return str(self.x) + "," + str(self.y) + "," + str(self.cost) + "," + str(self.pind)


class KDTree:
    """
    Nearest neighbor search class with KDTree
    """

    def __init__(self, data):
        # store kd-tree
        self.tree = scipy.spatial.cKDTree(data)

    def search(self, inp, k=1):
        """
        Search NN
        inp: input data, single frame or multi frame
        """

        if len(inp.shape) >= 2:  # multi input
            index = []
            dist = []

            for i in inp.T:
                idist, iindex = self.tree.query(i, k=k)
                index.append(iindex)
                dist.append(idist)

            return index, dist

        dist, index = self.tree.query(inp, k=k)
        return index, dist

    def search_in_distance(self, inp, r):
        """
        find points with in a distance r
        """

        index = self.tree.query_ball_point(inp, r)
        return index


def PRM_planning(sx, sy, gx, gy, ox, oy, rr):

    obkdtree = KDTree(np.vstack((ox, oy)).T)

    sample_x, sample_y = sample_points(sx, sy, gx, gy, rr, ox, oy, obkdtree)
    if show_animation:
        plt.plot(sample_x, sample_y, ".b")

    road_map = generate_roadmap(sample_x, sample_y, rr, obkdtree)

    rx, ry = dijkstra_planning(
        sx, sy, gx, gy, ox, oy, rr, road_map, sample_x, sample_y)

    return rx, ry


def is_collision(sx, sy, gx, gy, rr, okdtree):
    x = sx
    y = sy
    dx = gx - sx
    dy = gy - sy
    yaw = math.atan2(gy - sy, gx - sx)
    d = math.hypot(dx, dy)

    if d >= MAX_EDGE_LEN:
        return True

    D = rr
    nstep = round(d / D)

    for i in range(nstep):
        idxs, dist = okdtree.search(np.array([x, y]).reshape(2, 1))
        if dist[0] <= rr:
            return True  # collision
        x += D * math.cos(yaw)
        y += D * math.sin(yaw)

    # goal point check
    idxs, dist = okdtree.search(np.array([gx, gy]).reshape(2, 1))
    if dist[0] <= rr:
        return True  # collision

    return False  # OK


def generate_roadmap(sample_x, sample_y, rr, obkdtree):
    """
    Road map generation
    sample_x: [m] x positions of sampled points
    sample_y: [m] y positions of sampled points
    rr: Robot Radius[m]
    obkdtree: KDTree object of obstacles
    """

    road_map = []
    nsample = len(sample_x)
    skdtree = KDTree(np.vstack((sample_x, sample_y)).T)

    for (i, ix, iy) in zip(range(nsample), sample_x, sample_y):

        index, dists = skdtree.search(
            np.array([ix, iy]).reshape(2, 1), k=nsample)
        inds = index[0]
        edge_id = []
        #  print(index)

        for ii in range(1, len(inds)):
            nx = sample_x[inds[ii]]
            ny = sample_y[inds[ii]]

            if not is_collision(ix, iy, nx, ny, rr, obkdtree):
                edge_id.append(inds[ii])

            if len(edge_id) >= N_KNN:
                break

        road_map.append(edge_id)

    #  plot_road_map(road_map, sample_x, sample_y)

    return road_map


def dijkstra_planning(sx, sy, gx, gy, ox, oy, rr, road_map, sample_x, sample_y):
    """
    sx: start x position [m]
    sy: start y position [m]
    gx: goal x position [m]
    gy: goal y position [m]
    ox: x position list of Obstacles [m]
    oy: y position list of Obstacles [m]
    rr: robot radius [m]
    road_map: ??? [m]
    sample_x: ??? [m]
    sample_y: ??? [m]
    @return: Two lists of path coordinates ([x1, x2, ...], [y1, y2, ...]), empty list when no path was found
    """

    nstart = Node(sx, sy, 0.0, -1)
    ngoal = Node(gx, gy, 0.0, -1)

    openset, closedset = dict(), dict()
    openset[len(road_map) - 2] = nstart

    path_found = True

    while True:
        if not openset:
            print("Cannot find path")
            path_found = False
            break

        c_id = min(openset, key=lambda o: openset[o].cost)
        current = openset[c_id]

        # show graph
        if show_animation and len(closedset.keys()) % 2 == 0:
            # for stopping simulation with the esc key.
            plt.gcf().canvas.mpl_connect('key_release_event',
                    lambda event: [exit(0) if event.key == 'escape' else None])
            plt.plot(current.x, current.y, "xg")
            plt.pause(0.001)

        if c_id == (len(road_map) - 1):
            print("goal is found!")
            ngoal.pind = current.pind
            ngoal.cost = current.cost
            break

        # Remove the item from the open set
        del openset[c_id]
        # Add it to the closed set
        closedset[c_id] = current

        # expand search grid based on motion model
        for i in range(len(road_map[c_id])):
            n_id = road_map[c_id][i]
            dx = sample_x[n_id] - current.x
            dy = sample_y[n_id] - current.y
            d = math.hypot(dx, dy)
            node = Node(sample_x[n_id], sample_y[n_id],
                        current.cost + d, c_id)

            if n_id in closedset:
                continue
            # Otherwise if it is already in the open set
            if n_id in openset:
                if openset[n_id].cost > node.cost:
                    openset[n_id].cost = node.cost
                    openset[n_id].pind = c_id
            else:
                openset[n_id] = node

    if path_found is False:
        return [], []

    # generate final course
    rx, ry = [ngoal.x], [ngoal.y]
    pind = ngoal.pind
    while pind != -1:
        n = closedset[pind]
        rx.append(n.x)
        ry.append(n.y)
        pind = n.pind

    return rx, ry


def plot_road_map(road_map, sample_x, sample_y):  # pragma: no cover

    for i, _ in enumerate(road_map):
        for ii in range(len(road_map[i])):
            ind = road_map[i][ii]

            plt.plot([sample_x[i], sample_x[ind]],
                     [sample_y[i], sample_y[ind]], "-k")


def sample_points(sx, sy, gx, gy, rr, ox, oy, obkdtree):
    maxx = max(ox)
    maxy = max(oy)
    minx = min(ox)
    miny = min(oy)

    sample_x, sample_y = [], []

    while len(sample_x) <= N_SAMPLE:
        tx = (random.random() * (maxx - minx)) + minx
        ty = (random.random() * (maxy - miny)) + miny

        index, dist = obkdtree.search(np.array([tx, ty]).reshape(2, 1))

        if dist[0] >= rr:
            sample_x.append(tx)
            sample_y.append(ty)

    sample_x.append(sx)
    sample_y.append(sy)
    sample_x.append(gx)
    sample_y.append(gy)

    return sample_x, sample_y


def obs():
    ox = []
    oy = []

    for i in range(0, 111, 1):
        v=i/10
        ox.append(v)
        oy.append(0.0)
    for i in range(0, 50, 1):
        v=i/10
        ox.append(v)
        oy.append(10.0)
    for i in range(65, 110, 1):
        v=i/10
        ox.append(v)
        oy.append(6.0)
    for i in range(0, 110, 1):
        v=i/10
        ox.append(0)
        oy.append(v)
    for i in range(0, 100, 1):
        v=i/10
        ox.append(11)
        oy.append(v)

    for i in range(0, 40, 1):
        v=i/10
        ox.append(4.5)
        oy.append(v)
    for i in range(0,40,1):
        v=i/10
        ox.append(6.5)
        oy.append(v)
    for i in range(0,15,1):
        v=i/10
        ox.append(v)
        oy.append(4)
    for i in range(30,45,1):
        v=i/10
        ox.append(v)
        oy.append(4)
    for i in range(0,15,1):
        v=i/10
        ox.append(v)
        oy.append(6)
    for i in range(30,45,1):
        v=i/10
        ox.append(v)
        oy.append(6)
    for i in range(60, 100, 1):
        v=i/10
        ox.append(4.5)
        oy.append(v)
    for i in range(60,100,1):
        v=i/10
        ox.append(6.5)
        oy.append(v)
    for i in range(60,100,1):
        v=i/10
        ox.append(8.5)
        oy.append(v)
    for i in range(0,40,1):
        v=i/10
        ox.append(8.5)
        oy.append(v)
    return ox,oy



def run():
    print(__file__ + " start!!")

    show_animation = False
    # start and goal position
    sx = 1.0  # [m]
    sy = 1.0  # [m]
    gx = 1.0  # [m]
    gy = 1.0  # [m]
    robot_size = 0.20  # [m]
    ox,oy = obs()


    if show_animation:
        plt.plot(ox, oy, ".k")
        plt.plot(sx, sy, "^r")
        plt.plot(gx, gy, "^c")
        plt.grid(True)
        plt.axis("equal")


    r1=[5,2]
    r2=[5,1]
    r3=[6,3]
    r4=[6,2]
    r5=[6,1]

    l1=[2,6]
    l2=[8,10]
    l3=[9,10]
    l4=[9,4]
    l5=[8,4]
    l6=[2,4]
    s = r1
    g = l1

    rob = [r1,r2,r3,r4,r5]
    loc = [l1,l2,l3,l4,l5,l6]
    s=""

    for i in range(len(rob)):
        s1=("//")
        print(s1)
        for k in range(len(loc)):
            if(i!=k):
                s = rob[i] #start
                g = loc[k] #goal
                rx, ry = PRM_planning(s[0], s[1], g[0], g[1], ox, oy, robot_size)
                assert rx, 'Cannot found path'
                total_cost = total_traveling_cost(rx, ry)
                s1 = ("room{} to room{}, distance: {}.{}".format(i+1, k+1, math.floor(total_cost),0))+"\n"
                s += s1
                print(s1)
    print(s)

    for i in range(len(rob)):
        s1=("//paths r{}".format(i+1))+"\n"
        s+=s1
        print(s1)
        for k in range(len(loc)):
            s = rob[i] #start
            g = loc[k] #goal
            rx, ry = PRM_planning(s[0], s[1], g[0], g[1], ox, oy, robot_size)
            assert rx, 'Cannot found path'
            total_cost = total_traveling_cost(rx, ry)
            s1 = ("l{} to room{}, distance: {}.{}".format(i+7, k+1, math.floor(total_cost),0))+"\n"
            s += s1
            print(s1)
    print(s)

    if show_animation!=True:

        plt.plot(rx, ry, "-r")
        plt.plot(5, 1, marker='^', markersize=10)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(5, 2, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(6, 1, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(6, 2, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(6, 3, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.show()



def test():
    print(__file__ + " start!!")

    # start and goal position
    sx = 1.0  # [m]
    sy = 1.0  # [m]
    gx = 1.0  # [m]
    gy = 1.0  # [m]
    robot_size = 0.20  # [m]
    ox,oy = obs()
    


    if show_animation:
        plt.plot(ox, oy, ".k")
        plt.plot(sx, sy, "^r")
        plt.plot(gx, gy, "^c")
        plt.grid(True)
        plt.axis("equal")


    r1=[5,2]
    r2=[5,1]
    r3=[6,3]
    r4=[6,2]
    r5=[6,1]

    l1=[2,6]
    l2=[8,10]
    l3=[9,10]
    l4=[9,4]
    l5=[8,4]
    l6=[2,4]
    #--- SELECT start and goal
    s = l1
    g = l2

    rx, ry = PRM_planning(s[0], s[1], g[0], g[1], ox, oy, robot_size)

    assert rx, 'Cannot found path'
    total_cost = total_traveling_cost(rx, ry)
    print("Total traveling cost:", total_cost)


    if show_animation:

        plt.plot(rx, ry, "-r")
        plt.plot(5, 1, marker='^', markersize=10)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(5, 2, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(6, 1, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(6, 2, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.plot(6, 3, marker='^', markersize=8)
        plt.pause(0.1)  # Pause for 0.1 seconds
        plt.show()

def calculate_distance(x1, y1, x2, y2):
    return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

def total_traveling_cost(x, y):
    total_cost = 0
    for i in range(len(x) - 1):
        total_cost += calculate_distance(x[i], y[i], x[i + 1], y[i + 1])
    return total_cost


# Get traveling costs between locations
def main():
    random.seed(15)
    # -- select one of the following:
    run()
    #test()
if __name__ == '__main__':
    main()