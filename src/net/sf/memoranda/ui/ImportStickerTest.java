package net.sf.memoranda.ui;

import java.awt.HeadlessException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImportStickerTest</code> contains tests for the class <code>{@link ImportSticker}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:33 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class ImportStickerTest {
	/**
	 * Run the ImportSticker(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testImportSticker_1()
		throws Exception {
		String x = "";

		ImportSticker result = new ImportSticker(x);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean import_file() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testImport_file_1()
		throws Exception {
		ImportSticker fixture = new ImportSticker("");

		boolean result = fixture.import_file();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean import_file() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test(expected = java.awt.HeadlessException.class)
	public void testImport_file_2()
		throws Exception {
		ImportSticker fixture = new ImportSticker("");

		boolean result = fixture.import_file();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
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
	 * @generatedBy CodePro at 2/6/17 3:33 PM
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
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ImportStickerTest.class);
	}
}