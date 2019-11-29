/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Mapping#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends Entity {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getMapping_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entry> getEntries();

} // Mapping
