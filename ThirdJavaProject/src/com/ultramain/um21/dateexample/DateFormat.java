package com.ultramain.um21.dateexample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("yy/m/dd h:mm a");
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("h:mm:ss a");
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("MMM dd,yyyy h:mm:ss a");
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("h:mm a");
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("h:mm:ss a");
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("h:mm:ss a z");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("MMM dd,yyyy h:mm a");
		System.out.println(formatter.format(date));

		formatter = new SimpleDateFormat("MMMM d,yyyy h:mm:ss a z");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(formatter.format(date));

	}
}
