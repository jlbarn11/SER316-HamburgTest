package net.sf.memoranda;

import java.util.Collection;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>CurrentProjectTest</code> contains tests for the class <code>{@link CurrentProject}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:15 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class CurrentProjectTest {
	/**
	 * Run the CurrentProject() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testCurrentProject_1()
		throws Exception {
		CurrentProject result = new CurrentProject();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void addProjectListener(ProjectListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testAddProjectListener_1()
		throws Exception {
		ProjectListener pl = null;

		CurrentProject.addProjectListener(pl);

		// add additional test code here
	}

	/**
	 * Run the void free() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testFree_1()
		throws Exception {

		CurrentProject.free();

		// add additional test code here
	}

	/**
	 * Run the Project get() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {

		Project result = CurrentProject.get();

		// add additional test code here
		assertNotNull(result);
		assertEquals("__default", result.getID());
		assertEquals("Daily To-Do", result.getTitle());
		assertEquals(1, result.getStatus());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getEndDate());
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

		Collection result = CurrentProject.getChangeListeners();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the NoteList getNoteList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testGetNoteList_1()
		throws Exception {

		NoteList result = CurrentProject.getNoteList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getActiveNote());
	}

	/**
	 * Run the ResourcesList getResourcesList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testGetResourcesList_1()
		throws Exception {

		ResourcesList result = CurrentProject.getResourcesList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getAllResourcesCount());
	}

	/**
	 * Run the TaskList getTaskList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testGetTaskList_1()
		throws Exception {

		TaskList result = CurrentProject.getTaskList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void save() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testSave_1()
		throws Exception {

		CurrentProject.save();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:200)
		//       at java.io.FileOutputStream.<init>(FileOutputStream.java:101)
		//       at net.sf.memoranda.util.FileStorage.saveDocument(FileStorage.java:72)
		//       at net.sf.memoranda.util.FileStorage.storeNoteList(FileStorage.java:350)
		//       at net.sf.memoranda.CurrentProject.save(CurrentProject.java:118)
	}

	/**
	 * Run the void set(Project) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testSet_1()
		throws Exception {
		Project project = new ProjectImpl(new Element(""));

		CurrentProject.set(project);

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
	 * Run the void set(Project) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:15 PM
	 */
	@Test
	public void testSet_2()
		throws Exception {
		Project project = new ProjectImpl(new Element(""));

		CurrentProject.set(project);

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
		new org.junit.runner.JUnitCore().run(CurrentProjectTest.class);
	}
}