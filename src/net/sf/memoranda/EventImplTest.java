package net.sf.memoranda;

import java.util.Date;
import net.sf.memoranda.date.CalendarDate;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>EventImplTest</code> contains tests for the class <code>{@link EventImpl}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:17 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class EventImplTest {
	/**
	 * Run the EventImpl(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testEventImpl_1()
		throws Exception {
		Element elem = new Element("");

		EventImpl result = new EventImpl(elem);

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
	 * Run the int compareTo(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));
		Object o = new EventImpl(new Element(""));

		int result = fixture.compareTo(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the Element getContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetContent_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		Element result = fixture.getContent();

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
	 * Run the CalendarDate getEndDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetEndDate_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		CalendarDate result = fixture.getEndDate();

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
	 * Run the CalendarDate getEndDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetEndDate_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		CalendarDate result = fixture.getEndDate();

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
	 * Run the int getHour() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetHour_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getHour();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getHour() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetHour_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getHour();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		String result = fixture.getId();

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
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetId_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		String result = fixture.getId();

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
	 * Run the int getMinute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetMinute_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getMinute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getMinute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetMinute_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getMinute();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPeriod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetPeriod_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getPeriod();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPeriod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetPeriod_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getPeriod();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getPeriod() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetPeriod_3()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getPeriod();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRepeat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetRepeat_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getRepeat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRepeat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetRepeat_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getRepeat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the int getRepeat() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetRepeat_3()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		int result = fixture.getRepeat();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the CalendarDate getStartDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetStartDate_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		CalendarDate result = fixture.getStartDate();

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
	 * Run the CalendarDate getStartDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetStartDate_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		CalendarDate result = fixture.getStartDate();

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
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		String result = fixture.getText();

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
	 * Run the Date getTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetTime_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		Date result = fixture.getTime();

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
	 * Run the String getTimeString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetTimeString_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		String result = fixture.getTimeString();

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
	 * Run the boolean getWorkingDays() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetWorkingDays_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		boolean result = fixture.getWorkingDays();

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
	 * Run the boolean getWorkingDays() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetWorkingDays_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		boolean result = fixture.getWorkingDays();

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
	 * Run the boolean getWorkingDays() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testGetWorkingDays_3()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		boolean result = fixture.getWorkingDays();

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
	 * Run the boolean isRepeatable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testIsRepeatable_1()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		boolean result = fixture.isRepeatable();

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
	 * Run the boolean isRepeatable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	@Test
	public void testIsRepeatable_2()
		throws Exception {
		EventImpl fixture = new EventImpl(new Element(""));

		boolean result = fixture.isRepeatable();

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
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:17 PM
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
	 * @generatedBy CodePro at 2/6/17 5:17 PM
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
	 * @generatedBy CodePro at 2/6/17 5:17 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EventImplTest.class);
	}
}