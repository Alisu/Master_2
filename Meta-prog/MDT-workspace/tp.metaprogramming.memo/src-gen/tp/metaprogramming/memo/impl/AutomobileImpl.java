/**
 */
package tp.metaprogramming.memo.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tp.metaprogramming.memo.Automobile;
import tp.metaprogramming.memo.AutomobileType;
import tp.metaprogramming.memo.MemoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automobile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tp.metaprogramming.memo.impl.AutomobileImpl#getTypeVoiture <em>Type Voiture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomobileImpl extends NamedElementImpl implements Automobile {
	/**
	 * The default value of the '{@link #getTypeVoiture() <em>Type Voiture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVoiture()
	 * @generated
	 * @ordered
	 */
	protected static final AutomobileType TYPE_VOITURE_EDEFAULT = AutomobileType.BMW;

	/**
	 * The cached value of the '{@link #getTypeVoiture() <em>Type Voiture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVoiture()
	 * @generated
	 * @ordered
	 */
	protected AutomobileType typeVoiture = TYPE_VOITURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomobileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoPackage.Literals.AUTOMOBILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomobileType getTypeVoiture() {
		return typeVoiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVoiture(AutomobileType newTypeVoiture) {
		AutomobileType oldTypeVoiture = typeVoiture;
		typeVoiture = newTypeVoiture == null ? TYPE_VOITURE_EDEFAULT : newTypeVoiture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoPackage.AUTOMOBILE__TYPE_VOITURE, oldTypeVoiture,
					typeVoiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MemoPackage.AUTOMOBILE__TYPE_VOITURE:
			return getTypeVoiture();
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
		case MemoPackage.AUTOMOBILE__TYPE_VOITURE:
			setTypeVoiture((AutomobileType) newValue);
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
		case MemoPackage.AUTOMOBILE__TYPE_VOITURE:
			setTypeVoiture(TYPE_VOITURE_EDEFAULT);
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
		case MemoPackage.AUTOMOBILE__TYPE_VOITURE:
			return typeVoiture != TYPE_VOITURE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (typeVoiture: ");
		result.append(typeVoiture);
		result.append(')');
		return result.toString();
	}

} //AutomobileImpl
