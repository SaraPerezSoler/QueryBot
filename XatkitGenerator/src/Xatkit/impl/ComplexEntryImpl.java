/**
 */
package Xatkit.impl;

import Xatkit.ComplexEntry;
import Xatkit.ComplexEntryToken;
import Xatkit.Entity;
import Xatkit.EntityToken;
import Xatkit.LiteralToken;
import Xatkit.XatkitPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
		for (ComplexEntryToken token: getTokens()) {
			if (token instanceof EntityToken) {
				if (((EntityToken) token).getEntity().equals(entity)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String getEntryString() {
		String ret = "value ";
		List<ComplexEntryToken> tokens = getTokens();
		Collections.sort(tokens, new Comparator<ComplexEntryToken>() {
			@Override
			public int compare(ComplexEntryToken o1, ComplexEntryToken o2) {
				return Integer.compare(o1.getPos(), o2.getPos());
			}
		});
		for (ComplexEntryToken token: tokens) {
			if (token instanceof EntityToken) {
				ret+= ((EntityToken)token).getEntity().getName()+" ";
			}else {
				ret+= "\" " + ((LiteralToken)token).getLiteral()+" \" ";
			}
		}
		
		return ret+"\n";
	}

	@Override
	public String toString() {
		return "ComplexEntryImpl [tokens=" + tokens + "]";
	}

} //ComplexEntryImpl
