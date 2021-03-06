package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.Statement;
import st.gravel.support.compiler.ast.Statement.Statement_Factory;
import st.gravel.support.compiler.ast.NodeVisitor;
import st.gravel.support.compiler.ast.UnaryMessageNode;
import st.gravel.support.compiler.ast.MessageNode;
import st.gravel.support.compiler.ast.Node;
import st.gravel.support.compiler.ast.SourcePrinter;
import st.gravel.support.compiler.ast.SourcePosition;

abstract public class Expression extends Statement implements Cloneable {

	public static Expression_Factory factory = new Expression_Factory();

	public static class Expression_Factory extends Statement_Factory {

		public Expression basicNew() {
			throw new RuntimeException("Expression is an abstract class");
		}
	}

	@Override
	public <X> X accept_(final NodeVisitor<X> _visitor) {
		return _visitor.visitExpression_(this);
	}

	@Override
	public Expression allNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				return _each.withAllNodesDo_(_aBlock);
			}
		});
		return this;
	}

	@Override
	public Expression allNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		this.nodesDo_(new st.gravel.support.jvm.Block1<Object, Node>() {

			@Override
			public Object value_(final Node _each) {
				if (!_pruneBlock.value_(_each)) {
					return _each.withAllNodesDo_pruneWhere_(_aBlock, _pruneBlock);
				}
				return Expression.this;
			}
		});
		return this;
	}

	public Expression copy() {
		try {
			Expression _temp1 = (Expression) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public Expression_Factory factory() {
		return factory;
	}

	@Override
	public abstract Expression innerSourceOn_(final StringBuilder _aStream);

	@Override
	public Expression localVarNamesDo_(final st.gravel.support.jvm.Block1<Object, String> _aBlock) {
		return this;
	}

	public boolean needsBrackets() {
		return true;
	}

	@Override
	public abstract Expression nodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock);

	public abstract int precedence();

	@Override
	public Expression prettySourceOn_(final StringBuilder _aStream) {
		SourcePrinter.factory.on_(_aStream).visit_(this);
		return this;
	}

	@Override
	public Expression printOn_(final StringBuilder _aStream) {
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
	public Expression pvtSetSourcePosition_(final SourcePosition _aSourcePosition) {
		_sourcePosition = _aSourcePosition;
		return this;
	}

	public UnaryMessageNode send_(final String _aSelector) {
		return UnaryMessageNode.factory.receiver_selector_(this, _aSelector);
	}

	public Expression send_withAll_(final String _aSymbol, final Expression[] _anArray) {
		return MessageNode.factory.receiver_selector_arguments_(this, _aSymbol, _anArray);
	}

	public Expression send_with_(final String _aSymbol, final Expression _argNode1) {
		return this.send_withAll_(_aSymbol, st.gravel.support.jvm.ArrayFactory.with_(_argNode1));
	}

	public Expression send_with_with_(final String _aSymbol, final Expression _argNode1, final Expression _argNode2) {
		return this.send_withAll_(_aSymbol, st.gravel.support.jvm.ArrayFactory.with_with_(_argNode1, _argNode2));
	}

	public Expression send_with_with_with_(final String _aSymbol, final Expression _argNode1, final Expression _argNode2, final Expression _argNode3) {
		return this.send_withAll_(_aSymbol, st.gravel.support.jvm.ArrayFactory.with_with_with_(_argNode1, _argNode2, _argNode3));
	}

	@Override
	public Expression sourceOn_(final StringBuilder _aStream) {
		if (!this.needsBrackets()) {
			return Expression.this.innerSourceOn_(_aStream);
		}
		_aStream.append('(');
		this.innerSourceOn_(_aStream);
		_aStream.append(')');
		return this;
	}

	@Override
	public Expression withAllNodesDo_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock) {
		_aBlock.value_(this);
		this.allNodesDo_(_aBlock);
		return this;
	}

	@Override
	public Expression withAllNodesDo_pruneWhere_(final st.gravel.support.jvm.Block1<Object, Node> _aBlock, final st.gravel.support.jvm.Block1<Boolean, Node> _pruneBlock) {
		_aBlock.value_(this);
		this.allNodesDo_pruneWhere_(_aBlock, _pruneBlock);
		return this;
	}

	@Override
	public Expression withSourcePosition_(final SourcePosition _aSourcePosition) {
		if (_sourcePosition == _aSourcePosition) {
			return Expression.this;
		}
		return this.copy().pvtSetSourcePosition_(_aSourcePosition);
	}
}
