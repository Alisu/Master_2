/**
 */
package memo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see memo.MemoFactory
 * @model kind="package"
 * @generated
 */
public interface MemoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "memo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/memo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "memo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemoPackage eINSTANCE = memo.impl.MemoPackageImpl.init();

	/**
	 * The meta object id for the '{@link memo.impl.MemoClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.impl.MemoClassImpl
	 * @see memo.impl.MemoPackageImpl#getMemoClass()
	 * @generated
	 */
	int MEMO_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_CLASS__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link memo.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.impl.NamedElementImpl
	 * @see memo.impl.MemoPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__INSTANCES = MEMO_CLASS__INSTANCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MEMO_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MEMO_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MEMO_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link memo.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.impl.PersonImpl
	 * @see memo.impl.MemoPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INSTANCES = NAMED_ELEMENT__INSTANCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HAS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Birthday</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___BIRTHDAY = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link memo.impl.AutomibleImpl <em>Automible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.impl.AutomibleImpl
	 * @see memo.impl.MemoPackageImpl#getAutomible()
	 * @generated
	 */
	int AUTOMIBLE = 3;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMIBLE__INSTANCES = NAMED_ELEMENT__INSTANCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMIBLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMIBLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMIBLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Automible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMIBLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link memo.impl.WorldImpl <em>World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.impl.WorldImpl
	 * @see memo.impl.MemoPackageImpl#getWorld()
	 * @generated
	 */
	int WORLD = 4;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__INSTANCES = MEMO_CLASS__INSTANCES;

	/**
	 * The feature id for the '<em><b>Automibles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__AUTOMIBLES = MEMO_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Population</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD__POPULATION = MEMO_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_FEATURE_COUNT = MEMO_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_OPERATION_COUNT = MEMO_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link memo.AutomobileType <em>Automobile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see memo.AutomobileType
	 * @see memo.impl.MemoPackageImpl#getAutomobileType()
	 * @generated
	 */
	int AUTOMOBILE_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link memo.MemoClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see memo.MemoClass
	 * @generated
	 */
	EClass getMemoClass();

	/**
	 * Returns the meta object for the attribute list '{@link memo.MemoClass#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instances</em>'.
	 * @see memo.MemoClass#getInstances()
	 * @see #getMemoClass()
	 * @generated
	 */
	EAttribute getMemoClass_Instances();

	/**
	 * Returns the meta object for class '{@link memo.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see memo.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link memo.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see memo.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link memo.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see memo.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link memo.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see memo.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the reference list '{@link memo.Person#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see memo.Person#getHas()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Has();

	/**
	 * Returns the meta object for the '{@link memo.Person#birthday() <em>Birthday</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Birthday</em>' operation.
	 * @see memo.Person#birthday()
	 * @generated
	 */
	EOperation getPerson__Birthday();

	/**
	 * Returns the meta object for class '{@link memo.Automible <em>Automible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automible</em>'.
	 * @see memo.Automible
	 * @generated
	 */
	EClass getAutomible();

	/**
	 * Returns the meta object for the attribute '{@link memo.Automible#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see memo.Automible#getType()
	 * @see #getAutomible()
	 * @generated
	 */
	EAttribute getAutomible_Type();

	/**
	 * Returns the meta object for class '{@link memo.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World</em>'.
	 * @see memo.World
	 * @generated
	 */
	EClass getWorld();

	/**
	 * Returns the meta object for the containment reference list '{@link memo.World#getAutomibles <em>Automibles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Automibles</em>'.
	 * @see memo.World#getAutomibles()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Automibles();

	/**
	 * Returns the meta object for the containment reference list '{@link memo.World#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Population</em>'.
	 * @see memo.World#getPopulation()
	 * @see #getWorld()
	 * @generated
	 */
	EReference getWorld_Population();

	/**
	 * Returns the meta object for enum '{@link memo.AutomobileType <em>Automobile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Automobile Type</em>'.
	 * @see memo.AutomobileType
	 * @generated
	 */
	EEnum getAutomobileType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MemoFactory getMemoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link memo.impl.MemoClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memo.impl.MemoClassImpl
		 * @see memo.impl.MemoPackageImpl#getMemoClass()
		 * @generated
		 */
		EClass MEMO_CLASS = eINSTANCE.getMemoClass();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO_CLASS__INSTANCES = eINSTANCE.getMemoClass_Instances();

		/**
		 * The meta object literal for the '{@link memo.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memo.impl.NamedElementImpl
		 * @see memo.impl.MemoPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link memo.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memo.impl.PersonImpl
		 * @see memo.impl.MemoPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__HAS = eINSTANCE.getPerson_Has();

		/**
		 * The meta object literal for the '<em><b>Birthday</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___BIRTHDAY = eINSTANCE.getPerson__Birthday();

		/**
		 * The meta object literal for the '{@link memo.impl.AutomibleImpl <em>Automible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memo.impl.AutomibleImpl
		 * @see memo.impl.MemoPackageImpl#getAutomible()
		 * @generated
		 */
		EClass AUTOMIBLE = eINSTANCE.getAutomible();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMIBLE__TYPE = eINSTANCE.getAutomible_Type();

		/**
		 * The meta object literal for the '{@link memo.impl.WorldImpl <em>World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memo.impl.WorldImpl
		 * @see memo.impl.MemoPackageImpl#getWorld()
		 * @generated
		 */
		EClass WORLD = eINSTANCE.getWorld();

		/**
		 * The meta object literal for the '<em><b>Automibles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__AUTOMIBLES = eINSTANCE.getWorld_Automibles();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD__POPULATION = eINSTANCE.getWorld_Population();

		/**
		 * The meta object literal for the '{@link memo.AutomobileType <em>Automobile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see memo.AutomobileType
		 * @see memo.impl.MemoPackageImpl#getAutomobileType()
		 * @generated
		 */
		EEnum AUTOMOBILE_TYPE = eINSTANCE.getAutomobileType();

	}

} //MemoPackage
