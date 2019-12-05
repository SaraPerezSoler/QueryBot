/**
 */
package Xatkit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Token#getPos <em>Pos</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getToken()
 * @model abstract="true"
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(int)
	 * @see Xatkit.XatkitPackage#getToken_Pos()
	 * @model required="true"
	 * @generated
	 */
	int getPos();

	/**
	 * Sets the value of the '{@link Xatkit.Token#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(int value);

} // Token
