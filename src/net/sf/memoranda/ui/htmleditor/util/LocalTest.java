package net.sf.memoranda.ui.htmleditor.util;

import java.util.Hashtable;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LocalTest</code> contains tests for the class <code>{@link Local}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:33 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class LocalTest {
	/**
	 * Run the Local() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testLocal_1()
		throws Exception {
		Local result = new Local();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		String key = "";

		String result = Local.getString(key);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetString_2()
		throws Exception {
		String key = "";

		String result = Local.getString(key);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetString_3()
		throws Exception {
		String key = "";

		String result = Local.getString(key);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testGetString_4()
		throws Exception {
		String key = "";

		String result = Local.getString(key);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setMessages(Hashtable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:33 PM
	 */
	@Test
	public void testSetMessages_1()
		throws Exception {
		Hashtable msgs = new Hashtable();

		Local.setMessages(msgs);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(LocalTest.class);
	}
}