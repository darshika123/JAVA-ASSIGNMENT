package com.wbl.FileHandlingJava;

import java.io.Console;
import java.io.*;


public class ConsoleClass {
	
	public static void main(String[]args)throws Exception  {
		
		int a,b,c = 0;
		
		Console cs=System.console();
		System.out.println("Enter two Integer numbers");
		 
		a = Integer.parseInt(cs.readLine());
		b = Integer.parseInt(cs.readLine());
		 
		try{
			c=a/b;
		}

		 catch(Exception e)
		{
			System.out.println("Can not divide by zero"); 
		 }
	
		 
		 System.out.println("Divide of two numbers is:" +c);
		
	}

}
