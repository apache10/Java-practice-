package com.gaurav.calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.gaurav.calendar.MyCalendar;
import java.util.GregorianCalendar;

public class Calendar {

	/**
	 * @param args
	 * @throws ParseException s
	 */
	public static void main(String[] args) throws ParseException {
		dateToString();
		String strDate = "31-08-2009 10:20:56";
		stringToDate(strDate);
	}
	public static void dateToString(){
	SimpleDateFormat objectDate = new SimpleDateFormat("dd/M/yyyy");
	String date = objectDate.format(new Date());
	System.out.println(date);
	}
	public static void stringToDate(String str) throws ParseException{
		SimpleDateFormat objectDate = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = str;
		Date date = objectDate.parse(dateInString);
		System.out.println(date);
	}

	public static void printDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		MyCalendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
		
		int year       = calendar.get(Calendar.YEAR);
		int month      = calendar.get(Calendar.MONTH); 
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

		int hour       = calendar.get(Calendar.HOUR);
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY);
		int minute     = calendar.get(Calendar.MINUTE);
		int second     = calendar.get(Calendar.SECOND);
		int millisecond= calendar.get(Calendar.MILLISECOND);

		System.out.println(sdf.format(calendar.getTime()));

		System.out.println("year \t\t: " + year);
		System.out.println("month \t\t: " + month);
		System.out.println("dayOfMonth \t: " + dayOfMonth);
		System.out.println("dayOfWeek \t: " + dayOfWeek);
		System.out.println("weekOfYear \t: " + weekOfYear);
		System.out.println("weekOfMonth \t: " + weekOfMonth);

		System.out.println("hour \t\t: " + hour);
		System.out.println("hourOfDay \t: " + hourOfDay);
		System.out.println("minute \t\t: " + minute);
		System.out.println("second \t\t: " + second);
		System.out.println("millisecond \t: " + millisecond);
	}
}
