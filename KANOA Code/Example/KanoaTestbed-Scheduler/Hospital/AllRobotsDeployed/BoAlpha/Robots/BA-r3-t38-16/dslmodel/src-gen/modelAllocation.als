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
{disj[capability ,  Capability-r1at1-r1at2-r1at1Rock-r1at2Rock-r1at1Reef-r1at2Reef]}
lone sig r2 extends Robot{}
{disj[capability ,  Capability-r2at1-r2at2-r2at1Rock-r2at2Rock-r2at1Reef-r2at2Reef]}
lone sig r3 extends Robot{}
{disj[capability ,  Capability-r3at1-r3at2-r3at1Rock-r3at2Rock]}

// ----------------CAPABILITIES:

lone sig r1at1 extends Capability{}
{all d:do | d in at1}
lone sig r1at2 extends Capability{}
{all d:do | d in at2}
lone sig r1at1Rock extends Capability{}
{all d:do | d in at1Rock}
lone sig r1at2Rock extends Capability{}
{all d:do | d in at2Rock}
lone sig r1at1Reef extends Capability{}
{all d:do | d in at1Reef}
lone sig r1at2Reef extends Capability{}
{all d:do | d in at2Reef}
lone sig r2at1 extends Capability{}
{all d:do | d in at1}
lone sig r2at2 extends Capability{}
{all d:do | d in at2}
lone sig r2at1Rock extends Capability{}
{all d:do | d in at1Rock}
lone sig r2at2Rock extends Capability{}
{all d:do | d in at2Rock}
lone sig r2at1Reef extends Capability{}
{all d:do | d in at1Reef}
lone sig r2at2Reef extends Capability{}
{all d:do | d in at2Reef}
lone sig r3at1 extends Capability{}
{all d:do | d in at1}
lone sig r3at2 extends Capability{}
{all d:do | d in at2}
lone sig r3at1Rock extends Capability{}
{all d:do | d in at1Rock}
lone sig r3at2Rock extends Capability{}
{all d:do | d in at2Rock}

// ----------------ATOMIC TASKS:

abstract sig at2Reef,at2,at1Reef,at1Rock,at1,at2Rock extends AtomicTask {}
fact{all a:at2Reef | #do.a=1}	// number of robots needed
fact{all a:at2 | #do.a=1}	// number of robots needed
fact{all a:at1Reef | #do.a=1}	// number of robots needed
fact{all a:at1Rock | #do.a=1}	// number of robots needed
fact{all a:at1 | #do.a=3}	// number of robots needed
fact{all a:at2Rock | #do.a=1}	// number of robots needed
one sig at2Rock_14 extends at2Rock{} {x=20 y=10} //do at location l2b
one sig at1_21 extends at1{} {x=20 y=50} //do at location l2f
one sig at1Rock_11 extends at1Rock{} {x=20 y=0} //do at location l2a
one sig at2_34 extends at2{} {x=30 y=40} //do at location l3e
one sig at2Rock_12 extends at2Rock{} {x=20 y=0} //do at location l2a
one sig at1_23 extends at1{} {x=20 y=60} //do at location l2g
one sig at1Rock_13 extends at1Rock{} {x=20 y=10} //do at location l2b
one sig at2_36 extends at2{} {x=30 y=50} //do at location l3f
one sig at2_38 extends at2{} {x=30 y=60} //do at location l3g
one sig at2_18 extends at2{} {x=20 y=30} //do at location l2d
one sig at2Reef_6 extends at2Reef{} {x=10 y=40} //do at location l1e
one sig at2Reef_4 extends at2Reef{} {x=10 y=30} //do at location l1d
one sig at1Reef_29 extends at1Reef{} {x=30 y=20} //do at location l3c
one sig at1_9 extends at1{} {x=10 y=60} //do at location l1g
one sig at1Reef_27 extends at1Reef{} {x=30 y=10} //do at location l3b
one sig at2Reef_8 extends at2Reef{} {x=10 y=50} //do at location l1f
one sig at2Reef_28 extends at2Reef{} {x=30 y=10} //do at location l3b
one sig at2_20 extends at2{} {x=20 y=40} //do at location l2e
one sig at1_31 extends at1{} {x=30 y=30} //do at location l3d
one sig at2_22 extends at2{} {x=20 y=50} //do at location l2f
one sig at2Rock_26 extends at2Rock{} {x=30 y=0} //do at location l3a
one sig at2Reef_30 extends at2Reef{} {x=30 y=20} //do at location l3c
one sig at1_33 extends at1{} {x=30 y=40} //do at location l3e
one sig at2_24 extends at2{} {x=20 y=60} //do at location l2g
one sig at1Rock_25 extends at1Rock{} {x=30 y=0} //do at location l3a
one sig at1_35 extends at1{} {x=30 y=50} //do at location l3f
one sig at1_37 extends at1{} {x=30 y=60} //do at location l3g
one sig at1_17 extends at1{} {x=20 y=30} //do at location l2d
one sig at1_19 extends at1{} {x=20 y=40} //do at location l2e
one sig at1Rock_1 extends at1Rock{} {x=10 y=20} //do at location l1c
one sig at2Rock_2 extends at2Rock{} {x=10 y=20} //do at location l1c
one sig at1Reef_3 extends at1Reef{} {x=10 y=30} //do at location l1d
one sig at1Reef_15 extends at1Reef{} {x=20 y=20} //do at location l2c
one sig at1Reef_7 extends at1Reef{} {x=10 y=50} //do at location l1f
one sig at2Reef_16 extends at2Reef{} {x=20 y=20} //do at location l2c
one sig at1Reef_5 extends at1Reef{} {x=10 y=40} //do at location l1e
one sig at2_10 extends at2{} {x=10 y=60} //do at location l1g
one sig at2_32 extends at2{} {x=30 y=30} //do at location l3d

// ----------------PREDICATE:

pred TaskAllocation{
}

// ----------------CONSTRAINTS:

 fact{ all r:r3| all c:r.capability | all do:c.do | do.y>5}
 fact { no r:r1 | #(r.capability.do ) > 16}
 fact { no r:r2 | #(r.capability.do ) > 16}
 fact { no r:r3 | #(r.capability.do ) > 16}

// ----------------RUN COMMAND:

run TaskAllocation for
7 Int, 16 Capability, exactly 38 AtomicTask, 3 Robot