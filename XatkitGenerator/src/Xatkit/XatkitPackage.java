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
	 * The meta object id for the '{@link Xatkit.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.ElementImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.EntityImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.IntentImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__INPUTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__CONTEXT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__REQUIRES = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.MappingImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 4;

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
	int COMPOSITE = 5;

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
	int ENTRY = 6;

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
	int COMPLEX_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY__TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Complex Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Complex Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.TokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 8;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__POS = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.ComplexEntryTokenImpl <em>Complex Entry Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.ComplexEntryTokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getComplexEntryToken()
	 * @generated
	 */
	int COMPLEX_ENTRY_TOKEN = 10;

	/**
	 * The meta object id for the '{@link Xatkit.impl.LiteralCETokenImpl <em>Literal CE Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.LiteralCETokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getLiteralCEToken()
	 * @generated
	 */
	int LITERAL_CE_TOKEN = 11;

	/**
	 * The meta object id for the '{@link Xatkit.impl.EntityTokenImpl <em>Entity Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.EntityTokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getEntityToken()
	 * @generated
	 */
	int ENTITY_TOKEN = 12;

	/**
	 * The meta object id for the '{@link Xatkit.impl.LiteralTokenImpl <em>Literal Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.LiteralTokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getLiteralToken()
	 * @generated
	 */
	int LITERAL_TOKEN = 9;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TOKEN__LITERAL = 0;

	/**
	 * The number of structural features of the '<em>Literal Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Literal Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_TOKEN__POS = TOKEN__POS;

	/**
	 * The number of structural features of the '<em>Complex Entry Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Entry Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_ENTRY_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CE_TOKEN__POS = COMPLEX_ENTRY_TOKEN__POS;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CE_TOKEN__LITERAL = COMPLEX_ENTRY_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal CE Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CE_TOKEN_FEATURE_COUNT = COMPLEX_ENTRY_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal CE Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_CE_TOKEN_OPERATION_COUNT = COMPLEX_ENTRY_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TOKEN__POS = COMPLEX_ENTRY_TOKEN__POS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TOKEN__ENTITY = COMPLEX_ENTRY_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TOKEN_FEATURE_COUNT = COMPLEX_ENTRY_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TOKEN_OPERATION_COUNT = COMPLEX_ENTRY_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.DefaultEntityImpl <em>Default Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.DefaultEntityImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getDefaultEntity()
	 * @generated
	 */
	int DEFAULT_ENTITY = 13;

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
	int INPUT = 14;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.InputTokenImpl <em>Input Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.InputTokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getInputToken()
	 * @generated
	 */
	int INPUT_TOKEN = 15;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TOKEN__POS = TOKEN__POS;

	/**
	 * The number of structural features of the '<em>Input Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TOKEN_FEATURE_COUNT = TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TOKEN_OPERATION_COUNT = TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.LiteralInputTokenImpl <em>Literal Input Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.LiteralInputTokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getLiteralInputToken()
	 * @generated
	 */
	int LITERAL_INPUT_TOKEN = 16;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INPUT_TOKEN__LITERAL = LITERAL_TOKEN__LITERAL;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INPUT_TOKEN__POS = LITERAL_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Input Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INPUT_TOKEN_FEATURE_COUNT = LITERAL_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Input Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INPUT_TOKEN_OPERATION_COUNT = LITERAL_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.ParameterTokenImpl <em>Parameter Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.ParameterTokenImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getParameterToken()
	 * @generated
	 */
	int PARAMETER_TOKEN = 17;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TOKEN__POS = INPUT_TOKEN__POS;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TOKEN__PARAMETER = INPUT_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TOKEN_FEATURE_COUNT = INPUT_TOKEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TOKEN_OPERATION_COUNT = INPUT_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.ContextImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARAMETERS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.ParameterImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ENTITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FRAGMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Xatkit.impl.RequireContextImpl <em>Require Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Xatkit.impl.RequireContextImpl
	 * @see Xatkit.impl.XatkitPackageImpl#getRequireContext()
	 * @generated
	 */
	int REQUIRE_CONTEXT = 20;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONTEXT__CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Continue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONTEXT__CONTINUE = 1;

	/**
	 * The number of structural features of the '<em>Require Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Require Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_CONTEXT_OPERATION_COUNT = 0;

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
	 * Returns the meta object for class '{@link Xatkit.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see Xatkit.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Xatkit.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

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
	 * Returns the meta object for the containment reference list '{@link Xatkit.Intent#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see Xatkit.Intent#getContext()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.Intent#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see Xatkit.Intent#getRequires()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_Requires();

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
	 * Returns the meta object for the containment reference list '{@link Xatkit.ComplexEntry#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see Xatkit.ComplexEntry#getTokens()
	 * @see #getComplexEntry()
	 * @generated
	 */
	EReference getComplexEntry_Tokens();

	/**
	 * Returns the meta object for class '{@link Xatkit.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see Xatkit.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.Token#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see Xatkit.Token#getPos()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Pos();

	/**
	 * Returns the meta object for class '{@link Xatkit.ComplexEntryToken <em>Complex Entry Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Entry Token</em>'.
	 * @see Xatkit.ComplexEntryToken
	 * @generated
	 */
	EClass getComplexEntryToken();

	/**
	 * Returns the meta object for class '{@link Xatkit.LiteralCEToken <em>Literal CE Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal CE Token</em>'.
	 * @see Xatkit.LiteralCEToken
	 * @generated
	 */
	EClass getLiteralCEToken();

	/**
	 * Returns the meta object for class '{@link Xatkit.EntityToken <em>Entity Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Token</em>'.
	 * @see Xatkit.EntityToken
	 * @generated
	 */
	EClass getEntityToken();

	/**
	 * Returns the meta object for the reference '{@link Xatkit.EntityToken#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see Xatkit.EntityToken#getEntity()
	 * @see #getEntityToken()
	 * @generated
	 */
	EReference getEntityToken_Entity();

	/**
	 * Returns the meta object for class '{@link Xatkit.LiteralToken <em>Literal Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Token</em>'.
	 * @see Xatkit.LiteralToken
	 * @generated
	 */
	EClass getLiteralToken();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.LiteralToken#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see Xatkit.LiteralToken#getLiteral()
	 * @see #getLiteralToken()
	 * @generated
	 */
	EAttribute getLiteralToken_Literal();

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
	 * Returns the meta object for the containment reference list '{@link Xatkit.Input#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see Xatkit.Input#getTokens()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Tokens();

	/**
	 * Returns the meta object for class '{@link Xatkit.InputToken <em>Input Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Token</em>'.
	 * @see Xatkit.InputToken
	 * @generated
	 */
	EClass getInputToken();

	/**
	 * Returns the meta object for class '{@link Xatkit.LiteralInputToken <em>Literal Input Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Input Token</em>'.
	 * @see Xatkit.LiteralInputToken
	 * @generated
	 */
	EClass getLiteralInputToken();

	/**
	 * Returns the meta object for class '{@link Xatkit.ParameterToken <em>Parameter Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Token</em>'.
	 * @see Xatkit.ParameterToken
	 * @generated
	 */
	EClass getParameterToken();

	/**
	 * Returns the meta object for the reference '{@link Xatkit.ParameterToken#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see Xatkit.ParameterToken#getParameter()
	 * @see #getParameterToken()
	 * @generated
	 */
	EReference getParameterToken_Parameter();

	/**
	 * Returns the meta object for class '{@link Xatkit.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see Xatkit.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link Xatkit.Context#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Xatkit.Context#getParameters()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Parameters();

	/**
	 * Returns the meta object for class '{@link Xatkit.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see Xatkit.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link Xatkit.Parameter#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see Xatkit.Parameter#getEntity()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Entity();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.Parameter#getFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see Xatkit.Parameter#getFragment()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Fragment();

	/**
	 * Returns the meta object for class '{@link Xatkit.RequireContext <em>Require Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Context</em>'.
	 * @see Xatkit.RequireContext
	 * @generated
	 */
	EClass getRequireContext();

	/**
	 * Returns the meta object for the reference '{@link Xatkit.RequireContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see Xatkit.RequireContext#getContext()
	 * @see #getRequireContext()
	 * @generated
	 */
	EReference getRequireContext_Context();

	/**
	 * Returns the meta object for the attribute '{@link Xatkit.RequireContext#isContinue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue</em>'.
	 * @see Xatkit.RequireContext#isContinue()
	 * @see #getRequireContext()
	 * @generated
	 */
	EAttribute getRequireContext_Continue();

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
		 * The meta object literal for the '{@link Xatkit.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.ElementImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

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
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__CONTEXT = eINSTANCE.getIntent_Context();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__REQUIRES = eINSTANCE.getIntent_Requires();

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
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_ENTRY__TOKENS = eINSTANCE.getComplexEntry_Tokens();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.TokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__POS = eINSTANCE.getToken_Pos();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.ComplexEntryTokenImpl <em>Complex Entry Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.ComplexEntryTokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getComplexEntryToken()
		 * @generated
		 */
		EClass COMPLEX_ENTRY_TOKEN = eINSTANCE.getComplexEntryToken();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.LiteralCETokenImpl <em>Literal CE Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.LiteralCETokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getLiteralCEToken()
		 * @generated
		 */
		EClass LITERAL_CE_TOKEN = eINSTANCE.getLiteralCEToken();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.EntityTokenImpl <em>Entity Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.EntityTokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getEntityToken()
		 * @generated
		 */
		EClass ENTITY_TOKEN = eINSTANCE.getEntityToken();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TOKEN__ENTITY = eINSTANCE.getEntityToken_Entity();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.LiteralTokenImpl <em>Literal Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.LiteralTokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getLiteralToken()
		 * @generated
		 */
		EClass LITERAL_TOKEN = eINSTANCE.getLiteralToken();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TOKEN__LITERAL = eINSTANCE.getLiteralToken_Literal();

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
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__TOKENS = eINSTANCE.getInput_Tokens();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.InputTokenImpl <em>Input Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.InputTokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getInputToken()
		 * @generated
		 */
		EClass INPUT_TOKEN = eINSTANCE.getInputToken();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.LiteralInputTokenImpl <em>Literal Input Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.LiteralInputTokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getLiteralInputToken()
		 * @generated
		 */
		EClass LITERAL_INPUT_TOKEN = eINSTANCE.getLiteralInputToken();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.ParameterTokenImpl <em>Parameter Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.ParameterTokenImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getParameterToken()
		 * @generated
		 */
		EClass PARAMETER_TOKEN = eINSTANCE.getParameterToken();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_TOKEN__PARAMETER = eINSTANCE.getParameterToken_Parameter();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.ContextImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARAMETERS = eINSTANCE.getContext_Parameters();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.ParameterImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__ENTITY = eINSTANCE.getParameter_Entity();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__FRAGMENT = eINSTANCE.getParameter_Fragment();

		/**
		 * The meta object literal for the '{@link Xatkit.impl.RequireContextImpl <em>Require Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Xatkit.impl.RequireContextImpl
		 * @see Xatkit.impl.XatkitPackageImpl#getRequireContext()
		 * @generated
		 */
		EClass REQUIRE_CONTEXT = eINSTANCE.getRequireContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_CONTEXT__CONTEXT = eINSTANCE.getRequireContext_Context();

		/**
		 * The meta object literal for the '<em><b>Continue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_CONTEXT__CONTINUE = eINSTANCE.getRequireContext_Continue();

	}

} //XatkitPackage
