package net.sf.memoranda;

import org.junit.*;
import nu.xom.Element;
import net.sf.memoranda.date.CalendarDate;
import static org.junit.Assert.*;

/**
 * The class <code>ProjectImplTest</code> contains tests for the class <code>{@link ProjectImpl}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:25 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class ProjectImplTest {
	/**
	 * Run the ProjectImpl(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testProjectImpl_1()
		throws Exception {
		Element root = new Element("");

		ProjectImpl result = new ProjectImpl(root);

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
	 * Run the void freeze() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testFreeze_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		fixture.freeze();

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
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		String result = fixture.getDescription();

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
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetDescription_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		String result = fixture.getDescription();

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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetEndDate_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetEndDate_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

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
	 * Run the String getID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetID_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		String result = fixture.getID();

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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStartDate_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStartDate_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

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
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		int result = fixture.getStatus();

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
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStatus_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		int result = fixture.getStatus();

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
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStatus_3()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		int result = fixture.getStatus();

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
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStatus_4()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		int result = fixture.getStatus();

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
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStatus_5()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		int result = fixture.getStatus();

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
	 * Run the int getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetStatus_6()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		int result = fixture.getStatus();

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
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		String result = fixture.getTitle();

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
	 * Run the String getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetTitle_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		String result = fixture.getTitle();

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
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		String s = "";

		fixture.setDescription(s);

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
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetDescription_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		String s = "";

		fixture.setDescription(s);

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
	 * Run the void setEndDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetEndDate_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		CalendarDate date = null;

		fixture.setEndDate(date);

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
	 * Run the void setEndDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetEndDate_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		CalendarDate date = null;

		fixture.setEndDate(date);

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
	 * Run the void setEndDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetEndDate_3()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();

		fixture.setEndDate(date);

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
	 * Run the void setStartDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetStartDate_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();

		fixture.setStartDate(date);

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
	 * Run the void setStartDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetStartDate_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		CalendarDate date = null;

		fixture.setStartDate(date);

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
	 * Run the void setTitle(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testSetTitle_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));
		String title = "";

		fixture.setTitle(title);

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
	 * Run the void unfreeze() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testUnfreeze_1()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		fixture.unfreeze();

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
	 * Run the void unfreeze() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testUnfreeze_2()
		throws Exception {
		ProjectImpl fixture = new ProjectImpl(new Element(""));

		fixture.unfreeze();

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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
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
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProjectImplTest.class);
	}
}