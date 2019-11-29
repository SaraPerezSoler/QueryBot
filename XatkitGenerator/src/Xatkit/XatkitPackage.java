/**
 */
package Xatkit;

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
 * @see Xatkit.XatkitFactory
 * @model kind="package"
 * @generated
 */
public interface XatkitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Xatkit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Xatkit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Xatkit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XatkitPackage eINSTANCE = Xatkit.impl.XatkitPackageImpl.init();

	/**
	 * The meta object id for the '{@link Xatkit.impl.XatkitBotImpl <em>Bot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.XatkitBotImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getXatkitBot()
	 * @generated
	 */
	int XATKIT_BOT = 0;

	/**
	 * The feature id for the '<em><b>Intents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATKIT_BOT__INTENTS = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATKIT_BOT__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Default Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATKIT_BOT__DEFAULT_ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATKIT_BOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATKIT_BOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.EntityImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.IntentImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.MappingImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ENTRIES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.CompositeImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Complex Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPLEX_ENTRIES = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.EntryImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__SYNONYMS = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.ComplexEntryImpl <em>Complex Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.ComplexEntryImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getComplexEntry()
	 * @generated
	 */
	int COMPLEX_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY__LITERALS = 1;

	/**
	 * The number of structural features of the '<em>Complex Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Complex Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.DefaultEntityImpl <em>Default Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.DefaultEntityImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getDefaultEntity()
	 * @generated
	 */
	int DEFAULT_ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Default Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.InputImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 8;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.IntToEntityImpl <em>Int To Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.IntToEntityImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getIntToEntity()
	 * @generated
	 */
	int INT_TO_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_ENTITY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_ENTITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Int To Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Int To Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.IntToStringImpl <em>Int To String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.IntToStringImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getIntToString()
	 * @generated
	 */
	int INT_TO_STRING = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_STRING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_STRING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Int To String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Int To String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_STRING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Xatkit.XatkitBot <em>Bot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bot</em>'.
	 * @see Xatkit.XatkitBot
	 * @generated
	 */
	EClass getXatkitBot();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.XatkitBot#getIntents <em>Intents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intents</em>'.
	 * @see Xatkit.XatkitBot#getIntents()
	 * @see #getXatkitBot()
	 * @generated
	 */
	EReference getXatkitBot_Intents();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.XatkitBot#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see Xatkit.XatkitBot#getEntities()
	 * @see #getXatkitBot()
	 * @generated
	 */
	EReference getXatkitBot_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.XatkitBot#getDefaultEntities <em>Default Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Entities</em>'.
	 * @see Xatkit.XatkitBot#getDefaultEntities()
	 * @see #getXatkitBot()
	 * @generated
	 */
	EReference getXatkitBot_DefaultEntities();

	/**
	 * Returns the meta object for class '{@link Xatkit.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see Xatkit.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Xatkit.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link Xatkit.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent</em>'.
	 * @see Xatkit.Intent
	 * @generated
	 */
	EClass getIntent();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.Intent#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see Xatkit.Intent#getInputs()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_Inputs();

	/**
	 * Returns the meta object for class '{@link Xatkit.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see Xatkit.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.Mapping#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see Xatkit.Mapping#getEntries()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Entries();

	/**
	 * Returns the meta object for class '{@link Xatkit.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see Xatkit.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.Composite#getComplexEntries <em>Complex Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Entries</em>'.
	 * @see Xatkit.Composite#getComplexEntries()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_ComplexEntries();

	/**
	 * Returns the meta object for class '{@link Xatkit.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see Xatkit.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Xatkit.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Value();

	/**
	 * Returns the meta object for the attribute list '{@link Xatkit.Entry#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonyms</em>'.
	 * @see Xatkit.Entry#getSynonyms()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Synonyms();

	/**
	 * Returns the meta object for class '{@link Xatkit.ComplexEntry <em>Complex Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Entry</em>'.
	 * @see Xatkit.ComplexEntry
	 * @generated
	 */
	EClass getComplexEntry();

	/**
	 * Returns the meta object for the map '{@link Xatkit.ComplexEntry#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entities</em>'.
	 * @see Xatkit.ComplexEntry#getEntities()
	 * @see #getComplexEntry()
	 * @generated
	 */
	EReference getComplexEntry_Entities();

	/**
	 * Returns the meta object for the map '{@link Xatkit.ComplexEntry#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Literals</em>'.
	 * @see Xatkit.ComplexEntry#getLiterals()
	 * @see #getComplexEntry()
	 * @generated
	 */
	EReference getComplexEntry_Literals();

	/**
	 * Returns the meta object for class '{@link Xatkit.DefaultEntity <em>Default Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Entity</em>'.
	 * @see Xatkit.DefaultEntity
	 * @generated
	 */
	EClass getDefaultEntity();

	/**
	 * Returns the meta object for class '{@link Xatkit.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see Xatkit.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Int To Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int To Entity</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject" keyRequired="true"
	 *        valueType="Xatkit.Entity" valueRequired="true"
	 * @generated
	 */
	EClass getIntToEntity();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToEntity()
	 * @generated
	 */
	EAttribute getIntToEntity_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToEntity()
	 * @generated
	 */
	EReference getIntToEntity_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Int To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int To String</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject" keyRequired="true"
	 *        keyAnnotation="@CointainerVARInttostring"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getIntToString();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToString()
	 * @generated
	 */
	EAttribute getIntToString_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToString()
	 * @generated
	 */
	EAttribute getIntToString_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XatkitFactory getXatkitFactory();

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
		 * The meta object literal for the '{@link Xatkit.impl.XatkitBotImpl <em>Bot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.XatkitBotImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getXatkitBot()
		 * @generated
		 */
		EClass XATKIT_BOT = eINSTANCE.getXatkitBot();

		/**
		 * The meta object literal for the '<em><b>Intents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XATKIT_BOT__INTENTS = eINSTANCE.getXatkitBot_Intents();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XATKIT_BOT__ENTITIES = eINSTANCE.getXatkitBot_Entities();

		/**
		 * The meta object literal for the '<em><b>Default Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XATKIT_BOT__DEFAULT_ENTITIES = eINSTANCE.getXatkitBot_DefaultEntities();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.EntityImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.IntentImpl <em>Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.IntentImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getIntent()
		 * @generated
		 */
		EClass INTENT = eINSTANCE.getIntent();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__INPUTS = eINSTANCE.getIntent_Inputs();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.MappingImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__ENTRIES = eINSTANCE.getMapping_Entries();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.CompositeImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Complex Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__COMPLEX_ENTRIES = eINSTANCE.getComposite_ComplexEntries();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.EntryImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__VALUE = eINSTANCE.getEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__SYNONYMS = eINSTANCE.getEntry_Synonyms();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.ComplexEntryImpl <em>Complex Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.ComplexEntryImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getComplexEntry()
		 * @generated
		 */
		EClass COMPLEX_ENTRY = eINSTANCE.getComplexEntry();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ENTRY__ENTITIES = eINSTANCE.getComplexEntry_Entities();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ENTRY__LITERALS = eINSTANCE.getComplexEntry_Literals();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.DefaultEntityImpl <em>Default Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.DefaultEntityImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getDefaultEntity()
		 * @generated
		 */
		EClass DEFAULT_ENTITY = eINSTANCE.getDefaultEntity();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.InputImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.IntToEntityImpl <em>Int To Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.IntToEntityImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getIntToEntity()
		 * @generated
		 */
		EClass INT_TO_ENTITY = eINSTANCE.getIntToEntity();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TO_ENTITY__KEY = eINSTANCE.getIntToEntity_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INT_TO_ENTITY__VALUE = eINSTANCE.getIntToEntity_Value();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.IntToStringImpl <em>Int To String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.IntToStringImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getIntToString()
		 * @generated
		 */
		EClass INT_TO_STRING = eINSTANCE.getIntToString();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TO_STRING__KEY = eINSTANCE.getIntToString_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TO_STRING__VALUE = eINSTANCE.getIntToString_Value();

	}

} //XatkitPackage
