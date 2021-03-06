package st.gravel.support.compiler.jvm;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.jvm.WhileIntCompLoop;
import st.gravel.support.compiler.jvm.WhileIntCompLoop.WhileIntCompLoop_Factory;
import st.gravel.support.compiler.jvm.JVMInstructionVisitor;
import st.gravel.support.compiler.jvm.Frame;
import st.gravel.support.compiler.jvm.JVMType;

public class WhileLessThanLoop extends WhileIntCompLoop implements Cloneable {

	public static WhileLessThanLoop_Factory factory = new WhileLessThanLoop_Factory();

	public static class WhileLessThanLoop_Factory extends WhileIntCompLoop_Factory {

		public WhileLessThanLoop basicNew() {
			WhileLessThanLoop newInstance = new WhileLessThanLoop();
			newInstance.initialize();
			return newInstance;
		}
	}

	@Override
	public <X> X accept_(final JVMInstructionVisitor<X> _visitor) {
		return _visitor.visitWhileLessThanLoop_(this);
	}

	public WhileLessThanLoop copy() {
		try {
			WhileLessThanLoop _temp1 = (WhileLessThanLoop) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public WhileLessThanLoop_Factory factory() {
		return factory;
	}

	@Override
	public WhileLessThanLoop initializeTestFrame_doFrame_(final Frame _aFrame, final Frame _aFrame2) {
		_testFrame = _aFrame;
		_doFrame = _aFrame2;
		this.initialize();
		return this;
	}

	@Override
	public WhileLessThanLoop printOn_(final StringBuilder _aStream) {
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
	public WhileLessThanLoop sourceOn_(final StringBuilder _aStream) {
		return this;
	}

	@Override
	public WhileLessThanLoop withReturnType_(final JVMType _aType) {
		if (st.gravel.support.jvm.ObjectExtensions.equals_(this.type(), _aType)) {
			return WhileLessThanLoop.this;
		}
		throw new RuntimeException("niy");
	}
}
