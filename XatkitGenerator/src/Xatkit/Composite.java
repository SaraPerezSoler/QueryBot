/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Composite#getComplexEntries <em>Complex Entries</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends Entity {
	/**
	 * Returns the value of the '<em><b>Complex Entries</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.ComplexEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Entries</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getComposite_ComplexEntries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComplexEntry> getComplexEntries();
	
	void removeReference(Entity entity);

} // Composite
