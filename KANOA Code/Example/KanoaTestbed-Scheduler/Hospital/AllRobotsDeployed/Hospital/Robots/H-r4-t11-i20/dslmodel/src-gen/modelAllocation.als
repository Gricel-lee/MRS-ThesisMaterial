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
{disj[capability ,  Capability-r1at2-r1at3-r1at4-r1ate]}
lone sig r3 extends Robot{}
{disj[capability ,  Capability-r3at2-r3at3-r3at4-r3ate]}
lone sig r4 extends Robot{}
{disj[capability ,  Capability-r4at1-r4ate]}
lone sig r5 extends Robot{}
{disj[capability ,  Capability-r5at1-r5ate]}

// ----------------CAPABILITIES:

lone sig r1at2 extends Capability{}
{all d:do | d in at2}
lone sig r1at3 extends Capability{}
{all d:do | d in at3}
lone sig r1at4 extends Capability{}
{all d:do | d in at4}
lone sig r1ate extends Capability{}
{all d:do | d in ate}
lone sig r3at2 extends Capability{}
{all d:do | d in at2}
lone sig r3at3 extends Capability{}
{all d:do | d in at3}
lone sig r3at4 extends Capability{}
{all d:do | d in at4}
lone sig r3ate extends Capability{}
{all d:do | d in ate}
lone sig r4at1 extends Capability{}
{all d:do | d in at1}
lone sig r4ate extends Capability{}
{all d:do | d in ate}
lone sig r5at1 extends Capability{}
{all d:do | d in at1}
lone sig r5ate extends Capability{}
{all d:do | d in ate}

// ----------------ATOMIC TASKS:

abstract sig ate,at1,at4,at2,at3 extends AtomicTask {}
fact{all a:ate | #do.a=4}	// number of robots needed
fact{all a:at1 | #do.a=2}	// number of robots needed
fact{all a:at4 | #do.a=1}	// number of robots needed
fact{all a:at2 | #do.a=1}	// number of robots needed
fact{all a:at3 | #do.a=1}	// number of robots needed
one sig ate_11 extends ate{} {x=10 y=6} //do at location le
one sig at4_8 extends at4{} {x=10 y=1} //do at location room4
one sig at3_9 extends at3{} {x=10 y=1} //do at location room4
one sig at4_2 extends at4{} {x=1 y=7} //do at location room2
one sig at3_3 extends at3{} {x=1 y=7} //do at location room2
one sig at2_4 extends at2{} {x=1 y=7} //do at location room2
one sig at4_5 extends at4{} {x=4 y=1} //do at location room3
one sig at3_6 extends at3{} {x=4 y=1} //do at location room3
one sig at2_7 extends at2{} {x=4 y=1} //do at location room3
one sig at1_1 extends at1{} {x=2 y=3} //do at location room1
one sig at2_10 extends at2{} {x=10 y=1} //do at location room4

// ----------------PREDICATE:

pred TaskAllocation{
}

// ----------------CONSTRAINTS:

 fact{ all r:r3| all c:r.capability | all do:c.do | do.x>9}
 fact{ all r:r3| all c:r.capability | all do:c.do | do.y<7}

// ----------------RUN COMMAND:

run TaskAllocation for
5 Int, 12 Capability, exactly 11 AtomicTask, 4 Robot