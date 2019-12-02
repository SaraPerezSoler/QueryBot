/**
 */
package Xatkit.impl;

import Xatkit.Composite;
import Xatkit.DefaultEntity;
import Xatkit.Entity;
import Xatkit.Intent;
import Xatkit.Mapping;
import Xatkit.XatkitBot;
import Xatkit.XatkitPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

import Utils.Utils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Xatkit.impl.XatkitBotImpl#getIntents <em>Intents</em>}</li>
 *   <li>{@link Xatkit.impl.XatkitBotImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link Xatkit.impl.XatkitBotImpl#getDefaultEntities <em>Default Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XatkitBotImpl extends MinimalEObjectImpl.Container implements XatkitBot {
	public static  String queryBotPath = "/Users/Miso/QueryBot.xmi";
	private static XatkitBot queryBot = null;

	/**
	 * The cached value of the '{@link #getIntents() <em>Intents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntents()
	 * @generated
	 * @ordered
	 */
	protected EList<Intent> intents;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getDefaultEntities() <em>Default Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultEntity> defaultEntities;


	

	public static XatkitBot getQueryBotInstance() {
		
		if (queryBot == null) {
			Resource resource = Utils.getResourceSet().getResource(URI.createURI(queryBotPath), true);
			queryBot = (XatkitBot) resource.getContents().get(0);
		}
		Copier copier = new Copier();
		XatkitBot queryBotCopy = (XatkitBot) copier.copy(queryBot);
		return queryBotCopy;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XatkitBotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XatkitPackage.Literals.XATKIT_BOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Intent> getIntents() {
		if (intents == null) {
			intents = new EObjectContainmentEList<Intent>(Intent.class, this, XatkitPackage.XATKIT_BOT__INTENTS);
		}
		return intents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, XatkitPackage.XATKIT_BOT__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefaultEntity> getDefaultEntities() {
		if (defaultEntities == null) {
			defaultEntities = new EObjectContainmentEList<DefaultEntity>(DefaultEntity.class, this, XatkitPackage.XATKIT_BOT__DEFAULT_ENTITIES);
		}
		return defaultEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XatkitPackage.XATKIT_BOT__INTENTS:
				return ((InternalEList<?>)getIntents()).basicRemove(otherEnd, msgs);
			case XatkitPackage.XATKIT_BOT__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case XatkitPackage.XATKIT_BOT__DEFAULT_ENTITIES:
				return ((InternalEList<?>)getDefaultEntities()).basicRemove(otherEnd, msgs);
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
			case XatkitPackage.XATKIT_BOT__INTENTS:
				return getIntents();
			case XatkitPackage.XATKIT_BOT__ENTITIES:
				return getEntities();
			case XatkitPackage.XATKIT_BOT__DEFAULT_ENTITIES:
				return getDefaultEntities();
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
			case XatkitPackage.XATKIT_BOT__INTENTS:
				getIntents().clear();
				getIntents().addAll((Collection<? extends Intent>)newValue);
				return;
			case XatkitPackage.XATKIT_BOT__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case XatkitPackage.XATKIT_BOT__DEFAULT_ENTITIES:
				getDefaultEntities().clear();
				getDefaultEntities().addAll((Collection<? extends DefaultEntity>)newValue);
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
			case XatkitPackage.XATKIT_BOT__INTENTS:
				getIntents().clear();
				return;
			case XatkitPackage.XATKIT_BOT__ENTITIES:
				getEntities().clear();
				return;
			case XatkitPackage.XATKIT_BOT__DEFAULT_ENTITIES:
				getDefaultEntities().clear();
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
			case XatkitPackage.XATKIT_BOT__INTENTS:
				return intents != null && !intents.isEmpty();
			case XatkitPackage.XATKIT_BOT__ENTITIES:
				return entities != null && !entities.isEmpty();
			case XatkitPackage.XATKIT_BOT__DEFAULT_ENTITIES:
				return defaultEntities != null && !defaultEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	@Override
	public Entity getEntity(String name) {
		for (Entity entity: getEntities()) {
			if (entity.getName().equalsIgnoreCase(name)) {
				return entity;
			}
		}
		return null;
	}
	
	@Override
	public void removeEmptyEnities() {
		List<Entity> remove = new ArrayList<Entity>();
		for (Entity entity : getEntities()) {
			if (entity instanceof Mapping) {
				Mapping mapping = (Mapping) entity;
				if (mapping.getEntries().isEmpty()) {
					for (String compositeName: Utils.COMPOSITES) {
						Composite composite = (Composite) getEntity(compositeName);
						composite.removeReference(mapping);
					}					
					remove.add(entity);
				}
			}
		}
		getEntities().removeAll(remove);
		
	}
	@Override
	public String generateIntentFile() {
		String ret = "";
		for (Entity entity : getEntities()) {
			ret+=entity.generateEntityString();
		}
		
		return ret;
	}
	

} //XatkitBotImpl
