package st.gravel.support.compiler.ast;

/*
	This file is automatically generated from typed smalltalk source. Do not edit by hand.
	(C) AG5.com
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import st.gravel.support.jvm.NonLocalReturn;
import st.gravel.support.compiler.ast.Producer;
import st.gravel.support.compiler.ast.Producer.Producer_Factory;
import java.util.Map;
import st.gravel.support.compiler.ast.VariableDeclarationNode;
import st.gravel.support.compiler.ast.SharedDeclarationNode;
import st.gravel.support.compiler.ast.MethodNode;
import st.gravel.support.compiler.ast.TraitUsageNode;
import st.gravel.support.compiler.ast.ClassNode;
import st.gravel.support.compiler.ast.SourceFile;
import st.gravel.support.compiler.ast.Parser;

public class ClassProducer extends Producer implements Cloneable {

	public static ClassProducer_Factory factory = new ClassProducer_Factory();

	public static class ClassProducer_Factory extends Producer_Factory {

		public ClassProducer basicNew() {
			ClassProducer newInstance = new ClassProducer();
			newInstance.initialize();
			return newInstance;
		}
	}

	public ClassProducer copy() {
		try {
			ClassProducer _temp1 = (ClassProducer) this.clone();
			_temp1.postCopy();
			return _temp1;
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	public ClassProducer_Factory factory() {
		return factory;
	}

	@Override
	public ClassNode produceClass_superclassPath_properties_instVars_classInstVars_sharedVariables_instanceMethods_classMethods_namespace_traitUsage_classTraitUsage_(final String _aString, final String _superclassPath, final Map<String, String> _properties, final VariableDeclarationNode[] _instVars, final VariableDeclarationNode[] _classInstVars, final SharedDeclarationNode[] _sharedVariables, final MethodNode[] _instanceMethods, final MethodNode[] _classMethods, final String[] _anArray, final TraitUsageNode _traitUsage, final TraitUsageNode _classTraitUsage) {
		return ClassNode.factory.name_superclassPath_properties_instVars_classInstVars_sharedVariables_methods_classMethods_namespace_isExtension_isTrait_traitUsage_classTraitUsage_(st.gravel.core.Symbol.value(_aString), _superclassPath, _properties, _instVars, _classInstVars, _sharedVariables, _instanceMethods, _classMethods, st.gravel.support.jvm.ArrayExtensions.collect_(_anArray, ((st.gravel.support.jvm.Block1<st.gravel.core.Symbol, String>) (new st.gravel.support.jvm.Block1<st.gravel.core.Symbol, String>() {

			@Override
			public st.gravel.core.Symbol value_(final String _str) {
				return (st.gravel.core.Symbol) st.gravel.core.Symbol.value(_str);
			}
		}))), false, false, _traitUsage, _classTraitUsage);
	}

	@Override
	public MethodNode produceMethod_sourceFile_namespace_(final String _aString, final SourceFile _sourceFile, final String[] _anArray) {
		return Parser.factory.parseMethod_sourceFile_(_aString, _sourceFile);
	}

	@Override
	public VariableDeclarationNode produceVariableDeclaration_type_(final String _name, final String _type) {
		if (_type == null) {
			return VariableDeclarationNode.factory.name_(_name);
		}
		return VariableDeclarationNode.factory.name_type_(_name, Parser.factory.parseTypeNode_(_type));
	}
}