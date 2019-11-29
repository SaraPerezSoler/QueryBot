/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EMap;

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
 *   <li>{@link Xatkit.ComplexEntry#getEntities <em>Entities</em>}</li>
 *   <li>{@link Xatkit.ComplexEntry#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getComplexEntry()
 * @model
 * @generated
 */
public interface ComplexEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' map.
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link Xatkit.Entity},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' map.
	 * @see Xatkit.XatkitPackage#getComplexEntry_Entities()
	 * @model mapType="Xatkit.IntToEntity&lt;org.eclipse.emf.ecore.EIntegerObject, Xatkit.Entity&gt;"
	 * @generated
	 */
	EMap<Integer, Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' map.
	 * The key is of type {@link java.lang.Integer},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' map.
	 * @see Xatkit.XatkitPackage#getComplexEntry_Literals()
	 * @model mapType="Xatkit.IntToString&lt;org.eclipse.emf.ecore.EIntegerObject, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<Integer, String> getLiterals();

	boolean contains(Entity entity);

	String getEntryString();

} // ComplexEntry
