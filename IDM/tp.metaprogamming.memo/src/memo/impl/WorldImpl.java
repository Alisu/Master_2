/**
 */
package memo.impl;

import java.util.Collection;

import memo.Automible;
import memo.MemoPackage;
import memo.Person;
import memo.World;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link memo.impl.WorldImpl#getAutomibles <em>Automibles</em>}</li>
 *   <li>{@link memo.impl.WorldImpl#getPopulation <em>Population</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorldImpl extends MemoClassImpl implements World {
	/**
	 * The cached value of the '{@link #getAutomibles() <em>Automibles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomibles()
	 * @generated
	 * @ordered
	 */
	protected EList<Automible> automibles;

	/**
	 * The cached value of the '{@link #getPopulation() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulation()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> population;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoPackage.Literals.WORLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Automible> getAutomibles() {
		if (automibles == null) {
			automibles = new EObjectContainmentEList<Automible>(Automible.class, this, MemoPackage.WORLD__AUTOMIBLES);
		}
		return automibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPopulation() {
		if (population == null) {
			population = new EObjectContainmentEList<Person>(Person.class, this, MemoPackage.WORLD__POPULATION);
		}
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemoPackage.WORLD__AUTOMIBLES:
				return ((InternalEList<?>)getAutomibles()).basicRemove(otherEnd, msgs);
			case MemoPackage.WORLD__POPULATION:
				return ((InternalEList<?>)getPopulation()).basicRemove(otherEnd, msgs);
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
			case MemoPackage.WORLD__AUTOMIBLES:
				return getAutomibles();
			case MemoPackage.WORLD__POPULATION:
				return getPopulation();
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
			case MemoPackage.WORLD__AUTOMIBLES:
				getAutomibles().clear();
				getAutomibles().addAll((Collection<? extends Automible>)newValue);
				return;
			case MemoPackage.WORLD__POPULATION:
				getPopulation().clear();
				getPopulation().addAll((Collection<? extends Person>)newValue);
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
			case MemoPackage.WORLD__AUTOMIBLES:
				getAutomibles().clear();
				return;
			case MemoPackage.WORLD__POPULATION:
				getPopulation().clear();
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
			case MemoPackage.WORLD__AUTOMIBLES:
				return automibles != null && !automibles.isEmpty();
			case MemoPackage.WORLD__POPULATION:
				return population != null && !population.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorldImpl
