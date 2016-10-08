package com.gaurav.calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
}
