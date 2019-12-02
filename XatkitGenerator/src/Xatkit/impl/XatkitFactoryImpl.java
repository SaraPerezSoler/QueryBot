/**
 */
package Xatkit.impl;

import Xatkit.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XatkitFactoryImpl extends EFactoryImpl implements XatkitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XatkitFactory init() {
		try {
			XatkitFactory theXatkitFactory = (XatkitFactory)EPackage.Registry.INSTANCE.getEFactory(XatkitPackage.eNS_URI);
			if (theXatkitFactory != null) {
				return theXatkitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XatkitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XatkitFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XatkitPackage.XATKIT_BOT: return createXatkitBot();
			case XatkitPackage.INTENT: return createIntent();
			case XatkitPackage.MAPPING: return createMapping();
			case XatkitPackage.COMPOSITE: return createComposite();
			case XatkitPackage.ENTRY: return createEntry();
			case XatkitPackage.COMPLEX_ENTRY: return createComplexEntry();
			case XatkitPackage.ENTITY_TOKEN: return createEntityToken();
			case XatkitPackage.LITERAL_TOKEN: return createLiteralToken();
			case XatkitPackage.DEFAULT_ENTITY: return createDefaultEntity();
			case XatkitPackage.INPUT: return createInput();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XatkitBot createXatkitBot() {
		XatkitBotImpl xatkitBot = new XatkitBotImpl();
		return xatkitBot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intent createIntent() {
		IntentImpl intent = new IntentImpl();
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexEntry createComplexEntry() {
		ComplexEntryImpl complexEntry = new ComplexEntryImpl();
		return complexEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityToken createEntityToken() {
		EntityTokenImpl entityToken = new EntityTokenImpl();
		return entityToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralToken createLiteralToken() {
		LiteralTokenImpl literalToken = new LiteralTokenImpl();
		return literalToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultEntity createDefaultEntity() {
		DefaultEntityImpl defaultEntity = new DefaultEntityImpl();
		return defaultEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XatkitPackage getXatkitPackage() {
		return (XatkitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XatkitPackage getPackage() {
		return XatkitPackage.eINSTANCE;
	}

} //XatkitFactoryImpl
