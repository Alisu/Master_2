/**
 */
package memo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link memo.Automible#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see memo.MemoPackage#getAutomible()
 * @model
 * @generated
 */
public interface Automible extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link memo.AutomobileType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see memo.AutomobileType
	 * @see #setType(AutomobileType)
	 * @see memo.MemoPackage#getAutomible_Type()
	 * @model
	 * @generated
	 */
	AutomobileType getType();

	/**
	 * Sets the value of the '{@link memo.Automible#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see memo.AutomobileType
	 * @see #getType()
	 * @generated
	 */
	void setType(AutomobileType value);

} // Automible
