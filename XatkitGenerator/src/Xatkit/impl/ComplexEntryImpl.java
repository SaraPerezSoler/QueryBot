/**
 */
package Xatkit.impl;

import Xatkit.ComplexEntry;
import Xatkit.ComplexEntryToken;
import Xatkit.Entity;
import Xatkit.XatkitPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.impl.ComplexEntryImpl#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexEntryImpl extends MinimalEObjectImpl.Container implements ComplexEntry {
	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexEntryToken> tokens;

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
	public EList<ComplexEntryToken> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<ComplexEntryToken>(ComplexEntryToken.class, this, XatkitPackage.COMPLEX_ENTRY__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
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
			case XatkitPackage.COMPLEX_ENTRY__TOKENS:
				return getTokens();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XatkitPackage.COMPLEX_ENTRY__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends ComplexEntryToken>)newValue);
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
			case XatkitPackage.COMPLEX_ENTRY__TOKENS:
				getTokens().clear();
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
			case XatkitPackage.COMPLEX_ENTRY__TOKENS:
				return tokens != null && !tokens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean contains(Entity entity) {
		return getEntities().containsValue(entity);
	}

	@Override
	public String getEntryString() {
		String ret = "value ";
		int size = getEntities().size()+getLiterals().size();
		for (int i = 0; i<size; i++) {
			Entity entity = getEntities().get((Integer)i);
			if (entity == null) {
				String literal = getLiterals().get((Integer)i);
				if(literal!= null) {
					ret += " "+literal+" ";
				}
			}else {
				ret += entity.getName();
			}
		}
		return ret+"\n";
	}

} //ComplexEntryImpl
