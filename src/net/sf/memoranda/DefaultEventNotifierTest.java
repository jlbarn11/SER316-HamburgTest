package net.sf.memoranda;

import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultEventNotifierTest</code> contains tests for the class <code>{@link DefaultEventNotifier}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:16 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class DefaultEventNotifierTest {
	/**
	 * Run the DefaultEventNotifier() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:16 PM
	 */
	@Test
	public void testDefaultEventNotifier_1()
		throws Exception {

		DefaultEventNotifier result = new DefaultEventNotifier();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void eventIsOccured(Event) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:16 PM
	 */
	@Test
	public void testEventIsOccured_1()
		throws Exception {
		DefaultEventNotifier fixture = new DefaultEventNotifier();
		Event ev = new EventImpl(new Element(""));

		fixture.eventIsOccured(ev);

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
	 * Run the void eventsChanged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:16 PM
	 */
	@Test
	public void testEventsChanged_1()
		throws Exception {
		DefaultEventNotifier fixture = new DefaultEventNotifier();

		fixture.eventsChanged();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:16 PM
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
	 * @generatedBy CodePro at 2/6/17 5:16 PM
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
	 * @generatedBy CodePro at 2/6/17 5:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultEventNotifierTest.class);
	}
}