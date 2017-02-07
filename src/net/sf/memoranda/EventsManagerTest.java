package net.sf.memoranda;

import java.util.Collection;
import java.util.Map;
import net.sf.memoranda.date.CalendarDate;
import org.junit.*;
import nu.xom.Element;
import static org.junit.Assert.*;

/**
 * The class <code>EventsManagerTest</code> contains tests for the class <code>{@link EventsManager}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:20 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class EventsManagerTest {
	/**
	 * Run the EventsManager() constructor test.
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testEventsManager_1()
		throws Exception {
		EventsManager result = new EventsManager();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Event createEvent(CalendarDate,int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCreateEvent_1()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;
		String text = "";

		Event result = EventsManager.createEvent(date, hh, mm, text);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event createEvent(CalendarDate,int,int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCreateEvent_2()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;
		String text = "";

		Event result = EventsManager.createEvent(date, hh, mm, text);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7c96af5e-e02a-173d-62bf", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event createRepeatableEvent(int,CalendarDate,CalendarDate,int,int,int,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCreateRepeatableEvent_1()
		throws Exception {
		int type = 1;
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();
		int period = 1;
		int hh = 1;
		int mm = 1;
		String text = "";
		boolean workDays = true;

		Event result = EventsManager.createRepeatableEvent(type, startDate, endDate, period, hh, mm, text, workDays);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7c9c8e4b-17eb-600e-b7ca", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(true, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(1, result.getPeriod());
		assertEquals(true, result.getWorkingDays());
		assertEquals(1, result.getRepeat());
	}

	/**
	 * Run the Event createRepeatableEvent(int,CalendarDate,CalendarDate,int,int,int,String,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCreateRepeatableEvent_2()
		throws Exception {
		int type = 1;
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = null;
		int period = 1;
		int hh = 1;
		int mm = 1;
		String text = "";
		boolean workDays = true;

		Event result = EventsManager.createRepeatableEvent(type, startDate, endDate, period, hh, mm, text, workDays);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7c7954bd-4968-2b24-b983", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(true, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(1, result.getPeriod());
		assertEquals(true, result.getWorkingDays());
		assertEquals(1, result.getRepeat());
	}

	/**
	 * Run the void createSticker(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testCreateSticker_1()
		throws Exception {
		String text = "";
		int prior = 1;

		EventsManager.createSticker(text, prior);

		// add additional test code here
	}

	/**
	 * Run the Collection getActiveEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetActiveEvents_1()
		throws Exception {

		Collection result = EventsManager.getActiveEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.size());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_1()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_2()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_3()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = (byte) 1;
		int mm = 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_4()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = (byte) 1;
		int mm = (byte) 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_5()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_6()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = (byte) 1;
		int mm = 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Event getEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEvent_7()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;

		Event result = EventsManager.getEvent(date, hh, mm);

		// add additional test code here
		assertNotNull(result);
		assertEquals("7d8d423c-85b9-89a6-d6b3", result.getId());
		assertEquals(1, result.getHour());
		assertEquals(1, result.getMinute());
		assertEquals("", result.getText());
		assertEquals(null, result.getEndDate());
		assertEquals(false, result.isRepeatable());
		assertEquals("1:01 AM", result.getTimeString());
		assertEquals(null, result.getStartDate());
		assertEquals(0, result.getPeriod());
		assertEquals(false, result.getWorkingDays());
		assertEquals(0, result.getRepeat());
	}

	/**
	 * Run the Collection getEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEventsForDate_1()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection getEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEventsForDate_2()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection getEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetEventsForDate_3()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection getRepeatableEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEvents_1()
		throws Exception {

		Collection result = EventsManager.getRepeatableEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEvents_2()
		throws Exception {

		Collection result = EventsManager.getRepeatableEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEvents() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEvents_3()
		throws Exception {

		Collection result = EventsManager.getRepeatableEvents();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_1()
		throws Exception {
		CalendarDate date = new CalendarDate(1, 1, 1);

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_2()
		throws Exception {
		CalendarDate date = new CalendarDate(1, 1, 1);

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_3()
		throws Exception {
		CalendarDate date = new CalendarDate(1, 1, 1);

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_4()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_5()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_6()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_7()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_8()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_9()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_10()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_11()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_12()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_13()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Collection getRepeatableEventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetRepeatableEventsForDate_14()
		throws Exception {
		CalendarDate date = new CalendarDate();

		Collection result = EventsManager.getRepeatableEventsForDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
	}

	/**
	 * Run the Map getStickers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetStickers_1()
		throws Exception {

		Map result = EventsManager.getStickers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
		assertTrue(result.containsKey("76193f7b-3e81-975c-de91"));
		assertTrue(result.containsKey("4c409632-274f-1ff-cb35"));
		assertTrue(result.containsKey("-47f01404-421d-20a7-92cd"));
	}

	/**
	 * Run the Map getStickers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testGetStickers_2()
		throws Exception {

		Map result = EventsManager.getStickers();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
		assertTrue(result.containsKey("76193f7b-3e81-975c-de91"));
		assertTrue(result.containsKey("4c409632-274f-1ff-cb35"));
		assertTrue(result.containsKey("-47f01404-421d-20a7-92cd"));
	}

	/**
	 * Run the boolean isNREventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testIsNREventsForDate_1()
		throws Exception {
		CalendarDate date = new CalendarDate();

		boolean result = EventsManager.isNREventsForDate(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNREventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testIsNREventsForDate_2()
		throws Exception {
		CalendarDate date = new CalendarDate();

		boolean result = EventsManager.isNREventsForDate(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isNREventsForDate(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testIsNREventsForDate_3()
		throws Exception {
		CalendarDate date = new CalendarDate();

		boolean result = EventsManager.isNREventsForDate(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void removeEvent(Event) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testRemoveEvent_1()
		throws Exception {
		Event ev = new EventImpl(new Element(""));

		EventsManager.removeEvent(ev);

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
	 * Run the void removeEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testRemoveEvent_2()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;

		EventsManager.removeEvent(date, hh, mm);

		// add additional test code here
	}

	/**
	 * Run the void removeEvent(CalendarDate,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testRemoveEvent_3()
		throws Exception {
		CalendarDate date = new CalendarDate();
		int hh = 1;
		int mm = 1;

		EventsManager.removeEvent(date, hh, mm);

		// add additional test code here
	}

	/**
	 * Run the void removeSticker(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testRemoveSticker_1()
		throws Exception {
		String stickerId = "";

		EventsManager.removeSticker(stickerId);

		// add additional test code here
	}

	/**
	 * Run the void removeSticker(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testRemoveSticker_2()
		throws Exception {
		String stickerId = "";

		EventsManager.removeSticker(stickerId);

		// add additional test code here
	}

	/**
	 * Run the void removeSticker(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	@Test
	public void testRemoveSticker_3()
		throws Exception {
		String stickerId = "";

		EventsManager.removeSticker(stickerId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:20 PM
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
	 * @generatedBy CodePro at 2/6/17 5:20 PM
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
	 * @generatedBy CodePro at 2/6/17 5:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EventsManagerTest.class);
	}
}