/**
 */
package Xatkit.impl;

import Xatkit.ComplexEntry;
import Xatkit.Entity;
import Xatkit.XatkitPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.impl.ComplexEntryImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link Xatkit.impl.ComplexEntryImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexEntryImpl extends MinimalEObjectImpl.Container implements ComplexEntry {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, Entity> entities;

	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EMap<Integer, String> literals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XatkitPackage.Literals.COMPLEX_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Integer, Entity> getEntities() {
		if (entities == null) {
			entities = new EcoreEMap<Integer,Entity>(XatkitPackage.Literals.INT_TO_ENTITY, IntToEntityImpl.class, this, XatkitPackage.COMPLEX_ENTRY__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<Integer, String> getLiterals() {
		if (literals == null) {
			literals = new EcoreEMap<Integer,String>(XatkitPackage.Literals.INT_TO_STRING, IntToStringImpl.class, this, XatkitPackage.COMPLEX_ENTRY__LITERALS);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case XatkitPackage.COMPLEX_ENTRY__LITERALS:
				return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__ENTITIES:
				if (coreType) return getEntities();
				else return getEntities().map();
			case XatkitPackage.COMPLEX_ENTRY__LITERALS:
				if (coreType) return getLiterals();
				else return getLiterals().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__ENTITIES:
				((EStructuralFeature.Setting)getEntities()).set(newValue);
				return;
			case XatkitPackage.COMPLEX_ENTRY__LITERALS:
				((EStructuralFeature.Setting)getLiterals()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__ENTITIES:
				getEntities().clear();
				return;
			case XatkitPackage.COMPLEX_ENTRY__LITERALS:
				getLiterals().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__ENTITIES:
				return entities != null && !entities.isEmpty();
			case XatkitPackage.COMPLEX_ENTRY__LITERALS:
				return literals != null && !literals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean contains(Entity entity) {
		return getEntities().containsValue(entity);
	}

	@Override
	public String getEntryString() {
		String ret = "";
		int size = getEntities().size()+getLiterals().size();
		for (int i = 0; i<size; i++) {
			Entity entity = getEntities().get(i);
			
		}
		return null;
	}

} //ComplexEntryImpl
