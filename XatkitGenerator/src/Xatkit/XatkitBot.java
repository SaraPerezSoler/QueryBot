/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.XatkitBot#getIntents <em>Intents</em>}</li>
 *   <li>{@link Xatkit.XatkitBot#getEntities <em>Entities</em>}</li>
 *   <li>{@link Xatkit.XatkitBot#getDefaultEntities <em>Default Entities</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getXatkitBot()
 * @model
 * @generated
 */
public interface XatkitBot extends EObject {
	/**
	 * Returns the value of the '<em><b>Intents</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.Intent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intents</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getXatkitBot_Intents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Intent> getIntents();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getXatkitBot_Entities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	Entity getEntity(String name);
	/**
	 * Returns the value of the '<em><b>Default Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Xatkit.DefaultEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Entities</em>' containment reference list.
	 * @see Xatkit.XatkitPackage#getXatkitBot_DefaultEntities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DefaultEntity> getDefaultEntities();
	
	String generateIntentFile();
	
	void removeEmptyEnities();

} // XatkitBot
