package net.sf.memoranda.date;

import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CurrentDateTest</code> contains tests for the class <code>{@link CurrentDate}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:30 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class CurrentDateTest {
	/**
	 * Run the CurrentDate() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCurrentDate_1()
		throws Exception {
		CurrentDate result = new CurrentDate();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addDateListener(DateListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testAddDateListener_1()
		throws Exception {
		DateListener dl = null;

		CurrentDate.addDateListener(dl);

		// add additional test code here
	}

	/**
	 * Run the CalendarDate get() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {

		CalendarDate result = CurrentDate.get();

		// add additional test code here
		assertNotNull(result);
		assertEquals("6/1/2017", result.toString());
		assertEquals(6, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(2017, result.getYear());
		assertEquals("Feb 6, 2017", result.getMediumDateString());
		assertEquals("Monday, February 6, 2017", result.getFullDateString());
		assertEquals("February 6, 2017", result.getLongDateString());
		assertEquals("2/6/17", result.getShortDateString());
	}

	/**
	 * Run the Collection getChangeListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetChangeListeners_1()
		throws Exception {

		Collection result = CurrentDate.getChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {

		CurrentDate.reset();

		// add additional test code here
	}

	/**
	 * Run the void set(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testSet_1()
		throws Exception {
		CalendarDate date = new CalendarDate();

		CurrentDate.set(date);

		// add additional test code here
	}

	/**
	 * Run the void set(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testSet_2()
		throws Exception {
		CalendarDate date = new CalendarDate();

		CurrentDate.set(date);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
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
	 * @generatedBy CodePro at 2/6/17 5:30 PM
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
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CurrentDateTest.class);
	}
}