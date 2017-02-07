package net.sf.memoranda.util;

import java.util.Vector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MimeTypesListTest</code> contains tests for the class <code>{@link MimeTypesList}</code>.
 *
 * @generatedBy CodePro at 2/6/17 12:10 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class MimeTypesListTest {
	/**
	 * Run the MimeTypesList() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testMimeTypesList_1()
		throws Exception {
		MimeTypesList result = new MimeTypesList();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the MimeType addMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testAddMimeType_1()
		throws Exception {
		String mimeId = "";

		MimeType result = MimeTypesList.addMimeType(mimeId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtension());
		assertEquals("", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("", result.getMimeTypeId());
	}

	/**
	 * Run the Vector getAllMimeTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetAllMimeTypes_1()
		throws Exception {

		Vector result = MimeTypesList.getAllMimeTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(23, result.size());
	}

	/**
	 * Run the Vector getAllMimeTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetAllMimeTypes_2()
		throws Exception {

		Vector result = MimeTypesList.getAllMimeTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(23, result.size());
	}

	/**
	 * Run the AppList getAppList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetAppList_1()
		throws Exception {

		AppList result = MimeTypesList.getAppList();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getBrowserExec());
	}

	/**
	 * Run the String getExtension(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetExtension_1()
		throws Exception {
		String s = "";

		String result = MimeTypesList.getExtension(s);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getExtension(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetExtension_2()
		throws Exception {
		String s = "";

		String result = MimeTypesList.getExtension(s);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getExtension(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetExtension_3()
		throws Exception {
		String s = "";

		String result = MimeTypesList.getExtension(s);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the MimeType getMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeType_1()
		throws Exception {
		String mimeId = "";

		MimeType result = MimeTypesList.getMimeType(mimeId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtension());
		assertEquals("Unknown", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("__UNKNOWN", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeType_2()
		throws Exception {
		String mimeId = "";

		MimeType result = MimeTypesList.getMimeType(mimeId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtension());
		assertEquals("Unknown", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("__UNKNOWN", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeType_3()
		throws Exception {
		String mimeId = "";

		MimeType result = MimeTypesList.getMimeType(mimeId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtension());
		assertEquals("Unknown", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("__UNKNOWN", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeTypeByExt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeTypeByExt_1()
		throws Exception {
		String ext = "";

		MimeType result = MimeTypesList.getMimeTypeByExt(ext);

		// add additional test code here
		assertNotNull(result);
		assertEquals("txt", result.getExtension());
		assertEquals("Plain text", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("text/plain", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeTypeByExt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeTypeByExt_2()
		throws Exception {
		String ext = "";

		MimeType result = MimeTypesList.getMimeTypeByExt(ext);

		// add additional test code here
		assertNotNull(result);
		assertEquals("txt", result.getExtension());
		assertEquals("Plain text", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("text/plain", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeTypeByExt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeTypeByExt_3()
		throws Exception {
		String ext = "";

		MimeType result = MimeTypesList.getMimeTypeByExt(ext);

		// add additional test code here
		assertNotNull(result);
		assertEquals("txt", result.getExtension());
		assertEquals("Plain text", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("text/plain", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeTypeByExt(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeTypeByExt_4()
		throws Exception {
		String ext = "";

		MimeType result = MimeTypesList.getMimeTypeByExt(ext);

		// add additional test code here
		assertNotNull(result);
		assertEquals("txt", result.getExtension());
		assertEquals("Plain text", result.getLabel());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("text/plain", result.getMimeTypeId());
	}

	/**
	 * Run the MimeType getMimeTypeForFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testGetMimeTypeForFile_1()
		throws Exception {
		String path = "";

		MimeType result = MimeTypesList.getMimeTypeForFile(path);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.memoranda.util.MimeTypesList.getMimeTypeByExt(MimeTypesList.java:55)
		//       at net.sf.memoranda.util.MimeTypesList.getMimeTypeForFile(MimeTypesList.java:38)
		assertNotNull(result);
	}

	/**
	 * Run the void removeMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testRemoveMimeType_1()
		throws Exception {
		String mimeId = "";

		MimeTypesList.removeMimeType(mimeId);

		// add additional test code here
	}

	/**
	 * Run the void removeMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testRemoveMimeType_2()
		throws Exception {
		String mimeId = "";

		MimeTypesList.removeMimeType(mimeId);

		// add additional test code here
	}

	/**
	 * Run the void removeMimeType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	@Test
	public void testRemoveMimeType_3()
		throws Exception {
		String mimeId = "";

		MimeTypesList.removeMimeType(mimeId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 12:10 PM
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
	 * @generatedBy CodePro at 2/6/17 12:10 PM
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
	 * @generatedBy CodePro at 2/6/17 12:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MimeTypesListTest.class);
	}
}