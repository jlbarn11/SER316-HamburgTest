package net.sf.memoranda.util;

import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>PriorityQueueTest</code> contains tests for the class <code>{@link PriorityQueue}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:34 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class PriorityQueueTest {
	/**
	 * Run the PriorityQueue(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testPriorityQueue_1()
		throws Exception {
		int size = 1;

		PriorityQueue result = new PriorityQueue(size);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.Vacia());
		assertEquals(null, result.extraer());
	}

	/**
	 * Run the boolean Vacia() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testVacia_1()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);

		boolean result = fixture.Vacia();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean Vacia() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testVacia_2()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));

		boolean result = fixture.Vacia();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the Element extraer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testExtraer_1()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));

		Element result = fixture.extraer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Element extraer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testExtraer_2()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));

		Element result = fixture.extraer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Element extraer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testExtraer_3()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));

		Element result = fixture.extraer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Element extraer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testExtraer_4()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));

		Element result = fixture.extraer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the Element extraer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testExtraer_5()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);

		Element result = fixture.extraer();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void insertar(Pair) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testInsertar_1()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));
		Pair x = new Pair(new Element(""), 1);

		fixture.insertar(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
	}

	/**
	 * Run the void insertar(Pair) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testInsertar_2()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));
		Pair x = new Pair(new Element(""), 1);

		fixture.insertar(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
	}

	/**
	 * Run the void insertar(Pair) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testInsertar_3()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));
		Pair x = new Pair(new Element(""), 1);

		fixture.insertar(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
	}

	/**
	 * Run the void insertar(Pair) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testInsertar_4()
		throws Exception {
		PriorityQueue fixture = new PriorityQueue(1);
		fixture.insertar(new Pair(new Element(""), 1));
		Pair x = new Pair(new Element(""), 1);

		fixture.insertar(x);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PriorityQueueTest.class);
	}
}