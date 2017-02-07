package net.sf.memoranda;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 2/6/17 5:31 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CurrentNoteTest.class,
	NoteTest.class,
	EventTest.class,
	TaskTest.class,
	DefaultEventNotifierTest.class,
	EventsSchedulerTest.class,
	ResourcesListImplTest.class,
	EventImplTest.class,
	EventsManagerTest.class,
	NoteListenerTest.class,
	ProjectManagerTest.class,
	TaskListTest.class,
	TaskListImplTest.class,
	HistoryItemTest.class,
	ProjectTest.class,
	HistoryTest.class,
	CurrentProjectTest.class,
	ProjectListenerTest.class,
	ResourceTest.class,
	NoteImplTest.class,
	NoteListTest.class,
	TaskImplTest.class,
	SLThreadTest.class,
	EventNotificationListenerTest.class,
	HistoryListenerTest.class,
	ProjectImplTest.class,
	ResourcesListTest.class,
	NoteListImplTest.class,
	StartTest.class,
	net.sf.memoranda.date.TestAll.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 2/6/17 5:31 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
