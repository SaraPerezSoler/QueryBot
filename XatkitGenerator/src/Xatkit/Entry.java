/**
 */
package Xatkit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.Entry#getValue <em>Value</em>}</li>
 *   <li>{@link Xatkit.Entry#getSynonyms <em>Synonyms</em>}</li>
 * </ul>
 *
 * @see Xatkit.XatkitPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Xatkit.XatkitPackage#getEntry_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Xatkit.Entry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Synonyms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonyms</em>' attribute list.
	 * @see Xatkit.XatkitPackage#getEntry_Synonyms()
	 * @model annotation="@CointainerVAREntry"
	 * @generated
	 */
	EList<String> getSynonyms();

} // Entry
