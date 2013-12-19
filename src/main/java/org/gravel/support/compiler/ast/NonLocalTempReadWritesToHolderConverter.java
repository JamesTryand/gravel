package org.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import org.gravel.support.jvm.NonLocalReturn;
import org.gravel.support.compiler.ast.NonLocalTempAccessToHolderConverter;
import org.gravel.support.compiler.ast.NonLocalTempAccessToHolderConverter.NonLocalTempAccessToHolderConverter_Factory;
import org.gravel.support.compiler.ast.VariableScopeAnalyzerState;
import java.util.HashMap;

public class NonLocalTempReadWritesToHolderConverter extends NonLocalTempAccessToHolderConverter implements Cloneable {

	public static NonLocalTempReadWritesToHolderConverter_Factory factory = new NonLocalTempReadWritesToHolderConverter_Factory();

	public static class NonLocalTempReadWritesToHolderConverter_Factory extends NonLocalTempAccessToHolderConverter_Factory {

		public NonLocalTempReadWritesToHolderConverter basicNew() {
			NonLocalTempReadWritesToHolderConverter newInstance = new NonLocalTempReadWritesToHolderConverter();
			newInstance.initialize();
			return newInstance;
		}

		@Override
		public NonLocalTempReadWritesToHolderConverter parent_(final NonLocalTempAccessToHolderConverter _aVariableScopeAnalyzer) {
			return ((NonLocalTempReadWritesToHolderConverter) this.basicNew().initializeParent_(_aVariableScopeAnalyzer));
		}
	}

	static public NonLocalTempReadWritesToHolderConverter _parent_(Object receiver, final NonLocalTempAccessToHolderConverter _aVariableScopeAnalyzer) {
		return factory.parent_(_aVariableScopeAnalyzer);
	}

	@Override
	public NonLocalTempReadWritesToHolderConverter addBlockVariableRead_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempReadWritesToHolderConverter.this;
			}
			_parent.addBlockVariableRead_(_aString);
			return NonLocalTempReadWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withBlockRead());
		return this;
	}

	@Override
	public NonLocalTempReadWritesToHolderConverter addBlockVariableWrite_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempReadWritesToHolderConverter.this;
			}
			_parent.addBlockVariableWrite_(_aString);
			return NonLocalTempReadWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withBlockWrite());
		return this;
	}

	@Override
	public NonLocalTempReadWritesToHolderConverter addVariableRead_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempReadWritesToHolderConverter.this;
			}
			_parent.addBlockVariableRead_(_aString);
			return NonLocalTempReadWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withLocalRead());
		return this;
	}

	@Override
	public NonLocalTempReadWritesToHolderConverter addVariableWrite_(final String _aString) {
		if (!_temps.containsKey(_aString)) {
			if (_parent == null) {
				return NonLocalTempReadWritesToHolderConverter.this;
			}
			_parent.addBlockVariableWrite_(_aString);
			return NonLocalTempReadWritesToHolderConverter.this;
		}
		_temps.put(_aString, _temps.get(_aString).withLocalWrite());
		return this;
	}

	public NonLocalTempReadWritesToHolderConverter copy() {
		try {
			NonLocalTempReadWritesToHolderConverter _temp1 = (NonLocalTempReadWritesToHolderConverter) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public NonLocalTempReadWritesToHolderConverter_Factory factory() {
		return factory;
	}

	@Override
	public NonLocalTempReadWritesToHolderConverter initialize() {
		super.initialize();
		_temps = new java.util.HashMap<String, VariableScopeAnalyzerState>();
		return this;
	}

	@Override
	public NonLocalTempReadWritesToHolderConverter initializeParent_(final NonLocalTempAccessToHolderConverter _aVariableScopeAnalyzer) {
		_parent = _aVariableScopeAnalyzer;
		this.initialize();
		return this;
	}

	@Override
	public boolean needsRewrite_(final VariableScopeAnalyzerState _state) {
		return _state.isUndecided() || _state.isBlockReadAfterWritten();
	}
}