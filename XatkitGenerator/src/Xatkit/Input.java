/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Input#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.InputToken}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getInput_Tokens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputToken> getTokens();

	String getInputText();
} // Input
