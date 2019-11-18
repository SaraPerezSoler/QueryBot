/**
 */
package modelInfo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelInfo.ModelInfoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ModelInfoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelInfo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "modelInfo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelInfo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelInfoPackage eINSTANCE = modelInfo.impl.ModelInfoPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelInfo.impl.NLModelImpl <em>NL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelInfo.impl.NLModelImpl
	 * @see modelInfo.impl.ModelInfoPackageImpl#getNLModel()
	 * @generated
	 */
	int NL_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_MODEL__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_MODEL__CLASSES = 2;

	/**
	 * The number of structural features of the '<em>NL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>NL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelInfo.impl.NLElementImpl <em>NL Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelInfo.impl.NLElementImpl
	 * @see modelInfo.impl.ModelInfoPackageImpl#getNLElement()
	 * @generated
	 */
	int NL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ELEMENT__SYNONYMS = 2;

	/**
	 * The number of structural features of the '<em>NL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>NL Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelInfo.impl.NLClassImpl <em>NL Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelInfo.impl.NLClassImpl
	 * @see modelInfo.impl.ModelInfoPackageImpl#getNLClass()
	 * @generated
	 */
	int NL_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS__NAME = NL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS__DESCRIPTION = NL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS__SYNONYMS = NL_ELEMENT__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS__CLASS = NL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS__ID = NL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS__FEATURES = NL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>NL Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS_FEATURE_COUNT = NL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>NL Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_CLASS_OPERATION_COUNT = NL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelInfo.impl.NLFeatureImpl <em>NL Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelInfo.impl.NLFeatureImpl
	 * @see modelInfo.impl.ModelInfoPackageImpl#getNLFeature()
	 * @generated
	 */
	int NL_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_FEATURE__NAME = NL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_FEATURE__DESCRIPTION = NL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_FEATURE__SYNONYMS = NL_ELEMENT__SYNONYMS;

	/**
	 * The number of structural features of the '<em>NL Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_FEATURE_FEATURE_COUNT = NL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NL Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_FEATURE_OPERATION_COUNT = NL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelInfo.impl.NLAttributeImpl <em>NL Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelInfo.impl.NLAttributeImpl
	 * @see modelInfo.impl.ModelInfoPackageImpl#getNLAttribute()
	 * @generated
	 */
	int NL_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ATTRIBUTE__NAME = NL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ATTRIBUTE__DESCRIPTION = NL_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ATTRIBUTE__SYNONYMS = NL_FEATURE__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ATTRIBUTE__ATTRIBUTE = NL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NL Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ATTRIBUTE_FEATURE_COUNT = NL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NL Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_ATTRIBUTE_OPERATION_COUNT = NL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelInfo.impl.NLReferenceImpl <em>NL Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelInfo.impl.NLReferenceImpl
	 * @see modelInfo.impl.ModelInfoPackageImpl#getNLReference()
	 * @generated
	 */
	int NL_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__NAME = NL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__DESCRIPTION = NL_FEATURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__SYNONYMS = NL_FEATURE__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__REFERENCE = NL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__SRC_SYNONYMS = NL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verb</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__VERB = NL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Src Verb</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE__SRC_VERB = NL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>NL Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE_FEATURE_COUNT = NL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>NL Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NL_REFERENCE_OPERATION_COUNT = NL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link modelInfo.NLModel <em>NL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NL Model</em>'.
	 * @see modelInfo.NLModel
	 * @generated
	 */
	EClass getNLModel();

	/**
	 * Returns the meta object for the attribute '{@link modelInfo.NLModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modelInfo.NLModel#getName()
	 * @see #getNLModel()
	 * @generated
	 */
	EAttribute getNLModel_Name();

	/**
	 * Returns the meta object for the reference '{@link modelInfo.NLModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see modelInfo.NLModel#getModel()
	 * @see #getNLModel()
	 * @generated
	 */
	EReference getNLModel_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link modelInfo.NLModel#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see modelInfo.NLModel#getClasses()
	 * @see #getNLModel()
	 * @generated
	 */
	EReference getNLModel_Classes();

	/**
	 * Returns the meta object for class '{@link modelInfo.NLElement <em>NL Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NL Element</em>'.
	 * @see modelInfo.NLElement
	 * @generated
	 */
	EClass getNLElement();

	/**
	 * Returns the meta object for the attribute '{@link modelInfo.NLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modelInfo.NLElement#getName()
	 * @see #getNLElement()
	 * @generated
	 */
	EAttribute getNLElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link modelInfo.NLElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see modelInfo.NLElement#getDescription()
	 * @see #getNLElement()
	 * @generated
	 */
	EAttribute getNLElement_Description();

	/**
	 * Returns the meta object for the attribute list '{@link modelInfo.NLElement#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonyms</em>'.
	 * @see modelInfo.NLElement#getSynonyms()
	 * @see #getNLElement()
	 * @generated
	 */
	EAttribute getNLElement_Synonyms();

	/**
	 * Returns the meta object for class '{@link modelInfo.NLClass <em>NL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NL Class</em>'.
	 * @see modelInfo.NLClass
	 * @generated
	 */
	EClass getNLClass();

	/**
	 * Returns the meta object for the reference '{@link modelInfo.NLClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see modelInfo.NLClass#getClass_()
	 * @see #getNLClass()
	 * @generated
	 */
	EReference getNLClass_Class();

	/**
	 * Returns the meta object for the reference list '{@link modelInfo.NLClass#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Id</em>'.
	 * @see modelInfo.NLClass#getId()
	 * @see #getNLClass()
	 * @generated
	 */
	EReference getNLClass_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link modelInfo.NLClass#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see modelInfo.NLClass#getFeatures()
	 * @see #getNLClass()
	 * @generated
	 */
	EReference getNLClass_Features();

	/**
	 * Returns the meta object for class '{@link modelInfo.NLFeature <em>NL Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NL Feature</em>'.
	 * @see modelInfo.NLFeature
	 * @generated
	 */
	EClass getNLFeature();

	/**
	 * Returns the meta object for class '{@link modelInfo.NLAttribute <em>NL Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NL Attribute</em>'.
	 * @see modelInfo.NLAttribute
	 * @generated
	 */
	EClass getNLAttribute();

	/**
	 * Returns the meta object for the reference '{@link modelInfo.NLAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see modelInfo.NLAttribute#getAttribute()
	 * @see #getNLAttribute()
	 * @generated
	 */
	EReference getNLAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link modelInfo.NLReference <em>NL Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NL Reference</em>'.
	 * @see modelInfo.NLReference
	 * @generated
	 */
	EClass getNLReference();

	/**
	 * Returns the meta object for the reference '{@link modelInfo.NLReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see modelInfo.NLReference#getReference()
	 * @see #getNLReference()
	 * @generated
	 */
	EReference getNLReference_Reference();

	/**
	 * Returns the meta object for the attribute list '{@link modelInfo.NLReference#getSrcSynonyms <em>Src Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Src Synonyms</em>'.
	 * @see modelInfo.NLReference#getSrcSynonyms()
	 * @see #getNLReference()
	 * @generated
	 */
	EAttribute getNLReference_SrcSynonyms();

	/**
	 * Returns the meta object for the attribute list '{@link modelInfo.NLReference#getVerb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Verb</em>'.
	 * @see modelInfo.NLReference#getVerb()
	 * @see #getNLReference()
	 * @generated
	 */
	EAttribute getNLReference_Verb();

	/**
	 * Returns the meta object for the attribute list '{@link modelInfo.NLReference#getSrcVerb <em>Src Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Src Verb</em>'.
	 * @see modelInfo.NLReference#getSrcVerb()
	 * @see #getNLReference()
	 * @generated
	 */
	EAttribute getNLReference_SrcVerb();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelInfoFactory getModelInfoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelInfo.impl.NLModelImpl <em>NL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelInfo.impl.NLModelImpl
		 * @see modelInfo.impl.ModelInfoPackageImpl#getNLModel()
		 * @generated
		 */
		EClass NL_MODEL = eINSTANCE.getNLModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_MODEL__NAME = eINSTANCE.getNLModel_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_MODEL__MODEL = eINSTANCE.getNLModel_Model();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_MODEL__CLASSES = eINSTANCE.getNLModel_Classes();

		/**
		 * The meta object literal for the '{@link modelInfo.impl.NLElementImpl <em>NL Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelInfo.impl.NLElementImpl
		 * @see modelInfo.impl.ModelInfoPackageImpl#getNLElement()
		 * @generated
		 */
		EClass NL_ELEMENT = eINSTANCE.getNLElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_ELEMENT__NAME = eINSTANCE.getNLElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_ELEMENT__DESCRIPTION = eINSTANCE.getNLElement_Description();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_ELEMENT__SYNONYMS = eINSTANCE.getNLElement_Synonyms();

		/**
		 * The meta object literal for the '{@link modelInfo.impl.NLClassImpl <em>NL Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelInfo.impl.NLClassImpl
		 * @see modelInfo.impl.ModelInfoPackageImpl#getNLClass()
		 * @generated
		 */
		EClass NL_CLASS = eINSTANCE.getNLClass();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_CLASS__CLASS = eINSTANCE.getNLClass_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_CLASS__ID = eINSTANCE.getNLClass_Id();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_CLASS__FEATURES = eINSTANCE.getNLClass_Features();

		/**
		 * The meta object literal for the '{@link modelInfo.impl.NLFeatureImpl <em>NL Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelInfo.impl.NLFeatureImpl
		 * @see modelInfo.impl.ModelInfoPackageImpl#getNLFeature()
		 * @generated
		 */
		EClass NL_FEATURE = eINSTANCE.getNLFeature();

		/**
		 * The meta object literal for the '{@link modelInfo.impl.NLAttributeImpl <em>NL Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelInfo.impl.NLAttributeImpl
		 * @see modelInfo.impl.ModelInfoPackageImpl#getNLAttribute()
		 * @generated
		 */
		EClass NL_ATTRIBUTE = eINSTANCE.getNLAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getNLAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link modelInfo.impl.NLReferenceImpl <em>NL Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelInfo.impl.NLReferenceImpl
		 * @see modelInfo.impl.ModelInfoPackageImpl#getNLReference()
		 * @generated
		 */
		EClass NL_REFERENCE = eINSTANCE.getNLReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NL_REFERENCE__REFERENCE = eINSTANCE.getNLReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Src Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_REFERENCE__SRC_SYNONYMS = eINSTANCE.getNLReference_SrcSynonyms();

		/**
		 * The meta object literal for the '<em><b>Verb</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_REFERENCE__VERB = eINSTANCE.getNLReference_Verb();

		/**
		 * The meta object literal for the '<em><b>Src Verb</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NL_REFERENCE__SRC_VERB = eINSTANCE.getNLReference_SrcVerb();

	}

} //ModelInfoPackage
