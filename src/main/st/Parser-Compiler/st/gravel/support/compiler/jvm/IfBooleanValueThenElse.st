(reader defineClass: 'IfBooleanValueThenElse' superclass: 'st.gravel.support.compiler.jvm.IfThenElse')
!
(reader addMethod: 'visitor')
!
accept: visitor {JVMInstructionVisitor[X def]} {^X}
	^visitor visitIfBooleanValueThenElse: self
!
