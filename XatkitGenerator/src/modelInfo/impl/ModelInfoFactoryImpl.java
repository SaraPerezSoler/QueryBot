/**
 */
package modelInfo.impl;

import modelInfo.*;

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
public class ModelInfoFactoryImpl extends EFactoryImpl implements ModelInfoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelInfoFactory init() {
		try {
			ModelInfoFactory theModelInfoFactory = (ModelInfoFactory)EPackage.Registry.INSTANCE.getEFactory(ModelInfoPackage.eNS_URI);
			if (theModelInfoFactory != null) {
				return theModelInfoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelInfoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelInfoFactoryImpl() {
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
			case ModelInfoPackage.NL_MODEL: return createNLModel();
			case ModelInfoPackage.NL_CLASS: return createNLClass();
			case ModelInfoPackage.NL_ATTRIBUTE: return createNLAttribute();
			case ModelInfoPackage.NL_REFERENCE: return createNLReference();
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
	public NLModel createNLModel() {
		NLModelImpl nlModel = new NLModelImpl();
		return nlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NLClass createNLClass() {
		NLClassImpl nlClass = new NLClassImpl();
		return nlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NLAttribute createNLAttribute() {
		NLAttributeImpl nlAttribute = new NLAttributeImpl();
		return nlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NLReference createNLReference() {
		NLReferenceImpl nlReference = new NLReferenceImpl();
		return nlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelInfoPackage getModelInfoPackage() {
		return (ModelInfoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelInfoPackage getPackage() {
		return ModelInfoPackage.eINSTANCE;
	}

} //ModelInfoFactoryImpl
