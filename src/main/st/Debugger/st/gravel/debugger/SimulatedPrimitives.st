(reader defineClass: 'SimulatedPrimitives' superclass: 'st.gravel.lang.Object')
!
(reader addInstVar: 'type')
!
(reader addMethod: 'initialize-release')
!
initializeType: aJVMDefinedObjectType
	type := aJVMDefinedObjectType.
	self initialize
!
(reader addMethod: 'As yet unclassified')
!
invokeStatic: aString
	^PrimitiveMethodContext simPrefix: self simPrefix name: aString
!
(reader addMethod: 'As yet unclassified')
!
isSimulatedPrimitives
	^true
!
(reader addMethod: 'As yet unclassified')
!
methodNamed: aString ifAbsent: aBlock
	^aBlock value
!
(reader addMethod: 'As yet unclassified')
!
simPrefix
	^type path last
!
(reader addMethod: 'accessing')
!
type
	^type
!
(reader addClassMethod: 'instance creation')
!
type: aJVMDefinedObjectType
	^self new initializeType: aJVMDefinedObjectType
!
