package net.sf.memoranda.ui.htmleditor.filechooser;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UtilsTest</code> contains tests for the class <code>{@link Utils}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:32 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class UtilsTest {
	/**
	 * Run the Utils() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 3:32 PM
	 */
	@Test
	public void testUtils_1()
		throws Exception {
		Utils result = new Utils();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getExtension(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:32 PM
	 */
	@Test
	public void testGetExtension_1()
		throws Exception {
		File f = new File("");

		String result = Utils.getExtension(f);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getExtension(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:32 PM
	 */
	@Test
	public void testGetExtension_2()
		throws Exception {
		File f = new File("");

		String result = Utils.getExtension(f);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getExtension(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:32 PM
	 */
	@Test
	public void testGetExtension_3()
		throws Exception {
		File f = new File("");

		String result = Utils.getExtension(f);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 3:32 PM
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
	 * @generatedBy CodePro at 2/6/17 3:32 PM
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
	 * @generatedBy CodePro at 2/6/17 3:32 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UtilsTest.class);
	}
}