/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Context#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends Element {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getContext_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	String getContextText();

	String getHeader();

} // Context
