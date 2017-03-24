package com.wbl.FileHandlingJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {
	
	  public static void main (String[] args)

	    {		

	try

	{

		FileReader fileReader = new FileReader("C:/Darshika/Class Notes/SDLC.txt");

		

		BufferedReader br = new BufferedReader(fileReader);

	    String line ;	 

  int count=0;

		 

		while (( line = br.readLine()) != null)

		 {

			//System.out.println("Read line" + line);

			String [] a  = line.split(" ");

			count += a.length;

		  	 }

		System.out.println("Total no of words in the file = " +count);

		 }

		     catch (IOException e)

				{

					System.out.println ("Unable to read from file");

					

				}

	    }
		 

}
