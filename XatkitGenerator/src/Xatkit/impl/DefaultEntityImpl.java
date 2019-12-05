/**
 */
package Xatkit.impl;

import Xatkit.DefaultEntity;
import Xatkit.XatkitPackage;

import org.eclipse.emf.ecore.EClass;

import Utils.Utils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DefaultEntityImpl extends EntityImpl implements DefaultEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XatkitPackage.Literals.DEFAULT_ENTITY;
	}

	@Override
	public String generateEntityString() {
		return "";
	}

	@Override
	public String getDefaultValue(Integer index) {
		
		return Utils.getDefaultValue(getName(), index);
	}

} //DefaultEntityImpl
