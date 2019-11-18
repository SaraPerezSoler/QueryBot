/**
 */
package modelInfo.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import modelInfo.ModelInfoPackage;
import modelInfo.NLAttribute;
import modelInfo.NLClass;
import modelInfo.NLFeature;
import modelInfo.NLReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NL Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelInfo.impl.NLClassImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link modelInfo.impl.NLClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link modelInfo.impl.NLClassImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NLClassImpl extends NLElementImpl implements NLClass {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EClass class_;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected EList<NLAttribute> id;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<NLFeature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NLClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelInfoPackage.Literals.NL_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (EClass)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelInfoPackage.NL_CLASS__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(EClass newClass) {
		EClass oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelInfoPackage.NL_CLASS__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NLAttribute> getId() {
		if (id == null) {
			id = new EObjectResolvingEList<NLAttribute>(NLAttribute.class, this, ModelInfoPackage.NL_CLASS__ID);
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NLFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<NLFeature>(NLFeature.class, this, ModelInfoPackage.NL_CLASS__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelInfoPackage.NL_CLASS__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case ModelInfoPackage.NL_CLASS__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case ModelInfoPackage.NL_CLASS__ID:
				return getId();
			case ModelInfoPackage.NL_CLASS__FEATURES:
				return getFeatures();
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
			case ModelInfoPackage.NL_CLASS__CLASS:
				setClass((EClass)newValue);
				return;
			case ModelInfoPackage.NL_CLASS__ID:
				getId().clear();
				getId().addAll((Collection<? extends NLAttribute>)newValue);
				return;
			case ModelInfoPackage.NL_CLASS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends NLFeature>)newValue);
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
			case ModelInfoPackage.NL_CLASS__CLASS:
				setClass((EClass)null);
				return;
			case ModelInfoPackage.NL_CLASS__ID:
				getId().clear();
				return;
			case ModelInfoPackage.NL_CLASS__FEATURES:
				getFeatures().clear();
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
			case ModelInfoPackage.NL_CLASS__CLASS:
				return class_ != null;
			case ModelInfoPackage.NL_CLASS__ID:
				return id != null && !id.isEmpty();
			case ModelInfoPackage.NL_CLASS__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public List<NLAttribute> getAttribuites() {
		List<NLAttribute> ret = new ArrayList<NLAttribute>();
		for (NLFeature feature: getFeatures()) {
			if (feature instanceof NLAttribute) {
				ret.add((NLAttribute)feature);
			}
		}
		return ret;
	}
	
	@Override
	public List<NLReference> getReferences() {
		List<NLReference> ret = new ArrayList<NLReference>();
		for (NLFeature feature: getFeatures()) {
			if (feature instanceof NLReference) {
				ret.add((NLReference)feature);
			}
		}
		return ret;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((class_ == null) ? 0 : class_.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NLClassImpl other = (NLClassImpl) obj;
		if (class_ == null) {
			if (other.class_ != null)
				return false;
		} else if (!class_.equals(other.class_))
			return false;
		return true;
	}


} //NLClassImpl
