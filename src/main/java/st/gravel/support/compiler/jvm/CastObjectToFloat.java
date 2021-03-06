package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.CastTo;
import st.gravel.support.compiler.jvm.CastTo.CastTo_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.JVMStack;
import st.gravel.support.compiler.jvm.JVMInstruction;
import st.gravel.support.compiler.jvm.JVMType;
import st.gravel.support.compiler.jvm.JVMFloatType;

public class CastObjectToFloat extends CastTo implements Cloneable {

	public static CastObjectToFloat_Factory factory = new CastObjectToFloat_Factory();

	public static class CastObjectToFloat_Factory extends CastTo_Factory {

		public CastObjectToFloat basicNew() {
			CastObjectToFloat newInstance = new CastObjectToFloat();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitCastObjectToFloat_(this);
	}

	public CastObjectToFloat copy() {
		try {
			CastObjectToFloat _temp1 = (CastObjectToFloat) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public JVMInstruction effectStack_(final JVMStack _aJVMStack) {
		st.gravel.support.jvm.ObjectExtensions.assert_(this, _aJVMStack.pop().isObjectType());
		_aJVMStack.push_(this.type());
		return this;
	}

	public CastObjectToFloat_Factory factory() {
		return factory;
	}

	@Override
	public CastObjectToFloat printOn_(final StringBuilder _aStream) {
		final String _title;
		_title = this.factory().toString();
		_aStream.append(st.gravel.support.jvm.CharacterExtensions.isVowel(_title.charAt(0)) ? "an " : "a ");
		_aStream.append(_title);
		_aStream.append('[');
		this.sourceOn_(_aStream);
		_aStream.append(']');
		return this;
	}

	@Override
	public CastObjectToFloat sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public JVMType type() {
		return JVMFloatType.factory.basicNew();
	}

	@Override
	public CastObjectToFloat withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return CastObjectToFloat.this;
		}
		throw new RuntimeException("niy");
	}
}
