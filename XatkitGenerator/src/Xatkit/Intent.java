/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Intent#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getIntent()
 * @model
 * @generated
 */
public interface Intent extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getIntent_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInputs();

} // Intent
