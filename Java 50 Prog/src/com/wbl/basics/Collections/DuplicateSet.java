package com.wbl.basics.Collections;

import java.util.HashSet;

public class DuplicateSet {
	
	public static void main(String[] args) {

		 String[] strArray = {"abc", "def", "ghi", "jkl", "pqr", "xyz", "def"};


	        HashSet<String> set = new HashSet<String>();

	
	        for (String arrayElement : strArray)

	        {

	            if(!set.add(arrayElement))

	            {

	                System.out.println("Duplicate Element is : "+arrayElement);

	            }

	        }

	}

}
