package net.sf.memoranda;

import java.util.Vector;
import net.sf.memoranda.date.CalendarDate;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProjectManagerTest</code> contains tests for the class <code>{@link ProjectManager}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:25 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class ProjectManagerTest {
	/**
	 * Run the ProjectManager() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testProjectManager_1()
		throws Exception {
		ProjectManager result = new ProjectManager();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Project createProject(String,CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testCreateProject_1()
		throws Exception {
		String title = "";
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		Project result = ProjectManager.createProject(title, startDate, endDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at net.sf.memoranda.util.FileStorage.createProjectStorage(FileStorage.java:316)
		//       at net.sf.memoranda.ProjectManager.createProject(ProjectManager.java:109)
		//       at net.sf.memoranda.ProjectManager.createProject(ProjectManager.java:114)
		assertNotNull(result);
	}

	/**
	 * Run the Project createProject(String,String,CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testCreateProject_2()
		throws Exception {
		String id = "";
		String title = "";
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		Project result = ProjectManager.createProject(id, title, startDate, endDate);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getID());
		assertEquals("", result.getTitle());
		assertEquals(1, result.getStatus());
		assertEquals(null, result.getDescription());
	}

	/**
	 * Run the Vector getActiveProjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveProjects_1()
		throws Exception {

		Vector result = ProjectManager.getActiveProjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Vector getActiveProjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveProjects_2()
		throws Exception {

		Vector result = ProjectManager.getActiveProjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Vector getActiveProjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveProjects_3()
		throws Exception {

		Vector result = ProjectManager.getActiveProjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the int getActiveProjectsNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveProjectsNumber_1()
		throws Exception {

		int result = ProjectManager.getActiveProjectsNumber();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getActiveProjectsNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveProjectsNumber_2()
		throws Exception {

		int result = ProjectManager.getActiveProjectsNumber();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getActiveProjectsNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetActiveProjectsNumber_3()
		throws Exception {

		int result = ProjectManager.getActiveProjectsNumber();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the Vector getAllProjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllProjects_1()
		throws Exception {

		Vector result = ProjectManager.getAllProjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Vector getAllProjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllProjects_2()
		throws Exception {

		Vector result = ProjectManager.getAllProjects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the int getAllProjectsNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetAllProjectsNumber_1()
		throws Exception {

		int result = ProjectManager.getAllProjectsNumber();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the Project getProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetProject_1()
		throws Exception {
		String id = "";

		Project result = ProjectManager.getProject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Project getProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetProject_2()
		throws Exception {
		String id = "";

		Project result = ProjectManager.getProject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Project getProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetProject_3()
		throws Exception {
		String id = "";

		Project result = ProjectManager.getProject(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {

		ProjectManager.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {

		ProjectManager.init();

		// add additional test code here
	}

	/**
	 * Run the void removeProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveProject_1()
		throws Exception {
		String id = "";

		ProjectManager.removeProject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1036)
		//       at net.sf.memoranda.util.FileStorage.removeProjectStorage(FileStorage.java:260)
		//       at net.sf.memoranda.ProjectManager.removeProject(ProjectManager.java:122)
	}

	/**
	 * Run the void removeProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveProject_2()
		throws Exception {
		String id = "";

		ProjectManager.removeProject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1036)
		//       at net.sf.memoranda.util.FileStorage.removeProjectStorage(FileStorage.java:260)
		//       at net.sf.memoranda.ProjectManager.removeProject(ProjectManager.java:122)
	}

	/**
	 * Run the void removeProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveProject_3()
		throws Exception {
		String id = "";

		ProjectManager.removeProject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1036)
		//       at net.sf.memoranda.util.FileStorage.removeProjectStorage(FileStorage.java:260)
		//       at net.sf.memoranda.ProjectManager.removeProject(ProjectManager.java:122)
	}

	/**
	 * Run the void removeProject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testRemoveProject_4()
		throws Exception {
		String id = "";

		ProjectManager.removeProject(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot delete files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkDelete(CodeProJUnitSecurityManager.java:62)
		//       at java.io.File.delete(File.java:1036)
		//       at net.sf.memoranda.util.FileStorage.removeProjectStorage(FileStorage.java:260)
		//       at net.sf.memoranda.ProjectManager.removeProject(ProjectManager.java:122)
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
		new org.junit.runner.JUnitCore().run(ProjectManagerTest.class);
	}
}