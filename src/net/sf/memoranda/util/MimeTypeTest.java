package net.sf.memoranda.util;

import javax.swing.ImageIcon;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>MimeTypeTest</code> contains tests for the class <code>{@link MimeType}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:33 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class MimeTypeTest {
	/**
	 * Run the MimeType() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testMimeType_1()
		throws Exception {

		MimeType result = new MimeType();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtension());
		assertEquals(null, result.getAppId());
		assertEquals("", result.getIconPath());
		assertEquals("__UNKNOWN", result.getMimeTypeId());
		assertEquals("Unknown", result.getLabel());
	}

	/**
	 * Run the MimeType(Element) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testMimeType_2()
		throws Exception {
		Element root = new Element("");

		MimeType result = new MimeType(root);

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
	 * Run the void addExtension(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testAddExtension_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String ext = "";

		fixture.addExtension(ext);

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
	 * Run the String getAppId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetAppId_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getAppId();

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
	 * Run the String getAppId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetAppId_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";

		String result = fixture.getAppId(plafCode);

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
	 * Run the String getAppId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetAppId_3()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";

		String result = fixture.getAppId(plafCode);

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
	 * Run the String getAppId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetAppId_4()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";

		String result = fixture.getAppId(plafCode);

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
	 * Run the String getExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetExtension_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getExtension();

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
	 * Run the String getExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetExtension_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getExtension();

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
	 * Run the String[] getExtensions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetExtensions_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String[] result = fixture.getExtensions();

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
	 * Run the String[] getExtensions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetExtensions_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String[] result = fixture.getExtensions();

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
	 * Run the ImageIcon getIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetIcon_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		ImageIcon result = fixture.getIcon();

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
	 * Run the ImageIcon getIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetIcon_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		ImageIcon result = fixture.getIcon();

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
	 * Run the String getIconPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetIconPath_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getIconPath();

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
	 * Run the String getIconPath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetIconPath_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getIconPath();

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
	 * Run the String getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element("a"));

		String result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.memoranda.util.MimeType.getLabel(MimeType.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetLabel_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getLabel();

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
	 * Run the String getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetLabel_3()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getLabel();

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
	 * Run the String getMimeTypeId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetMimeTypeId_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));

		String result = fixture.getMimeTypeId();

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
	 * Run the void setApp(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetApp_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String appId = "";

		fixture.setApp(appId);

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
	 * Run the void setApp(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetApp_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";
		String appId = "";

		fixture.setApp(plafCode, appId);

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
	 * Run the void setApp(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetApp_3()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";
		String appId = "";

		fixture.setApp(plafCode, appId);

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
	 * Run the void setApp(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetApp_4()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";
		String appId = "";

		fixture.setApp(plafCode, appId);

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
	 * Run the void setApp(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetApp_5()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String plafCode = "";
		String appId = "";

		fixture.setApp(plafCode, appId);

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
	 * Run the void setIconPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetIconPath_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String path = "";

		fixture.setIconPath(path);

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
	 * Run the void setIconPath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetIconPath_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String path = "";

		fixture.setIconPath(path);

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
	 * Run the void setLabel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetLabel_1()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String label = "";

		fixture.setLabel(label);

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
	 * Run the void setLabel(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetLabel_2()
		throws Exception {
		MimeType fixture = new MimeType(new Element(""));
		String label = "";

		fixture.setLabel(label);

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
		new org.junit.runner.JUnitCore().run(MimeTypeTest.class);
	}
}