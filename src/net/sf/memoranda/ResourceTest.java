package net.sf.memoranda;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResourceTest</code> contains tests for the class <code>{@link Resource}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:25 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class ResourceTest {
	/**
	 * Run the Resource(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testResource_1()
		throws Exception {
		String path = "";

		Resource result = new Resource(path);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getPath());
		assertEquals(false, result.isProjectFile());
		assertEquals(false, result.isInetShortcut());
	}

	/**
	 * Run the Resource(String,boolean,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testResource_2()
		throws Exception {
		String path = "";
		boolean isInetShortcut = true;
		boolean isProjectFile = true;

		Resource result = new Resource(path, isInetShortcut, isProjectFile);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getPath());
		assertEquals(true, result.isProjectFile());
		assertEquals(true, result.isInetShortcut());
	}

	/**
	 * Run the String getPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testGetPath_1()
		throws Exception {
		Resource fixture = new Resource("", true, true);

		String result = fixture.getPath();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isInetShortcut() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testIsInetShortcut_1()
		throws Exception {
		Resource fixture = new Resource("", true, true);

		boolean result = fixture.isInetShortcut();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isInetShortcut() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testIsInetShortcut_2()
		throws Exception {
		Resource fixture = new Resource("", false, true);

		boolean result = fixture.isInetShortcut();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isProjectFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testIsProjectFile_1()
		throws Exception {
		Resource fixture = new Resource("", true, true);

		boolean result = fixture.isProjectFile();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isProjectFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:25 PM
	 */
	@Test
	public void testIsProjectFile_2()
		throws Exception {
		Resource fixture = new Resource("", true, false);

		boolean result = fixture.isProjectFile();

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(ResourceTest.class);
	}
}