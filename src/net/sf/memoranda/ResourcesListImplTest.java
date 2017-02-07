package net.sf.memoranda;

import java.util.Vector;
import nu.xom.Element;
import nu.xom.Document;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResourcesListImplTest</code> contains tests for the class <code>{@link ResourcesListImpl}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:26 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class ResourcesListImplTest {
	/**
	 * Run the ResourcesListImpl(Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testResourcesListImpl_1()
		throws Exception {
		Project prj = new ProjectImpl(new Element(""));

		ResourcesListImpl result = new ResourcesListImpl(prj);

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
	 * Run the ResourcesListImpl(Document,Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testResourcesListImpl_2()
		throws Exception {
		Document doc = new Document(new Element(""));
		Project prj = new ProjectImpl(new Element(""));

		ResourcesListImpl result = new ResourcesListImpl(doc, prj);

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
	 * Run the void addResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testAddResource_1()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		fixture.addResource(path);

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
	 * Run the void addResource(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testAddResource_2()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";
		boolean isInternetShortcut = true;
		boolean isProjectFile = true;

		fixture.addResource(path, isInternetShortcut, isProjectFile);

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
	 * Run the void addResource(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testAddResource_3()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";
		boolean isInternetShortcut = false;
		boolean isProjectFile = true;

		fixture.addResource(path, isInternetShortcut, isProjectFile);

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
	 * Run the void addResource(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testAddResource_4()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";
		boolean isInternetShortcut = true;
		boolean isProjectFile = false;

		fixture.addResource(path, isInternetShortcut, isProjectFile);

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
	 * Run the void addResource(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testAddResource_5()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";
		boolean isInternetShortcut = false;
		boolean isProjectFile = false;

		fixture.addResource(path, isInternetShortcut, isProjectFile);

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
	 * Run the Vector getAllResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetAllResources_1()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Vector result = fixture.getAllResources();

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
	 * Run the Vector getAllResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetAllResources_2()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Vector result = fixture.getAllResources();

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
	 * Run the int getAllResourcesCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetAllResourcesCount_1()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		int result = fixture.getAllResourcesCount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0, result);
	}

	/**
	 * Run the Resource getResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetResource_1()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		Resource result = fixture.getResource(path);

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
	 * Run the Resource getResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetResource_2()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		Resource result = fixture.getResource(path);

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
	 * Run the Resource getResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetResource_3()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		Resource result = fixture.getResource(path);

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
	 * Run the Document getXMLContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testGetXMLContent_1()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Document result = fixture.getXMLContent();

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
	 * Run the void removeResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testRemoveResource_1()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		fixture.removeResource(path);

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
	 * Run the void removeResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testRemoveResource_2()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		fixture.removeResource(path);

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
	 * Run the void removeResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testRemoveResource_3()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		fixture.removeResource(path);

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
	 * Run the void removeResource(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	@Test
	public void testRemoveResource_4()
		throws Exception {
		ResourcesListImpl fixture = new ResourcesListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String path = "";

		fixture.removeResource(path);

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
	 * @generatedBy CodePro at 2/6/17 5:26 PM
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
	 * @generatedBy CodePro at 2/6/17 5:26 PM
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
	 * @generatedBy CodePro at 2/6/17 5:26 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResourcesListImplTest.class);
	}
}