package net.sf.memoranda.util;

import java.io.File;
import net.sf.memoranda.NoteImpl;
import net.sf.memoranda.ProjectImpl;
import javax.swing.text.Document;
import net.sf.memoranda.Project;
import javax.swing.text.html.HTMLDocument;
import net.sf.memoranda.Note;
import nu.xom.Element;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HTMLFileExportTest</code> contains tests for the class <code>{@link HTMLFileExport}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:33 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class HTMLFileExportTest {
	/**
	 * Run the HTMLFileExport(File,Document,Note,String,boolean,String,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testHTMLFileExport_1()
		throws Exception {
		File f = new File("");
		Document doc = new HTMLDocument();
		Note note = new NoteImpl(new Element(""), new ProjectImpl(new Element("")));
		String charset = "";
		boolean num = true;
		String templFile = "";
		boolean xhtml = true;

		HTMLFileExport result = new HTMLFileExport(f, doc, note, charset, num, templFile, xhtml);

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
	 * Run the String convertToXHTML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testConvertToXHTML_1()
		throws Exception {
		String in = "";

		String result = HTMLFileExport.convertToXHTML(in);

		// add additional test code here
		assertEquals("<html/>\n", result);
	}

	/**
	 * Run the String convertToXHTML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testConvertToXHTML_2()
		throws Exception {
		String in = "";

		String result = HTMLFileExport.convertToXHTML(in);

		// add additional test code here
		assertEquals("<html/>\n", result);
	}

	/**
	 * Run the String convertToXHTML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testConvertToXHTML_3()
		throws Exception {
		String in = "";

		String result = HTMLFileExport.convertToXHTML(in);

		// add additional test code here
		assertEquals("<html/>\n", result);
	}

	/**
	 * Run the String convertToXHTML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testConvertToXHTML_4()
		throws Exception {
		String in = "";

		String result = HTMLFileExport.convertToXHTML(in);

		// add additional test code here
		assertEquals("<html/>\n", result);
	}

	/**
	 * Run the String convertToXHTML(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testConvertToXHTML_5()
		throws Exception {
		String in = "";

		String result = HTMLFileExport.convertToXHTML(in);

		// add additional test code here
		assertEquals("<html/>\n", result);
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
		new org.junit.runner.JUnitCore().run(HTMLFileExportTest.class);
	}
}