/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.ComplexEntry#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getComplexEntry()
 * @model
 * @generated
 */
public interface ComplexEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.ComplexEntryToken}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getComplexEntry_Tokens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComplexEntryToken> getTokens();

	boolean contains(Entity entity);

	String getEntryString();

} // ComplexEntry
