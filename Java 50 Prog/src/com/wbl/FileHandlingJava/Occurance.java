package com.wbl.FileHandlingJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Occurance {
	
	public static void main(String[] args) throws Exception 

	{

	//BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

	BufferedReader reader = new BufferedReader(new FileReader("C:/Darshika/Workspace/Java 50 Prog/src/com/wbl/FileHandlingJava/string.txt"));

	Scanner reader1 = new Scanner(System.in);

   	 System.out.print("enter the string to search ");

    	String word = reader1.nextLine();

  	  int count = 0;

	try{ 

		    for (String line; (line = reader.readLine()) != null; ) 

		    {

		        for (int i = 0; (i = line.indexOf(word, i)) != -1; i += word.length()) 

		        {

		            count++;

		        }

		    }

		}

	catch(Exception e)

	{

	   e.printStackTrace();

	 }

        System.out.println("There are " +count+ " occurrences of :"+word);

         }

}
