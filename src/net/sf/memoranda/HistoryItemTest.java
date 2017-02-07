package net.sf.memoranda;

import org.junit.*;
import nu.xom.Element;
import net.sf.memoranda.date.CalendarDate;
import static org.junit.Assert.*;

/**
 * The class <code>HistoryItemTest</code> contains tests for the class <code>{@link HistoryItem}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:21 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class HistoryItemTest {
	/**
	 * Run the HistoryItem(Note) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testHistoryItem_1()
		throws Exception {
		Note note = new NoteImpl(new Element(""), new ProjectImpl(new Element("")));

		HistoryItem result = new HistoryItem(note);

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
	 * Run the HistoryItem(CalendarDate,Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testHistoryItem_2()
		throws Exception {
		CalendarDate date = new CalendarDate();
		Project project = new ProjectImpl(new Element(""));

		HistoryItem result = new HistoryItem(date, project);

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
	 * Run the boolean equals(HistoryItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		HistoryItem fixture = new HistoryItem(new CalendarDate(), new ProjectImpl(new Element("")));
		HistoryItem i = new HistoryItem(new NoteImpl(new Element(""), new ProjectImpl(new Element(""))));

		boolean result = fixture.equals(i);

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
	 * Run the boolean equals(HistoryItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		HistoryItem fixture = new HistoryItem(new CalendarDate(), new ProjectImpl(new Element("")));
		HistoryItem i = new HistoryItem(new NoteImpl(new Element(""), new ProjectImpl(new Element(""))));

		boolean result = fixture.equals(i);

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
	 * Run the boolean equals(HistoryItem) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		HistoryItem fixture = new HistoryItem(new CalendarDate(), new ProjectImpl(new Element("")));
		HistoryItem i = new HistoryItem(new NoteImpl(new Element(""), new ProjectImpl(new Element(""))));

		boolean result = fixture.equals(i);

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
	 * Run the CalendarDate getDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		HistoryItem fixture = new HistoryItem(new CalendarDate(), new ProjectImpl(new Element("")));

		CalendarDate result = fixture.getDate();

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
	 * Run the Project getProject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	@Test
	public void testGetProject_1()
		throws Exception {
		HistoryItem fixture = new HistoryItem(new CalendarDate(), new ProjectImpl(new Element("")));

		Project result = fixture.getProject();

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
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:21 PM
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
	 * @generatedBy CodePro at 2/6/17 5:21 PM
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
	 * @generatedBy CodePro at 2/6/17 5:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HistoryItemTest.class);
	}
}