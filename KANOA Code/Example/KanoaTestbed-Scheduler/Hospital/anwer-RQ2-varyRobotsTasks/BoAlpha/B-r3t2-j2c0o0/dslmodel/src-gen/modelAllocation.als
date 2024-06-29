// ----------------Initialise constraint solver-------------//
open util/integer

abstract sig Robot {
	capability: set Capability,
}

abstract sig Capability {
	do: set AtomicTask
}

abstract sig AtomicTask {
	x: one Int,
	y: one Int
}

fact{all c: Capability | #capability.c=1} //all Capability appearing must be assigned to a robot
fact{all r: Robot | #r.capability.do>0} //all Robots appearing must have assigned tasks
fact{all c: Capability | #c.do>0} // all capability appearing must have assigned tasks
fact{all r:Robot | #r<=1} // all robots appears max. once

// ----------------ROBOTS:

lone sig r1 extends Robot{}
{disj[capability ,  Capability-r1at1Rock-r1at2Rock]}
lone sig r2 extends Robot{}
{disj[capability ,  Capability-r2at1Rock-r2at2Rock]}
lone sig r3 extends Robot{}
{disj[capability ,  Capability-r3at1Rock-r3at2Rock]}

// ----------------CAPABILITIES:

lone sig r1at1Rock extends Capability{}
{all d:do | d in at1Rock}
lone sig r1at2Rock extends Capability{}
{all d:do | d in at2Rock}
lone sig r2at1Rock extends Capability{}
{all d:do | d in at1Rock}
lone sig r2at2Rock extends Capability{}
{all d:do | d in at2Rock}
lone sig r3at1Rock extends Capability{}
{all d:do | d in at1Rock}
lone sig r3at2Rock extends Capability{}
{all d:do | d in at2Rock}

// ----------------ATOMIC TASKS:

abstract sig at2Rock,at1Rock extends AtomicTask {}
fact{all a:at2Rock | #do.a=3}	// number of robots needed
fact{all a:at1Rock | #do.a=3}	// number of robots needed
one sig at2Rock_2 extends at2Rock{} {x=10 y=20} //do at location l1c
one sig at1Rock_1 extends at1Rock{} {x=10 y=20} //do at location l1c

// ----------------PREDICATE:

pred TaskAllocation{
}

// ----------------CONSTRAINTS:

 fact{ all r:r3| all c:r.capability | all do:c.do | do.y>50}
 fact { no r:r1 | #(r.capability.do ) > 16}
 fact { no r:r2 | #(r.capability.do ) > 16}
 fact { no r:r3 | #(r.capability.do ) > 16}

// ----------------RUN COMMAND:

run TaskAllocation for
7 Int, 6 Capability, exactly 2 AtomicTask, 3 Robot