package net.sf.memoranda.util;

import java.util.Collection;
import java.util.LinkedList;
import net.sf.memoranda.TaskList;
import net.sf.memoranda.ProjectImpl;
import net.sf.memoranda.date.CalendarDate;
import net.sf.memoranda.TaskListImpl;
import net.sf.memoranda.Project;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>AgendaGeneratorTest</code> contains tests for the class <code>{@link AgendaGenerator}</code>.
 *
 * @generatedBy CodePro at 2/6/17 3:34 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class AgendaGeneratorTest {
	/**
	 * Run the AgendaGenerator() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testAgendaGenerator_1()
		throws Exception {
		AgendaGenerator result = new AgendaGenerator();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String generateAllProjectsInfo(CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateAllProjectsInfo_1()
		throws Exception {
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateAllProjectsInfo(date, expandedTasks);

		// add additional test code here
		assertEquals("<td width=\"66%\" valign=\"top\"><h1>Projects and tasks</h1>\n<h2><a href=\"memoranda:project#__default\">Daily To-Do</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 23, 2017</i>\n<br>Total progress: 0%</td></tr></table>\n<p>No actual tasks.</p>\n<h2><a href=\"memoranda:project#-5c2ffd15-6ddf-1316-32d6\">Homework Week Three</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 27, 2017</i>\n<br>Total progress: 0%</td></tr></table>\nActual tasks:<br>\n<ul>\n<a name=\"2646ec26-b3-9f14-e409\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER334 C++ project</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-71d7ff1-a20d-9727-e548\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER316 Lab</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-1917bdba-41eb-effd-735d\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>TA Class Homework</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>9 days overdue.</b></font></p></li>\n<a name=\"7d0120ae-7c32-5d7-cba8\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER322 Study Set</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n\n</ul>\n</td>", result);
	}

	/**
	 * Run the String generateAllProjectsInfo(CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateAllProjectsInfo_2()
		throws Exception {
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateAllProjectsInfo(date, expandedTasks);

		// add additional test code here
		assertEquals("<td width=\"66%\" valign=\"top\"><h1>Projects and tasks</h1>\n<h2><a href=\"memoranda:project#__default\">Daily To-Do</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 23, 2017</i>\n<br>Total progress: 0%</td></tr></table>\n<p>No actual tasks.</p>\n<h2><a href=\"memoranda:project#-5c2ffd15-6ddf-1316-32d6\">Homework Week Three</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 27, 2017</i>\n<br>Total progress: 0%</td></tr></table>\nActual tasks:<br>\n<ul>\n<a name=\"2646ec26-b3-9f14-e409\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER334 C++ project</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-71d7ff1-a20d-9727-e548\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER316 Lab</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-1917bdba-41eb-effd-735d\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>TA Class Homework</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>9 days overdue.</b></font></p></li>\n<a name=\"7d0120ae-7c32-5d7-cba8\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER322 Study Set</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n\n</ul>\n</td>", result);
	}

	/**
	 * Run the String generateAllProjectsInfo(CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateAllProjectsInfo_3()
		throws Exception {
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateAllProjectsInfo(date, expandedTasks);

		// add additional test code here
		assertEquals("<td width=\"66%\" valign=\"top\"><h1>Projects and tasks</h1>\n<h2><a href=\"memoranda:project#__default\">Daily To-Do</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 23, 2017</i>\n<br>Total progress: 0%</td></tr></table>\n<p>No actual tasks.</p>\n<h2><a href=\"memoranda:project#-5c2ffd15-6ddf-1316-32d6\">Homework Week Three</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 27, 2017</i>\n<br>Total progress: 0%</td></tr></table>\nActual tasks:<br>\n<ul>\n<a name=\"2646ec26-b3-9f14-e409\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER334 C++ project</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-71d7ff1-a20d-9727-e548\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER316 Lab</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-1917bdba-41eb-effd-735d\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>TA Class Homework</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>9 days overdue.</b></font></p></li>\n<a name=\"7d0120ae-7c32-5d7-cba8\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER322 Study Set</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n\n</ul>\n</td>", result);
	}

	/**
	 * Run the String generateEventsInfo(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateEventsInfo_1()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateEventsInfo(date);

		// add additional test code here
		assertEquals("<td width=\"34%\" valign=\"top\"><a href=\"memoranda:events\"><h1>Events</h1></a>\n<table width=\"100%\" valign=\"top\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFF6\">\n</table>", result);
	}

	/**
	 * Run the String generateEventsInfo(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateEventsInfo_2()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateEventsInfo(date);

		// add additional test code here
		assertEquals("<td width=\"34%\" valign=\"top\"><a href=\"memoranda:events\"><h1>Events</h1></a>\n<table width=\"100%\" valign=\"top\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFF6\">\n</table>", result);
	}

	/**
	 * Run the String generateEventsInfo(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateEventsInfo_3()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateEventsInfo(date);

		// add additional test code here
		assertEquals("<td width=\"34%\" valign=\"top\"><a href=\"memoranda:events\"><h1>Events</h1></a>\n<table width=\"100%\" valign=\"top\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFF6\">\n</table>", result);
	}

	/**
	 * Run the String generateEventsInfo(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateEventsInfo_4()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateEventsInfo(date);

		// add additional test code here
		assertEquals("<td width=\"34%\" valign=\"top\"><a href=\"memoranda:events\"><h1>Events</h1></a>\n<table width=\"100%\" valign=\"top\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFF6\">\n</table>", result);
	}

	/**
	 * Run the String generateEventsInfo(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateEventsInfo_5()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateEventsInfo(date);

		// add additional test code here
		assertEquals("<td width=\"34%\" valign=\"top\"><a href=\"memoranda:events\"><h1>Events</h1></a>\n<table width=\"100%\" valign=\"top\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFF6\">\n</table>", result);
	}

	/**
	 * Run the String generateProjectInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateProjectInfo_1()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateProjectInfo(p, date, expandedTasks);

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
	 * Run the String generateProjectInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateProjectInfo_2()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateProjectInfo(p, date, expandedTasks);

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
	 * Run the String generateStickers(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateStickers_1()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateStickers(date);

		// add additional test code here
		assertEquals("<hr><hr><table border=\"0\" cellpadding=\"0\" width=\"100%\"><tr><td><a href=\"memoranda:importstickers\"><b>Import file</b></a></td><td><a href=\"memoranda:exportstickerst\"><b>Export as .txt</b></a><td><a href=\"memoranda:exportstickersh\"><b>Export as html</b></a></td></tr></table><table border=\"0\" cellpadding=\"0\" width=\"100%\"><tr><td><a href=\"memoranda:addsticker\"><img align=\"left\" width=\"22\" height=\"22\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/addsticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"New sticker\"></a></td><td width=\"100%\"><a href=\"memoranda:addsticker\"><b>&nbsp;Add sticker</b></a></td></tr></table>\n<table border=\"0\" cellpadding=\"0\" width=\"100%\"><table width=\"100%\"><tr bgcolor=\"#E0E0E0\"><td><a href=\"memoranda:editsticker#4c409632-274f-1ff-cb35\">EDIT</a></td><td width=\"70%\"><a href=\"memoranda:expandsticker#4c409632-274f-1ff-cb35\">OPEN IN A NEW WINDOW</></td><td align=\"right\">&nbsp;<a href=\"memoranda:removesticker#4c409632-274f-1ff-cb35\"><img align=\"left\" width=\"14\" height=\"14\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/removesticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"Remove sticker\"></a></td></table></tr><tr><td><div style=\"background-color:#FFAFAF;font-size:15;color:#0; \">January 26, 2017 9:28 PM<br>Do your lab</div></td></tr></table>\n<table border=\"0\" cellpadding=\"0\" width=\"100%\"><table width=\"100%\"><tr bgcolor=\"#E0E0E0\"><td><a href=\"memoranda:editsticker#-47f01404-421d-20a7-92cd\">EDIT</a></td><td width=\"70%\"><a href=\"memoranda:expandsticker#-47f01404-421d-20a7-92cd\">OPEN IN A NEW WINDOW</></td><td align=\"right\">&nbsp;<a href=\"memoranda:removesticker#-47f01404-421d-20a7-92cd\"><img align=\"left\" width=\"14\" height=\"14\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/removesticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"Remove sticker\"></a></td></table></tr><tr><td><div style=\"background-color:#FF00FF;font-size:15;color:#0;\">January 27, 2017 10:44 AM<br><b>These stickers are a little obnoxious</b></div></td></tr></table><hr>", result);
	}

	/**
	 * Run the String generateStickers(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateStickers_2()
		throws Exception {
		CalendarDate date = new CalendarDate();

		String result = AgendaGenerator.generateStickers(date);

		// add additional test code here
		assertEquals("<hr><hr><table border=\"0\" cellpadding=\"0\" width=\"100%\"><tr><td><a href=\"memoranda:importstickers\"><b>Import file</b></a></td><td><a href=\"memoranda:exportstickerst\"><b>Export as .txt</b></a><td><a href=\"memoranda:exportstickersh\"><b>Export as html</b></a></td></tr></table><table border=\"0\" cellpadding=\"0\" width=\"100%\"><tr><td><a href=\"memoranda:addsticker\"><img align=\"left\" width=\"22\" height=\"22\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/addsticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"New sticker\"></a></td><td width=\"100%\"><a href=\"memoranda:addsticker\"><b>&nbsp;Add sticker</b></a></td></tr></table>\n<table border=\"0\" cellpadding=\"0\" width=\"100%\"><table width=\"100%\"><tr bgcolor=\"#E0E0E0\"><td><a href=\"memoranda:editsticker#4c409632-274f-1ff-cb35\">EDIT</a></td><td width=\"70%\"><a href=\"memoranda:expandsticker#4c409632-274f-1ff-cb35\">OPEN IN A NEW WINDOW</></td><td align=\"right\">&nbsp;<a href=\"memoranda:removesticker#4c409632-274f-1ff-cb35\"><img align=\"left\" width=\"14\" height=\"14\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/removesticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"Remove sticker\"></a></td></table></tr><tr><td><div style=\"background-color:#FFAFAF;font-size:15;color:#0; \">January 26, 2017 9:28 PM<br>Do your lab</div></td></tr></table>\n<table border=\"0\" cellpadding=\"0\" width=\"100%\"><table width=\"100%\"><tr bgcolor=\"#E0E0E0\"><td><a href=\"memoranda:editsticker#-47f01404-421d-20a7-92cd\">EDIT</a></td><td width=\"70%\"><a href=\"memoranda:expandsticker#-47f01404-421d-20a7-92cd\">OPEN IN A NEW WINDOW</></td><td align=\"right\">&nbsp;<a href=\"memoranda:removesticker#-47f01404-421d-20a7-92cd\"><img align=\"left\" width=\"14\" height=\"14\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/removesticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"Remove sticker\"></a></td></table></tr><tr><td><div style=\"background-color:#FF00FF;font-size:15;color:#0;\">January 27, 2017 10:44 AM<br><b>These stickers are a little obnoxious</b></div></td></tr></table><hr>", result);
	}

	/**
	 * Run the String generateTasksInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateTasksInfo_1()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateTasksInfo(p, date, expandedTasks);

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
	 * Run the String generateTasksInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateTasksInfo_2()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateTasksInfo(p, date, expandedTasks);

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
	 * Run the String generateTasksInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateTasksInfo_3()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateTasksInfo(p, date, expandedTasks);

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
	 * Run the String generateTasksInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateTasksInfo_4()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateTasksInfo(p, date, expandedTasks);

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
	 * Run the String generateTasksInfo(Project,CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGenerateTasksInfo_5()
		throws Exception {
		Project p = new ProjectImpl(new Element(""));
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.generateTasksInfo(p, date, expandedTasks);

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
	 * Run the String getAgenda(CalendarDate,Collection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetAgenda_1()
		throws Exception {
		CalendarDate date = new CalendarDate();
		Collection expandedTasks = new LinkedList();

		String result = AgendaGenerator.getAgenda(date, expandedTasks);

		// add additional test code here
		assertEquals("<html><head><title></title>\n<style>\n    body, td {font: 12pt sans-serif}\n    h1 {font:20pt sans-serif; background-color:#E0E0E0; margin-top:0}\n    h2 {font:16pt sans-serif; margin-bottom:0}\n    li {margin-bottom:5px}\n a {color:black; text-decoration:none}\n</style></head>\n<body><table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"4\" cellspacing=\"4\">\n<tr>\n<td width=\"66%\" valign=\"top\"><h1>Projects and tasks</h1>\n<h2><a href=\"memoranda:project#__default\">Daily To-Do</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 23, 2017</i>\n<br>Total progress: 0%</td></tr></table>\n<p>No actual tasks.</p>\n<h2><a href=\"memoranda:project#-5c2ffd15-6ddf-1316-32d6\">Homework Week Three</a></h2>\n<table border=\"0\" width=\"100%\" cellpadding=\"2\" bgcolor=\"#EFEFEF\"><tr><td>Start date: <i>Jan 27, 2017</i>\n<br>Total progress: 0%</td></tr></table>\nActual tasks:<br>\n<ul>\n<a name=\"2646ec26-b3-9f14-e409\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER334 C++ project</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-71d7ff1-a20d-9727-e548\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER316 Lab</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n<a name=\"-1917bdba-41eb-effd-735d\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>TA Class Homework</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>9 days overdue.</b></font></p></li>\n<a name=\"7d0120ae-7c32-5d7-cba8\"><li><p><a href=\"memoranda:tasks#-5c2ffd15-6ddf-1316-32d6\"><b>SER322 Study Set</b></a> : 0% done</p><p>Priority: <font color=\"green\">Normal</font></p><p><font color=\"#FF9900\"><b>8 days overdue.</b></font></p></li>\n\n</ul>\n</td><td width=\"34%\" valign=\"top\"><a href=\"memoranda:events\"><h1>Events</h1></a>\n<table width=\"100%\" valign=\"top\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFF6\">\n</table><hr><hr><table border=\"0\" cellpadding=\"0\" width=\"100%\"><tr><td><a href=\"memoranda:importstickers\"><b>Import file</b></a></td><td><a href=\"memoranda:exportstickerst\"><b>Export as .txt</b></a><td><a href=\"memoranda:exportstickersh\"><b>Export as html</b></a></td></tr></table><table border=\"0\" cellpadding=\"0\" width=\"100%\"><tr><td><a href=\"memoranda:addsticker\"><img align=\"left\" width=\"22\" height=\"22\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/addsticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"New sticker\"></a></td><td width=\"100%\"><a href=\"memoranda:addsticker\"><b>&nbsp;Add sticker</b></a></td></tr></table>\n<table border=\"0\" cellpadding=\"0\" width=\"100%\"><table width=\"100%\"><tr bgcolor=\"#E0E0E0\"><td><a href=\"memoranda:editsticker#4c409632-274f-1ff-cb35\">EDIT</a></td><td width=\"70%\"><a href=\"memoranda:expandsticker#4c409632-274f-1ff-cb35\">OPEN IN A NEW WINDOW</></td><td align=\"right\">&nbsp;<a href=\"memoranda:removesticker#4c409632-274f-1ff-cb35\"><img align=\"left\" width=\"14\" height=\"14\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/removesticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"Remove sticker\"></a></td></table></tr><tr><td><div style=\"background-color:#FFAFAF;font-size:15;color:#0; \">January 26, 2017 9:28 PM<br>Do your lab</div></td></tr></table>\n<table border=\"0\" cellpadding=\"0\" width=\"100%\"><table width=\"100%\"><tr bgcolor=\"#E0E0E0\"><td><a href=\"memoranda:editsticker#-47f01404-421d-20a7-92cd\">EDIT</a></td><td width=\"70%\"><a href=\"memoranda:expandsticker#-47f01404-421d-20a7-92cd\">OPEN IN A NEW WINDOW</></td><td align=\"right\">&nbsp;<a href=\"memoranda:removesticker#-47f01404-421d-20a7-92cd\"><img align=\"left\" width=\"14\" height=\"14\" src=\"file:/Users/Jessica/Documents/WorkspaceSpring2016/SER316-Hamburg/classes/net/sf/memoranda/ui/resources/agenda/removesticker.gif\" border=\"0\"  hspace=\"0\" vspace=\"0\" alt=\"Remove sticker\"></a></td></table></tr><tr><td><div style=\"background-color:#FF00FF;font-size:15;color:#0;\">January 27, 2017 10:44 AM<br><b>These stickers are a little obnoxious</b></div></td></tr></table><hr></td></tr></table></body></html>", result);
	}

	/**
	 * Run the String getPriorityString(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetPriorityString_1()
		throws Exception {
		int p = 2;

		String result = AgendaGenerator.getPriorityString(p);

		// add additional test code here
		assertEquals("<font color=\"green\">Normal</font>", result);
	}

	/**
	 * Run the String getPriorityString(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetPriorityString_2()
		throws Exception {
		int p = 1;

		String result = AgendaGenerator.getPriorityString(p);

		// add additional test code here
		assertEquals("<font color=\"#3333CC\">Low</font>", result);
	}

	/**
	 * Run the String getPriorityString(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetPriorityString_3()
		throws Exception {
		int p = 0;

		String result = AgendaGenerator.getPriorityString(p);

		// add additional test code here
		assertEquals("<font color=\"#666699\">Lowest</font>", result);
	}

	/**
	 * Run the String getPriorityString(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetPriorityString_4()
		throws Exception {
		int p = 3;

		String result = AgendaGenerator.getPriorityString(p);

		// add additional test code here
		assertEquals("<font color=\"#FF9900\">High</font>", result);
	}

	/**
	 * Run the String getPriorityString(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetPriorityString_5()
		throws Exception {
		int p = 4;

		String result = AgendaGenerator.getPriorityString(p);

		// add additional test code here
		assertEquals("<font color=\"red\">Highest</font>", result);
	}

	/**
	 * Run the int getProgress(TaskList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetProgress_1()
		throws Exception {
		TaskList tl = new TaskListImpl(new ProjectImpl(new Element("")));

		int result = AgendaGenerator.getProgress(tl);

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
	 * Run the int getProgress(TaskList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetProgress_2()
		throws Exception {
		TaskList tl = new TaskListImpl(new ProjectImpl(new Element("")));

		int result = AgendaGenerator.getProgress(tl);

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
	 * Run the int getProgress(TaskList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	@Test
	public void testGetProgress_3()
		throws Exception {
		TaskList tl = new TaskListImpl(new ProjectImpl(new Element("")));

		int result = AgendaGenerator.getProgress(tl);

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
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 3:34 PM
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
	 * @generatedBy CodePro at 2/6/17 3:34 PM
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
	 * @generatedBy CodePro at 2/6/17 3:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AgendaGeneratorTest.class);
	}
}