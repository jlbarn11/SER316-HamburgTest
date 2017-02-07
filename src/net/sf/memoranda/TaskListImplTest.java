package net.sf.memoranda;

import java.util.Collection;
import nu.xom.Document;
import net.sf.memoranda.date.CalendarDate;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>TaskListImplTest</code> contains tests for the class <code>{@link TaskListImpl}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:29 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class TaskListImplTest {
	/**
	 * Run the TaskListImpl(Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testTaskListImpl_1()
		throws Exception {
		Project prj = new ProjectImpl(new Element(""));

		TaskListImpl result = new TaskListImpl(prj);

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
	 * Run the TaskListImpl(Document,Project) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testTaskListImpl_2()
		throws Exception {
		Document doc = new Document(new Element(""));
		Project prj = new ProjectImpl(new Element(""));

		TaskListImpl result = new TaskListImpl(doc, prj);

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
	 * Run the long[] calculateCompletionFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateCompletionFromSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long[] result = fixture.calculateCompletionFromSubTasks(t);

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
	 * Run the long[] calculateCompletionFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateCompletionFromSubTasks_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long[] result = fixture.calculateCompletionFromSubTasks(t);

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
	 * Run the long[] calculateCompletionFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateCompletionFromSubTasks_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long[] result = fixture.calculateCompletionFromSubTasks(t);

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
	 * Run the long[] calculateCompletionFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateCompletionFromSubTasks_4()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long[] result = fixture.calculateCompletionFromSubTasks(t);

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
	 * Run the long calculateTotalEffortFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateTotalEffortFromSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.calculateTotalEffortFromSubTasks(t);

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
	 * Run the long calculateTotalEffortFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateTotalEffortFromSubTasks_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.calculateTotalEffortFromSubTasks(t);

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
	 * Run the long calculateTotalEffortFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCalculateTotalEffortFromSubTasks_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		long result = fixture.calculateTotalEffortFromSubTasks(t);

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
	 * Run the Task createTask(CalendarDate,CalendarDate,String,int,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCreateTask_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();
		String text = "";
		int priority = 1;
		long effort = 1L;
		String description = "";
		String parentTaskId = "";

		Task result = fixture.createTask(startDate, endDate, text, priority, effort, description, parentTaskId);

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
	 * Run the Task createTask(CalendarDate,CalendarDate,String,int,long,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testCreateTask_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = null;
		String text = "";
		int priority = 1;
		long effort = 1L;
		String description = "";
		String parentTaskId = null;

		Task result = fixture.createTask(startDate, endDate, text, priority, effort, description, parentTaskId);

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
	 * Run the Collection getActiveSubTasks(String,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetActiveSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String taskId = "";
		CalendarDate date = new CalendarDate();

		Collection result = fixture.getActiveSubTasks(taskId, date);

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
	 * Run the Collection getAllSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetAllSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String taskId = null;

		Collection result = fixture.getAllSubTasks(taskId);

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
	 * Run the Collection getAllSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetAllSubTasks_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String taskId = "";

		Collection result = fixture.getAllSubTasks(taskId);

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
	 * Run the Collection getAllSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetAllSubTasks_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String taskId = "a";

		Collection result = fixture.getAllSubTasks(taskId);

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
	 * Run the Collection getAllSubTasks(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetAllSubTasks_4()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String taskId = "a";

		Collection result = fixture.getAllSubTasks(taskId);

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
	 * Run the CalendarDate getEarliestStartDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetEarliestStartDateFromSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEarliestStartDateFromSubTasks(t);

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
	 * Run the CalendarDate getEarliestStartDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetEarliestStartDateFromSubTasks_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEarliestStartDateFromSubTasks(t);

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
	 * Run the CalendarDate getEarliestStartDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetEarliestStartDateFromSubTasks_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEarliestStartDateFromSubTasks(t);

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
	 * Run the CalendarDate getEarliestStartDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetEarliestStartDateFromSubTasks_4()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getEarliestStartDateFromSubTasks(t);

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
	 * Run the CalendarDate getLatestEndDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetLatestEndDateFromSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getLatestEndDateFromSubTasks(t);

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
	 * Run the CalendarDate getLatestEndDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetLatestEndDateFromSubTasks_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getLatestEndDateFromSubTasks(t);

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
	 * Run the CalendarDate getLatestEndDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetLatestEndDateFromSubTasks_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getLatestEndDateFromSubTasks(t);

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
	 * Run the CalendarDate getLatestEndDateFromSubTasks(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetLatestEndDateFromSubTasks_4()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task t = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		CalendarDate result = fixture.getLatestEndDateFromSubTasks(t);

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
	 * Run the Project getProject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetProject_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Project result = fixture.getProject();

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
	 * Run the Task getTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetTask_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String id = "";

		Task result = fixture.getTask(id);

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
	 * Run the Collection getTopLevelTasks() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetTopLevelTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

		Collection result = fixture.getTopLevelTasks();

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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testGetXMLContent_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));

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
	 * Run the boolean hasParentTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testHasParentTask_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String id = "";

		boolean result = fixture.hasParentTask(id);

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
	 * Run the boolean hasParentTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testHasParentTask_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String id = "";

		boolean result = fixture.hasParentTask(id);

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
	 * Run the boolean hasParentTask(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testHasParentTask_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		String id = "";

		boolean result = fixture.hasParentTask(id);

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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testHasSubTasks_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testHasSubTasks_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testHasSubTasks_3()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
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
	 * Run the void removeTask(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testRemoveTask_1()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task task = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.removeTask(task);

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
	 * Run the void removeTask(Task) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	@Test
	public void testRemoveTask_2()
		throws Exception {
		TaskListImpl fixture = new TaskListImpl(new Document(new Element("")), new ProjectImpl(new Element("")));
		Task task = new TaskImpl(new Element(""), new TaskListImpl(new ProjectImpl(new Element(""))));

		fixture.removeTask(task);

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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
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
	 * @generatedBy CodePro at 2/6/17 5:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TaskListImplTest.class);
	}
}