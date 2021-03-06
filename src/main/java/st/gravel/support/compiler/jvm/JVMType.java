package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.JVMNode;
import st.gravel.support.compiler.jvm.JVMNode.JVMNode_Factory;
import st.gravel.support.compiler.jvm.JVMNodeVisitor;
import st.gravel.support.compiler.jvm.CastTo;
import st.gravel.support.compiler.jvm.JVMArrayType;
import st.gravel.support.compiler.jvm.JVMDynamicObjectType;
import st.gravel.support.compiler.jvm.JVMBooleanType;
import st.gravel.support.compiler.jvm.JVMByteType;
import st.gravel.support.compiler.jvm.JVMCharType;
import st.gravel.support.compiler.jvm.JVMDefinedObjectType;
import st.gravel.support.compiler.jvm.JVMFloatType;
import st.gravel.support.compiler.jvm.JVMIntType;
import st.gravel.support.compiler.jvm.JVMLongType;
import st.gravel.support.compiler.jvm.JVMShortType;

abstract public class JVMType extends JVMNode implements Cloneable {

	public static JVMType_Factory factory = new JVMType_Factory();

	public static class JVMType_Factory extends JVMNode_Factory {

		public JVMType basicNew() {
			throw new RuntimeException("JVMType is an abstract class");
		}
	}

	@Override
	public <X> X accept_(final JVMNodeVisitor<X> _visitor) {
		return _visitor.visitJVMType_(this);
	}

	public CastTo castNotSupported() {
		throw new RuntimeException("Cast not supported");
	}

	public JVMType commonSuperTypeWithArray_(final JVMArrayType _aJVMArrayType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithBoolean_(final JVMBooleanType _aJVMBooleanType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithByte_(final JVMByteType _aJVMByteType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithChar_(final JVMCharType _aJVMCharType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithDefined_(final JVMDefinedObjectType _aJVMDefinedObjectType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithFloat_(final JVMFloatType _aJVMFloatType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithInt_(final JVMIntType _aJVMIntType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithLong_(final JVMLongType _aJVMLongType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public JVMType commonSuperTypeWithShort_(final JVMShortType _aJVMShortType) {
		return JVMDynamicObjectType.factory.basicNew();
	}

	public abstract JVMType commonSuperTypeWith_(final JVMType _aJVMType);

	public JVMType copy() {
		try {
			JVMType _temp1 = (JVMType) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public JVMType descriptorOn_(final StringBuilder _aStream) {
		return this;
	}

	public String descriptorString() {
		final StringBuilder _aStream;
		_aStream = st.gravel.support.jvm.WriteStreamFactory.on_(new String());
		this.descriptorOn_(_aStream);
		return _aStream.toString();
	}

	public boolean equals(final Object _anObject) {
		if (!(this.getClass() == _anObject.getClass())) {
			return false;
		}
		return true;
	}

	public JVMType_Factory factory() {
		return factory;
	}

	public int hashCode() {
		return (this.factory() == null ? 0 : this.factory().hashCode());
	}

	public boolean isArrayType() {
		return false;
	}

	public boolean isBooleanType() {
		return false;
	}

	public boolean isBottomType() {
		return false;
	}

	public boolean isByteType() {
		return false;
	}

	public boolean isCharType() {
		return false;
	}

	public boolean isCoerceableByteType() {
		return false;
	}

	public boolean isDefinedType() {
		return false;
	}

	public boolean isDynamicObjectType() {
		return false;
	}

	public boolean isFloatType() {
		return false;
	}

	public boolean isIntType() {
		return false;
	}

	public boolean isLongType() {
		return false;
	}

	public boolean isObjectType() {
		return false;
	}

	public boolean isVoidType() {
		return false;
	}

	public CastTo newCastInstructionFromArray_(final JVMArrayType _aJVMArrayType) {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromBoolean() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromByte() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromChar() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromDefinedObject_(final JVMDefinedObjectType _anObject) {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromDynamicObject() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromFloat() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromInt() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromLong() {
		return this.castNotSupported();
	}

	public CastTo newCastInstructionFromShort() {
		return this.castNotSupported();
	}

	public abstract CastTo newCastInstructionTo_(final JVMType _aJVMType);

	@Override
	public JVMType printOn_(final StringBuilder _aStream) {
		this.sourceOn_(_aStream);
		return this;
	}

	@Override
	public JVMType sourceOn_(final StringBuilder _aStream) {
		_aStream.append(st.gravel.core.Symbol.value(this.getClass().getSimpleName()));
		return this;
	}
}
