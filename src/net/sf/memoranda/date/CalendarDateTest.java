package net.sf.memoranda.date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CalendarDateTest</code> contains tests for the class <code>{@link CalendarDate}</code>.
 *
 * @generatedBy CodePro at 2/6/17 5:30 PM
 * @author Jessica
 * @version $Revision: 1.0 $
 */
public class CalendarDateTest {
	/**
	 * Run the CalendarDate() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCalendarDate_1()
		throws Exception {

		CalendarDate result = new CalendarDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals("6/1/2017", result.toString());
		assertEquals(6, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(2017, result.getYear());
		assertEquals("Feb 6, 2017", result.getMediumDateString());
		assertEquals("Monday, February 6, 2017", result.getFullDateString());
		assertEquals("February 6, 2017", result.getLongDateString());
		assertEquals("2/6/17", result.getShortDateString());
	}

	/**
	 * Run the CalendarDate(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCalendarDate_2()
		throws Exception {
		String date = "";

		CalendarDate result = new CalendarDate(date);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		//       at java.lang.String.substring(String.java:1967)
		//       at net.sf.memoranda.util.Util.parseDateStamp(Util.java:66)
		//       at net.sf.memoranda.date.CalendarDate.<init>(CalendarDate.java:63)
		assertNotNull(result);
	}

	/**
	 * Run the CalendarDate(Calendar) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCalendarDate_3()
		throws Exception {
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.YEAR, 1);
		cal.set(Calendar.DAY_OF_MONTH, 1);

		CalendarDate result = new CalendarDate(cal);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1/1/1", result.toString());
		assertEquals(1, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(1, result.getYear());
		assertEquals("Feb 1, 0001", result.getMediumDateString());
		assertEquals("Tuesday, February 1, 0001", result.getFullDateString());
		assertEquals("February 1, 0001", result.getLongDateString());
		assertEquals("2/1/01", result.getShortDateString());
	}

	/**
	 * Run the CalendarDate(Date) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCalendarDate_4()
		throws Exception {
		Date date = new Date();

		CalendarDate result = new CalendarDate(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals("6/1/2017", result.toString());
		assertEquals(6, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(2017, result.getYear());
		assertEquals("Feb 6, 2017", result.getMediumDateString());
		assertEquals("Monday, February 6, 2017", result.getFullDateString());
		assertEquals("February 6, 2017", result.getLongDateString());
		assertEquals("2/6/17", result.getShortDateString());
	}

	/**
	 * Run the CalendarDate(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCalendarDate_5()
		throws Exception {
		int day = 1;
		int month = 1;
		int year = 1;

		CalendarDate result = new CalendarDate(day, month, year);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1/1/1", result.toString());
		assertEquals(1, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(1, result.getYear());
		assertEquals("Feb 1, 0001", result.getMediumDateString());
		assertEquals("Tuesday, February 1, 0001", result.getFullDateString());
		assertEquals("February 1, 0001", result.getLongDateString());
		assertEquals("2/1/01", result.getShortDateString());
	}

	/**
	 * Run the CalendarDate(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testCalendarDate_6()
		throws Exception {
		int day = 1;
		int month = 1;
		int year = 1;

		CalendarDate result = new CalendarDate(day, month, year);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1/1/1", result.toString());
		assertEquals(1, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(1, result.getYear());
		assertEquals("Feb 1, 0001", result.getMediumDateString());
		assertEquals("Tuesday, February 1, 0001", result.getFullDateString());
		assertEquals("February 1, 0001", result.getLongDateString());
		assertEquals("2/1/01", result.getShortDateString());
	}

	/**
	 * Run the boolean after(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testAfter_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = null;

		boolean result = fixture.after(date);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean after(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testAfter_2()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.after(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean after(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testAfter_3()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.after(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean before(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testBefore_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = null;

		boolean result = fixture.before(date);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean before(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testBefore_2()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.before(date);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean before(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testBefore_3()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.before(date);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Calendar dateToCalendar(Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testDateToCalendar_1()
		throws Exception {
		Date date = new Date();

		Calendar result = CalendarDate.dateToCalendar(date);

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(1486427436566L)), DateFormat.getInstance().format(result.getTime()));
		assertEquals(1486427436566L, result.getTimeInMillis());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new CalendarDate();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new CalendarDate();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new CalendarDate();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new CalendarDate();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new GregorianCalendar();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new GregorianCalendar();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new Date();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new Date();

		boolean result = fixture.equals(object);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to net.sf.memoranda.date.CalendarDate
		//       at net.sf.memoranda.date.CalendarDate.equals(CalendarDate.java:125)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_10()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		Object object = new Object();

		boolean result = fixture.equals(object);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to net.sf.memoranda.date.CalendarDate
		//       at net.sf.memoranda.date.CalendarDate.equals(CalendarDate.java:125)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_11()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = null;

		boolean result = fixture.equals(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_12()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.equals(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_13()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.equals(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_14()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.equals(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testEquals_15()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate date = new CalendarDate();

		boolean result = fixture.equals(date);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Calendar getCalendar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetCalendar_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		Calendar result = fixture.getCalendar();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(-62133002957223L)), DateFormat.getInstance().format(result.getTime()));
		assertEquals(-62133002957223L, result.getTimeInMillis());
	}

	/**
	 * Run the Date getDate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetDate_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		Date result = fixture.getDate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(-62133002957212L)), DateFormat.getInstance().format(result));
		assertEquals(-62133002957212L, result.getTime());
	}

	/**
	 * Run the int getDay() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetDay_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		int result = fixture.getDay();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getFullDateString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetFullDateString_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		String result = fixture.getFullDateString();

		// add additional test code here
		assertEquals("Tuesday, February 1, 0001", result);
	}

	/**
	 * Run the String getLongDateString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetLongDateString_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		String result = fixture.getLongDateString();

		// add additional test code here
		assertEquals("February 1, 0001", result);
	}

	/**
	 * Run the String getMediumDateString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetMediumDateString_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		String result = fixture.getMediumDateString();

		// add additional test code here
		assertEquals("Feb 1, 0001", result);
	}

	/**
	 * Run the int getMonth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetMonth_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		int result = fixture.getMonth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getShortDateString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetShortDateString_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		String result = fixture.getShortDateString();

		// add additional test code here
		assertEquals("2/1/01", result);
	}

	/**
	 * Run the int getYear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testGetYear_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		int result = fixture.getYear();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean inPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testInPeriod_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		boolean result = fixture.inPeriod(startDate, endDate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean inPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testInPeriod_2()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		boolean result = fixture.inPeriod(startDate, endDate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean inPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testInPeriod_3()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		boolean result = fixture.inPeriod(startDate, endDate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean inPeriod(CalendarDate,CalendarDate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testInPeriod_4()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);
		CalendarDate startDate = new CalendarDate();
		CalendarDate endDate = new CalendarDate();

		boolean result = fixture.inPeriod(startDate, endDate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Calendar toCalendar(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testToCalendar_1()
		throws Exception {
		int day = 1;
		int month = 1;
		int year = 1;

		Calendar result = CalendarDate.toCalendar(day, month, year);

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(-62133002957277L)), DateFormat.getInstance().format(result.getTime()));
		assertEquals(-62133002957277L, result.getTimeInMillis());
	}

	/**
	 * Run the Date toDate(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testToDate_1()
		throws Exception {
		int day = 1;
		int month = 1;
		int year = 1;

		Date result = CalendarDate.toDate(day, month, year);

		// add additional test code here
		assertNotNull(result);
		assertEquals(DateFormat.getInstance().format(new Date(-62133002957276L)), DateFormat.getInstance().format(result));
		assertEquals(-62133002957276L, result.getTime());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		CalendarDate fixture = new CalendarDate(1, 1, 1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1/1/1", result);
	}

	/**
	 * Run the CalendarDate today() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testToday_1()
		throws Exception {

		CalendarDate result = CalendarDate.today();

		// add additional test code here
		assertNotNull(result);
		assertEquals("6/1/2017", result.toString());
		assertEquals(6, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(2017, result.getYear());
		assertEquals("Feb 6, 2017", result.getMediumDateString());
		assertEquals("Monday, February 6, 2017", result.getFullDateString());
		assertEquals("February 6, 2017", result.getLongDateString());
		assertEquals("2/6/17", result.getShortDateString());
	}

	/**
	 * Run the CalendarDate tomorrow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testTomorrow_1()
		throws Exception {

		CalendarDate result = CalendarDate.tomorrow();

		// add additional test code here
		assertNotNull(result);
		assertEquals("7/1/2017", result.toString());
		assertEquals(7, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(2017, result.getYear());
		assertEquals("Feb 7, 2017", result.getMediumDateString());
		assertEquals("Tuesday, February 7, 2017", result.getFullDateString());
		assertEquals("February 7, 2017", result.getLongDateString());
		assertEquals("2/7/17", result.getShortDateString());
	}

	/**
	 * Run the CalendarDate yesterday() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	@Test
	public void testYesterday_1()
		throws Exception {

		CalendarDate result = CalendarDate.yesterday();

		// add additional test code here
		assertNotNull(result);
		assertEquals("5/1/2017", result.toString());
		assertEquals(5, result.getDay());
		assertEquals(1, result.getMonth());
		assertEquals(2017, result.getYear());
		assertEquals("Feb 5, 2017", result.getMediumDateString());
		assertEquals("Sunday, February 5, 2017", result.getFullDateString());
		assertEquals("February 5, 2017", result.getLongDateString());
		assertEquals("2/5/17", result.getShortDateString());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/6/17 5:30 PM
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
	 * @generatedBy CodePro at 2/6/17 5:30 PM
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
	 * @generatedBy CodePro at 2/6/17 5:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CalendarDateTest.class);
	}
}