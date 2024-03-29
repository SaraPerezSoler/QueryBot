/**
 */
package modelInfo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelInfo.NLModel#getName <em>Name</em>}</li>
 *   <li>{@link modelInfo.NLModel#getModel <em>Model</em>}</li>
 *   <li>{@link modelInfo.NLModel#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see modelInfo.ModelInfoPackage#getNLModel()
 * @model
 * @generated
 */
public interface NLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modelInfo.ModelInfoPackage#getNLModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modelInfo.NLModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(EPackage)
	 * @see modelInfo.ModelInfoPackage#getNLModel_Model()
	 * @model required="true"
	 * @generated
	 */
	EPackage getModel();

	/**
	 * Sets the value of the '{@link modelInfo.NLModel#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link modelInfo.NLClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see modelInfo.ModelInfoPackage#getNLModel_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NLClass> getClasses();

	NLClass getClass(EClass clas);

} // NLModel
