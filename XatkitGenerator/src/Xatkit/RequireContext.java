/**
 */
package Xatkit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.RequireContext#getContext <em>Context</em>}</li>
 *   <li>{@link Xatkit.RequireContext#isContinue <em>Continue</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getRequireContext()
 * @model
 * @generated
 */
public interface RequireContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see Xatkit.XatkitPackage#getRequireContext_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link Xatkit.RequireContext#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Continue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue</em>' attribute.
	 * @see #setContinue(boolean)
	 * @see Xatkit.XatkitPackage#getRequireContext_Continue()
	 * @model required="true"
	 * @generated
	 */
	boolean isContinue();

	/**
	 * Sets the value of the '{@link Xatkit.RequireContext#isContinue <em>Continue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continue</em>' attribute.
	 * @see #isContinue()
	 * @generated
	 */
	void setContinue(boolean value);

	String getRequiresText();

	String getContinueText();

} // RequireContext
