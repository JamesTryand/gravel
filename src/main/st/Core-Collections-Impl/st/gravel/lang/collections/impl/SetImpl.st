(reader defineClass: 'SetImpl' superclass: 'st.gravel.lang.collections.impl.HashedCollection')
!
(reader addSimpleTrait: 'st.gravel.lang.collections.interface.Set')
!
(reader addSimpleClassTrait: 'st.gravel.lang.collections.interface.Set class')
!
(reader addMethod: 'comparing')
!
= aSet
	self == aSet ifTrue: [^true].
	(aSet isKindOf: Set) ifFalse: [^false].
	self size = aSet size ifFalse: [^false].
	self do: [:each | (aSet includes: each) ifFalse: [^false]].
	^true
!
(reader addMethod: 'adding')
!
add: newObject
	| index |
	index := self scanFor: newObject.
	(array at: index) ifNil: [self atNewIndex: index put: newObject].
	^newObject
!
(reader addMethod: 'enumerating')
!
collect: aBlock
	| newSet |
	newSet := Set new: self size.
	self do: [:each | newSet add: (aBlock value: each)].
	^newSet
!
(reader addMethod: 'enumerating')
!
do: aBlock
	tally = 0 ifTrue: [^self].
	1 to: array size
		do: [:index | (array at: index) ifNotNil: [:element | aBlock value: element]]
!
(reader addMethod: 'testing')
!
includes: anObject
	(array at: (self scanFor: anObject)) ifNil: [^false] ifNotNil: [^true]
!
(reader addMethod: 'testing')
!
occurrencesOf: anObject
	^(self includes: anObject) ifTrue: [1] ifFalse: [0]
!
(reader addMethod: 'private')
!
scanFor: anObject
	| index start |
	index := start := anObject hash \\ array size + 1.
	
	[| element |
	((element := array at: index) == nil or: [anObject = element]) ifTrue: [^index].
	(index := index \\ array size + 1) = start]
			whileFalse.
	self errorNoFreeSpace
!
