/**
 */
package modelInfo;

import org.eclipse.emf.ecore.EAttribute;

import modelInfo.impl.NLAttributeImpl.Types;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NL Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelInfo.NLAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see modelInfo.ModelInfoPackage#getNLAttribute()
 * @model
 * @generated
 */
public interface NLAttribute extends NLFeature {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(EAttribute)
	 * @see modelInfo.ModelInfoPackage#getNLAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Sets the value of the '{@link modelInfo.NLAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);

	boolean isType(Types type);

	String getType();

	

} // NLAttribute