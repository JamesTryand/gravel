package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.NewClassDiff;
import st.gravel.support.compiler.ast.NewClassDiff.NewClassDiff_Factory;
import st.gravel.support.compiler.ast.ClassNode;
import st.gravel.support.compiler.ast.DiffVisitor;

public class AddClassDiff extends NewClassDiff implements Cloneable {

	public static AddClassDiff_Factory factory = new AddClassDiff_Factory();

	boolean _isStatic;

	public static class AddClassDiff_Factory extends NewClassDiff_Factory {

		public AddClassDiff basicNew() {
			AddClassDiff newInstance = new AddClassDiff();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public AddClassDiff classNode_(final ClassNode _aClassNode) {
			return ((AddClassDiff) this.basicNew().initializeClassNode_(_aClassNode));
		}
	}

	static public AddClassDiff _classNode_(Object receiver, final ClassNode _aClassNode) {
		return factory.classNode_(_aClassNode);
	}

	@Override
	public DiffVisitor accept_(final DiffVisitor _visitor) {
		return _visitor.visitAddClassDiff_(this);
	}

	@Override
	public AddClassDiff beStatic() {
		_isStatic = true;
		return this;
	}

	public AddClassDiff copy() {
		try {
			AddClassDiff _temp1 = (AddClassDiff) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public AddClassDiff_Factory factory() {
		return factory;
	}

	@Override
	public AddClassDiff initialize() {
		super.initialize();
		_isStatic = this.isStaticDefault();
		return this;
	}

	@Override
	public AddClassDiff initializeClassNode_(final ClassNode _aClassNode) {
		_classNode = _aClassNode;
		this.initialize();
		return this;
	}

	@Override
	public boolean isStatic() {
		return _isStatic;
	}

	@Override
	public boolean isStaticDefault() {
		return (_classNode != null) && _classNode.isNilClass();
	}
}