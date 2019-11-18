/**
 */
package modelInfo;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NL Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelInfo.NLClass#getClass_ <em>Class</em>}</li>
 *   <li>{@link modelInfo.NLClass#getId <em>Id</em>}</li>
 *   <li>{@link modelInfo.NLClass#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see modelInfo.ModelInfoPackage#getNLClass()
 * @model
 * @generated
 */
public interface NLClass extends NLElement {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(EClass)
	 * @see modelInfo.ModelInfoPackage#getNLClass_Class()
	 * @model required="true"
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Sets the value of the '{@link modelInfo.NLClass#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' reference list.
	 * The list contents are of type {@link modelInfo.NLAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if true, objects of this class are created when they are mentioned and do not exist
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' reference list.
	 * @see modelInfo.ModelInfoPackage#getNLClass_Id()
	 * @model required="true"
	 * @generated
	 */
	EList<NLAttribute> getId();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link modelInfo.NLFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see modelInfo.ModelInfoPackage#getNLClass_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NLFeature> getFeatures();

	List<NLAttribute> getAttribuites();

	List<NLReference> getReferences();

} // NLClass
