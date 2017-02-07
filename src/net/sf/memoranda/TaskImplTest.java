package net.sf.memoranda;

import java.util.Collection;
import net.sf.memoranda.date.CalendarDate;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>TaskImplTest</code> contains tests for the class <code>{@link TaskImpl}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:28 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class TaskImplTest {
	/**
	 * Run the TaskImpl(Element,TaskList) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testTaskImpl_1()
		throws Exception {
		Element taskElement = new Element("");
		TaskList tl = new TaskListImpl(new ProjectImpl(new Element("")));

		TaskImpl result = new TaskImpl(taskElement, tl);

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
	 * Run the void addDependsFrom(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testAddDependsFrom_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Task task = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.addDependsFrom(task);

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
	 * Run the int compareTo(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Object o = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.compareTo(o);

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
	 * Run the int compareTo(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Object o = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.compareTo(o);

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
	 * Run the int compareTo(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testCompareTo_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Object o = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.compareTo(o);

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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Object o = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Object o = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the void freeze() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testFreeze_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.freeze();

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
	 * Run the Element getContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetContent_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Element result = fixture.getContent();

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
	 * Run the Collection getDependsFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetDependsFrom_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Collection result = fixture.getDependsFrom();

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
	 * Run the Collection getDependsFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetDependsFrom_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Collection result = fixture.getDependsFrom();

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
	 * Run the Collection getDependsFrom() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetDependsFrom_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Collection result = fixture.getDependsFrom();

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
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.getDescription();

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
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetDescription_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.getDescription();

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
	 * Run the long getEffort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEffort_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.getEffort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getEffort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEffort_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.getEffort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the long getEffort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEffort_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.getEffort();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the CalendarDate getEndDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEndDate_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEndDate();

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
	 * Run the CalendarDate getEndDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEndDate_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEndDate();

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
	 * Run the CalendarDate getEndDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEndDate_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEndDate();

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
	 * Run the CalendarDate getEndDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetEndDate_4()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEndDate();

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
	 * Run the String getID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetID_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.getID();

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
	 * Run the String getParentId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetParentId_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.getParentId();

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
	 * Run the String getParentId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetParentId_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.getParentId();

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
	 * Run the Task getParentTask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetParentTask_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Task result = fixture.getParentTask();

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
	 * Run the Task getParentTask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetParentTask_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Task result = fixture.getParentTask();

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
	 * Run the Task getParentTask() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetParentTask_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Task result = fixture.getParentTask();

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
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetPriority_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.getPriority();

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
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetPriority_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.getPriority();

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
	 * Run the int getPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetPriority_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.getPriority();

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
	 * Run the int getProgress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetProgress_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.getProgress();

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
	 * Run the int getProgress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetProgress_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		int result = fixture.getProgress();

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
	 * Run the long getRate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetRate_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.getRate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertEquals(0L, result);
	}

	/**
	 * Run the CalendarDate getStartDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStartDate_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getStartDate();

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_4()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_5()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_6()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the int getStatus(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetStatus_7()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		int result = fixture.getStatus(date);

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
	 * Run the Task getSubTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetSubTask_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String id = "";

		Task result = fixture.getSubTask(id);

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
	 * Run the Task getSubTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetSubTask_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String id = "";

		Task result = fixture.getSubTask(id);

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
	 * Run the Task getSubTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetSubTask_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String id = "";

		Task result = fixture.getSubTask(id);

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
	 * Run the Collection getSubTasks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetSubTasks_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		Collection result = fixture.getSubTasks();

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
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.getText();

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
	 * Run the boolean hasSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testHasSubTasks_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String id = "";

		boolean result = fixture.hasSubTasks(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testHasSubTasks_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String id = "";

		boolean result = fixture.hasSubTasks(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testHasSubTasks_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String id = "";

		boolean result = fixture.hasSubTasks(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    nu.xom.IllegalNameException: NCNames cannot be empty
		//       at nu.xom.Verifier.throwIllegalNameException(Unknown Source)
		//       at nu.xom.Verifier.checkNCName(Unknown Source)
		//       at nu.xom.Element._setLocalName(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		//       at nu.xom.Element.<init>(Unknown Source)
		assertTrue(result);
	}

	/**
	 * Run the void removeDependsFrom(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testRemoveDependsFrom_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Task task = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.removeDependsFrom(task);

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
	 * Run the void removeDependsFrom(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testRemoveDependsFrom_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Task task = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.removeDependsFrom(task);

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
	 * Run the void removeDependsFrom(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testRemoveDependsFrom_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		Task task = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.removeDependsFrom(task);

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
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String s = "";

		fixture.setDescription(s);

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
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetDescription_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String s = "";

		fixture.setDescription(s);

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
	 * Run the void setEffort(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetEffort_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		long effort = 1L;

		fixture.setEffort(effort);

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
	 * Run the void setEndDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetEndDate_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		fixture.setEndDate(date);

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
	 * Run the void setPriority(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetPriority_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		int p = 1;

		fixture.setPriority(p);

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
	 * Run the void setProgress(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetProgress_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		int p = 1;

		fixture.setProgress(p);

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
	 * Run the void setProgress(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetProgress_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		int p = -1;

		fixture.setProgress(p);

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
	 * Run the void setProgress(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetProgress_3()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		int p = 101;

		fixture.setProgress(p);

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
	 * Run the void setStartDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetStartDate_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		CalendarDate date = new CalendarDate();

		fixture.setStartDate(date);

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
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testSetText_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));
		String s = "";

		fixture.setText(s);

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
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		String result = fixture.toString();

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
	 * Run the void unfreeze() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testUnfreeze_1()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.unfreeze();

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
	 * Run the void unfreeze() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	@Test
	public void testUnfreeze_2()
		throws Exception {
		TaskImpl fixture = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.unfreeze();

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
	 * @generatedBy CodePro at 2/6/17 5:28 PM
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
	 * @generatedBy CodePro at 2/6/17 5:28 PM
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
	 * @generatedBy CodePro at 2/6/17 5:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TaskImplTest.class);
	}
}