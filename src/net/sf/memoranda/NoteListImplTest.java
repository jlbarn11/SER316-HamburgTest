package net.sf.memoranda;

import java.util.Collection;
import nu.xom.Document;
import net.sf.memoranda.date.CalendarDate;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>NoteListImplTest</code> contains tests for the class <code>{@link NoteListImpl}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:25 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class NoteListImplTest {
	/**
	 * Run the NoteListImpl(Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testNoteListImpl_1()
		throws Exception {
		Project prj = new ProjectImpl(new Element(""));

		NoteListImpl result = new NoteListImpl(prj);

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
	 * Run the NoteListImpl(Document,Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testNoteListImpl_2()
		throws Exception {
		Document doc = new Document(new Element(""));
		Project prj = new ProjectImpl(new Element(""));

		NoteListImpl result = new NoteListImpl(doc, prj);

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
	 * Run the Note createNoteForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testCreateNoteForDate_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate(1, 1, 1);

		Note result = fixture.createNoteForDate(date);

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
	 * Run the Note createNoteForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testCreateNoteForDate_2()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate(1, 1, 1);

		Note result = fixture.createNoteForDate(date);

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
	 * Run the Note getActiveNote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveNote_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Note result = fixture.getActiveNote();

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
	 * Run the Collection getAllNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllNotes_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getAllNotes();

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
	 * Run the Collection getAllNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllNotes_2()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getAllNotes();

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
	 * Run the Collection getAllNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllNotes_3()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getAllNotes();

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
	 * Run the Collection getAllNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllNotes_4()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getAllNotes();

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
	 * Run the Collection getAllNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllNotes_5()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getAllNotes();

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
	 * Run the Collection getMarkedNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetMarkedNotes_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getMarkedNotes();

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
	 * Run the Collection getMarkedNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetMarkedNotes_2()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getMarkedNotes();

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
	 * Run the Collection getMarkedNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetMarkedNotes_3()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getMarkedNotes();

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
	 * Run the Collection getMarkedNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetMarkedNotes_4()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getMarkedNotes();

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
	 * Run the Collection getMarkedNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetMarkedNotes_5()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getMarkedNotes();

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
	 * Run the Collection getMarkedNotes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetMarkedNotes_6()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getMarkedNotes();

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
	 * Run the Note getNoteForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNoteForDate_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();

		Note result = fixture.getNoteForDate(date);

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
	 * Run the Note getNoteForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNoteForDate_2()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();

		Note result = fixture.getNoteForDate(date);

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
	 * Run the Note getNoteForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNoteForDate_3()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();

		Note result = fixture.getNoteForDate(date);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_2()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_3()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_4()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_5()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_6()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_7()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_8()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_9()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate();

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_10()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate(1, 1, 1);
		CalendarDate endDate = new CalendarDate(1, 1, 1);

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Collection getNotesForPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetNotesForPeriod_11()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		Collection result = fixture.getNotesForPeriod(startDate, endDate);

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
	 * Run the Document getXMLContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetXMLContent_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Document result = fixture.getXMLContent();

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
	 * Run the void removeNote(CalendarDate,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveNote_1()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();
		String id = "";

		fixture.removeNote(date, id);

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
	 * Run the void removeNote(CalendarDate,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveNote_2()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();
		String id = "";

		fixture.removeNote(date, id);

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
	 * Run the void removeNote(CalendarDate,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveNote_3()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();
		String id = "";

		fixture.removeNote(date, id);

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
	 * Run the void removeNote(CalendarDate,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveNote_4()
		throws Exception {
		NoteListImpl fixture = new NoteListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate date = new CalendarDate();
		String id = "";

		fixture.removeNote(date, id);

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
		new org.junit.runner.JUnitCore().run(NoteListImplTest.class);
	}
}