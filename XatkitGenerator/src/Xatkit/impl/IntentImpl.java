/**
 */
package Xatkit.impl;

import Xatkit.Context;
import Xatkit.Input;
import Xatkit.Intent;
import Xatkit.Parameter;
import Xatkit.RequireContext;
import Xatkit.XatkitPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.impl.IntentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link Xatkit.impl.IntentImpl#getContext <em>Context</em>}</li>
 *   <li>{@link Xatkit.impl.IntentImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntentImpl extends ElementImpl implements Intent {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> context;
	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<RequireContext> requires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XatkitPackage.Literals.INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, XatkitPackage.INTENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<Context>(Context.class, this, XatkitPackage.INTENT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequireContext> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<RequireContext>(RequireContext.class, this, XatkitPackage.INTENT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XatkitPackage.INTENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case XatkitPackage.INTENT__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case XatkitPackage.INTENT__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
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
			case XatkitPackage.INTENT__INPUTS:
				return getInputs();
			case XatkitPackage.INTENT__CONTEXT:
				return getContext();
			case XatkitPackage.INTENT__REQUIRES:
				return getRequires();
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
			case XatkitPackage.INTENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case XatkitPackage.INTENT__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends Context>)newValue);
				return;
			case XatkitPackage.INTENT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends RequireContext>)newValue);
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
			case XatkitPackage.INTENT__INPUTS:
				getInputs().clear();
				return;
			case XatkitPackage.INTENT__CONTEXT:
				getContext().clear();
				return;
			case XatkitPackage.INTENT__REQUIRES:
				getRequires().clear();
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
			case XatkitPackage.INTENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case XatkitPackage.INTENT__CONTEXT:
				return context != null && !context.isEmpty();
			case XatkitPackage.INTENT__REQUIRES:
				return requires != null && !requires.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String generateIntentString() {
		String ret = "intent "+getName()+" {\n";
		String continueContext = "";
		for (RequireContext context: getRequires()) {
			ret += "\t"+context.getRequiresText();
			continueContext += "\t"+context.getContinueText();
		}
		ret+="\t inputs {\n";
		for (Input input: getInputs()) {
			ret += "\t\t \""+input.getInputText()+"\"\n";
		}
		ret+="}\n";
		ret+=continueContext;
		
		
		for (Context context: getContext()) {
			ret+= "\t"+context.getContextText();
		}
		return ret +"}\n";
	}

} //IntentImpl
