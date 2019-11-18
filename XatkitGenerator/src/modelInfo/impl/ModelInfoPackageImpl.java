/**
 */
package modelInfo.impl;

import modelInfo.ModelInfoFactory;
import modelInfo.ModelInfoPackage;
import modelInfo.NLAttribute;
import modelInfo.NLClass;
import modelInfo.NLElement;
import modelInfo.NLFeature;
import modelInfo.NLModel;
import modelInfo.NLReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelInfoPackageImpl extends EPackageImpl implements ModelInfoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nlReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modelInfo.ModelInfoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelInfoPackageImpl() {
		super(eNS_URI, ModelInfoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelInfoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelInfoPackage init() {
		if (isInited) return (ModelInfoPackage)EPackage.Registry.INSTANCE.getEPackage(ModelInfoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelInfoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelInfoPackageImpl theModelInfoPackage = registeredModelInfoPackage instanceof ModelInfoPackageImpl ? (ModelInfoPackageImpl)registeredModelInfoPackage : new ModelInfoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelInfoPackage.createPackageContents();

		// Initialize created meta-data
		theModelInfoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelInfoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelInfoPackage.eNS_URI, theModelInfoPackage);
		return theModelInfoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNLModel() {
		return nlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLModel_Name() {
		return (EAttribute)nlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLModel_Model() {
		return (EReference)nlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLModel_Classes() {
		return (EReference)nlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNLElement() {
		return nlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLElement_Name() {
		return (EAttribute)nlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLElement_Description() {
		return (EAttribute)nlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLElement_Synonyms() {
		return (EAttribute)nlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNLClass() {
		return nlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLClass_Class() {
		return (EReference)nlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLClass_Id() {
		return (EReference)nlClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLClass_Features() {
		return (EReference)nlClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNLFeature() {
		return nlFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNLAttribute() {
		return nlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLAttribute_Attribute() {
		return (EReference)nlAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNLReference() {
		return nlReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNLReference_Reference() {
		return (EReference)nlReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLReference_SrcSynonyms() {
		return (EAttribute)nlReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLReference_Verb() {
		return (EAttribute)nlReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNLReference_SrcVerb() {
		return (EAttribute)nlReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelInfoFactory getModelInfoFactory() {
		return (ModelInfoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nlModelEClass = createEClass(NL_MODEL);
		createEAttribute(nlModelEClass, NL_MODEL__NAME);
		createEReference(nlModelEClass, NL_MODEL__MODEL);
		createEReference(nlModelEClass, NL_MODEL__CLASSES);

		nlElementEClass = createEClass(NL_ELEMENT);
		createEAttribute(nlElementEClass, NL_ELEMENT__NAME);
		createEAttribute(nlElementEClass, NL_ELEMENT__DESCRIPTION);
		createEAttribute(nlElementEClass, NL_ELEMENT__SYNONYMS);

		nlClassEClass = createEClass(NL_CLASS);
		createEReference(nlClassEClass, NL_CLASS__CLASS);
		createEReference(nlClassEClass, NL_CLASS__ID);
		createEReference(nlClassEClass, NL_CLASS__FEATURES);

		nlFeatureEClass = createEClass(NL_FEATURE);

		nlAttributeEClass = createEClass(NL_ATTRIBUTE);
		createEReference(nlAttributeEClass, NL_ATTRIBUTE__ATTRIBUTE);

		nlReferenceEClass = createEClass(NL_REFERENCE);
		createEReference(nlReferenceEClass, NL_REFERENCE__REFERENCE);
		createEAttribute(nlReferenceEClass, NL_REFERENCE__SRC_SYNONYMS);
		createEAttribute(nlReferenceEClass, NL_REFERENCE__VERB);
		createEAttribute(nlReferenceEClass, NL_REFERENCE__SRC_VERB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nlClassEClass.getESuperTypes().add(this.getNLElement());
		nlFeatureEClass.getESuperTypes().add(this.getNLElement());
		nlAttributeEClass.getESuperTypes().add(this.getNLFeature());
		nlReferenceEClass.getESuperTypes().add(this.getNLFeature());

		// Initialize classes, features, and operations; add parameters
		initEClass(nlModelEClass, NLModel.class, "NLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNLModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, NLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNLModel_Model(), ecorePackage.getEPackage(), null, "model", null, 1, 1, NLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNLModel_Classes(), this.getNLClass(), null, "classes", null, 1, -1, NLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nlElementEClass, NLElement.class, "NLElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNLElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNLElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, NLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNLElement_Synonyms(), ecorePackage.getEString(), "synonyms", null, 0, -1, NLElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nlClassEClass, NLClass.class, "NLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNLClass_Class(), ecorePackage.getEClass(), null, "class", null, 1, 1, NLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNLClass_Id(), this.getNLAttribute(), null, "id", null, 1, -1, NLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNLClass_Features(), this.getNLFeature(), null, "features", null, 1, -1, NLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nlFeatureEClass, NLFeature.class, "NLFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nlAttributeEClass, NLAttribute.class, "NLAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNLAttribute_Attribute(), ecorePackage.getEAttribute(), null, "attribute", null, 1, 1, NLAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nlReferenceEClass, NLReference.class, "NLReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNLReference_Reference(), ecorePackage.getEReference(), null, "reference", null, 1, 1, NLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNLReference_SrcSynonyms(), ecorePackage.getEString(), "srcSynonyms", null, 0, -1, NLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNLReference_Verb(), ecorePackage.getEString(), "verb", null, 0, -1, NLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNLReference_SrcVerb(), ecorePackage.getEString(), "srcVerb", null, 0, -1, NLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //ModelInfoPackageImpl
