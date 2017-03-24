package com.wbl.basics.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumMonth {
	
	
	public static void main(String a[]){
		Enumeration days;

	      Vector dayNames = new Vector();

	      dayNames.add("JANUARY");

	      dayNames.add("FEBRUARY");

	      dayNames.add("MARCH");

	      dayNames.add("APRIL");

	      dayNames.add("MAY");

	      dayNames.add("JUNE");

	      dayNames.add("JULY");

	      dayNames.add("AUGUST");

	      dayNames.add("SEPTEMBER");

	      dayNames.add("OCTOBER");

	      dayNames.add("NOVEMBER");

	      dayNames.add("DECEMBER");

	      days = dayNames.elements();

	   
	      while (days.hasMoreElements()) {

	         System.out.println(days.nextElement()); 

	      }

	}


}