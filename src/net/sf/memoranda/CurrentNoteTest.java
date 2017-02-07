package net.sf.memoranda;

import java.util.Collection;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>CurrentNoteTest</code> contains tests for the class <code>{@link CurrentNote}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:15 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class CurrentNoteTest {
	/**
	 * Run the CurrentNote() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testCurrentNote_1()
		throws Exception {
		CurrentNote result = new CurrentNote();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addNoteListener(NoteListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testAddNoteListener_1()
		throws Exception {
		NoteListener nl = null;

		CurrentNote.addNoteListener(nl);

		// add additional test code here
	}

	/**
	 * Run the Note get() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {

		Note result = CurrentNote.get();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Collection getChangeListeners() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testGetChangeListeners_1()
		throws Exception {

		Collection result = CurrentNote.getChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the void reset() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testReset_1()
		throws Exception {

		CurrentNote.reset();

		// add additional test code here
	}

	/**
	 * Run the void set(Note,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testSet_1()
		throws Exception {
		Note note = new NoteImpl(new Element(""), new ProjectImpl(new Element("")));
		boolean toSaveCurrentNote = true;

		CurrentNote.set(note, toSaveCurrentNote);

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
	 * @generatedBy CodePro at 2/6/17 5:15 PM
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
	 * @generatedBy CodePro at 2/6/17 5:15 PM
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
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CurrentNoteTest.class);
	}
}