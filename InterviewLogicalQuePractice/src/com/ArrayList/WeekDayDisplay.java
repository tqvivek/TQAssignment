/*3. Create a arraylist of string. Add 7 days to list ( Monday , Sunday 
etc) Remove elements from list for which string length is more 
than 7*/
package com.ArrayList;

import java.util.ArrayList;

public class WeekDayDisplay {

	public static void main(String[] args) {

		ArrayList<String> days = new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");

		days.removeIf(day -> day.length() > 7);

		System.out.println("Days of week which length is less than 7" + days);

	}

}
