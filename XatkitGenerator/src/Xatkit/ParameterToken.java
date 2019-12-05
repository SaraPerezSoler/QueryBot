/**
 */
package Xatkit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.ParameterToken#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getParameterToken()
 * @model
 * @generated
 */
public interface ParameterToken extends InputToken {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see Xatkit.XatkitPackage#getParameterToken_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link Xatkit.ParameterToken#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterToken
