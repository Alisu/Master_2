/**
 */
package tp.metaprogramming.memo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tp.metaprogramming.memo.Automobile#getTypeVoiture <em>Type Voiture</em>}</li>
 * </ul>
 *
 * @see tp.metaprogramming.memo.MemoPackage#getAutomobile()
 * @model
 * @generated
 */
public interface Automobile extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type Voiture</b></em>' attribute.
	 * The literals are from the enumeration {@link tp.metaprogramming.memo.AutomobileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Voiture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Voiture</em>' attribute.
	 * @see tp.metaprogramming.memo.AutomobileType
	 * @see #setTypeVoiture(AutomobileType)
	 * @see tp.metaprogramming.memo.MemoPackage#getAutomobile_TypeVoiture()
	 * @model
	 * @generated
	 */
	AutomobileType getTypeVoiture();

	/**
	 * Sets the value of the '{@link tp.metaprogramming.memo.Automobile#getTypeVoiture <em>Type Voiture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Voiture</em>' attribute.
	 * @see tp.metaprogramming.memo.AutomobileType
	 * @see #getTypeVoiture()
	 * @generated
	 */
	void setTypeVoiture(AutomobileType value);

} // Automobile
