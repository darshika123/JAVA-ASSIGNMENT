package com.wbl.basics.LoopsBasic;

import java.util.Scanner;


public class InputFromUser {
	
	
	public static void main(String[]args)
	{
		System.out.println("plz enter input");
		
		Scanner S = new Scanner(System.in);
		
		 //Getting input in String format
		String name = S.nextLine();
		System.out.println("Hi" + name);
		
		
		//Getting number as input from command line in Java

		System.out.println("Enter a Number");
		int number = S.nextInt();
		System.out.println("you have entered:  " + number );
		
		//Getting floating point as input from command line in Java
		
		System.out.println("Enter Floating Number");
		float decimal = S.nextFloat();
		System.out.println("you have entered:  " + decimal);
		

		//Java Example to get input from user using GUI
		        //String input = JOptionPane.showInputDialog("Enter any number of your choice");
		        //System.out.println("User has entered: " + input);
		
	}

}
