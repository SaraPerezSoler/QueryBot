/**
 */
package Xatkit.impl;

import Xatkit.ComplexEntry;
import Xatkit.Composite;
import Xatkit.Entity;
import Xatkit.XatkitPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.impl.CompositeImpl#getComplexEntries <em>Complex Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends EntityImpl implements Composite {
	/**
	 * The cached value of the '{@link #getComplexEntries() <em>Complex Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexEntry> complexEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XatkitPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComplexEntry> getComplexEntries() {
		if (complexEntries == null) {
			complexEntries = new EObjectContainmentEList<ComplexEntry>(ComplexEntry.class, this, XatkitPackage.COMPOSITE__COMPLEX_ENTRIES);
		}
		return complexEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XatkitPackage.COMPOSITE__COMPLEX_ENTRIES:
				return ((InternalEList<?>)getComplexEntries()).basicRemove(otherEnd, msgs);
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
			case XatkitPackage.COMPOSITE__COMPLEX_ENTRIES:
				return getComplexEntries();
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
			case XatkitPackage.COMPOSITE__COMPLEX_ENTRIES:
				getComplexEntries().clear();
				getComplexEntries().addAll((Collection<? extends ComplexEntry>)newValue);
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
			case XatkitPackage.COMPOSITE__COMPLEX_ENTRIES:
				getComplexEntries().clear();
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
			case XatkitPackage.COMPOSITE__COMPLEX_ENTRIES:
				return complexEntries != null && !complexEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void removeReference(Entity entity) {
		List<ComplexEntry> remove = new ArrayList<ComplexEntry>();
		for (ComplexEntry entry : getComplexEntries()) {
			if (entry.contains (entity)){
				remove.add(entry);
			}
		}
		getComplexEntries().removeAll(remove);
		
	}

	@Override
	public String generateEntityString() {
		String ret = "composite "+getName()+"{\n";
		for (ComplexEntry entry: getComplexEntries()) {
			ret +="\t"+ entry.getEntryString();
		}
		ret += "}\n";
		return ret;
	}

} //CompositeImpl
