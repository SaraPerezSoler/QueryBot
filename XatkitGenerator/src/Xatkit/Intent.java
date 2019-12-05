/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link Xatkit.Intent#getContext <em>Context</em>}</li>
 *   <li>{@link Xatkit.Intent#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getIntent()
 * @model
 * @generated
 */
public interface Intent extends Element {
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

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getIntent_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.RequireContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getIntent_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequireContext> getRequires();

	String generateIntentString();

} // Intent
