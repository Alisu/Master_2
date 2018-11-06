/**
 */
package memo.tests;

import junit.textui.TestRunner;

import memo.Automible;
import memo.MemoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Automible</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AutomibleTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AutomibleTest.class);
	}

	/**
	 * Constructs a new Automible test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomibleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Automible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Automible getFixture() {
		return (Automible)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MemoFactory.eINSTANCE.createAutomible());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AutomibleTest
