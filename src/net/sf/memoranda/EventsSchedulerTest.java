package net.sf.memoranda;

import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EventsSchedulerTest</code> contains tests for the class <code>{@link EventsScheduler}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:20 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class EventsSchedulerTest {
	/**
	 * Run the EventsScheduler() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testEventsScheduler_1()
		throws Exception {
		EventsScheduler result = new EventsScheduler();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addListener(EventNotificationListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testAddListener_1()
		throws Exception {
		EventNotificationListener enl = new DefaultEventNotifier();

		EventsScheduler.addListener(enl);

		// add additional test code here
	}

	/**
	 * Run the void cancelAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCancelAll_1()
		throws Exception {

		EventsScheduler.cancelAll();

		// add additional test code here
	}

	/**
	 * Run the void cancelAll() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCancelAll_2()
		throws Exception {

		EventsScheduler.cancelAll();

		// add additional test code here
	}

	/**
	 * Run the Event getFirstScheduledEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetFirstScheduledEvent_1()
		throws Exception {

		Event result = EventsScheduler.getFirstScheduledEvent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Event getFirstScheduledEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetFirstScheduledEvent_2()
		throws Exception {

		Event result = EventsScheduler.getFirstScheduledEvent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Event getFirstScheduledEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetFirstScheduledEvent_3()
		throws Exception {

		Event result = EventsScheduler.getFirstScheduledEvent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Event getFirstScheduledEvent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetFirstScheduledEvent_4()
		throws Exception {

		Event result = EventsScheduler.getFirstScheduledEvent();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Vector getScheduledEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetScheduledEvents_1()
		throws Exception {

		Vector result = EventsScheduler.getScheduledEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Vector getScheduledEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetScheduledEvents_2()
		throws Exception {

		Vector result = EventsScheduler.getScheduledEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {

		EventsScheduler.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {

		EventsScheduler.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {

		EventsScheduler.init();

		// add additional test code here
	}

	/**
	 * Run the boolean isEventScheduled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testIsEventScheduled_1()
		throws Exception {

		boolean result = EventsScheduler.isEventScheduled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEventScheduled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testIsEventScheduled_2()
		throws Exception {

		boolean result = EventsScheduler.isEventScheduled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
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
	 * @generatedBy CodePro at 2/6/17 5:20 PM
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
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EventsSchedulerTest.class);
	}
}