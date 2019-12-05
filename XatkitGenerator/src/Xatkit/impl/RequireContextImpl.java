/**
 */
package Xatkit.impl;

import Xatkit.Context;
import Xatkit.RequireContext;
import Xatkit.XatkitPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.impl.RequireContextImpl#getContext <em>Context</em>}</li>
 *   <li>{@link Xatkit.impl.RequireContextImpl#isContinue <em>Continue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequireContextImpl extends MinimalEObjectImpl.Container implements RequireContext {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * The default value of the '{@link #isContinue() <em>Continue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinue() <em>Continue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinue()
	 * @generated
	 * @ordered
	 */
	protected boolean continue_ = CONTINUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequireContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XatkitPackage.Literals.REQUIRE_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XatkitPackage.REQUIRE_CONTEXT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XatkitPackage.REQUIRE_CONTEXT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContinue() {
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinue(boolean newContinue) {
		boolean oldContinue = continue_;
		continue_ = newContinue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XatkitPackage.REQUIRE_CONTEXT__CONTINUE, oldContinue, continue_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XatkitPackage.REQUIRE_CONTEXT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case XatkitPackage.REQUIRE_CONTEXT__CONTINUE:
				return isContinue();
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
			case XatkitPackage.REQUIRE_CONTEXT__CONTEXT:
				setContext((Context)newValue);
				return;
			case XatkitPackage.REQUIRE_CONTEXT__CONTINUE:
				setContinue((Boolean)newValue);
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
			case XatkitPackage.REQUIRE_CONTEXT__CONTEXT:
				setContext((Context)null);
				return;
			case XatkitPackage.REQUIRE_CONTEXT__CONTINUE:
				setContinue(CONTINUE_EDEFAULT);
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
			case XatkitPackage.REQUIRE_CONTEXT__CONTEXT:
				return context != null;
			case XatkitPackage.REQUIRE_CONTEXT__CONTINUE:
				return continue_ != CONTINUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (continue: ");
		result.append(continue_);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getRequiresText() {
		return "requires context "+ getContext().getName()+"\n";
	}

	@Override
	public String getContinueText() {
		if (isContinue()) {
			return getContext().getHeader()+"\n";
		}
		return "";
	}

} //RequireContextImpl
