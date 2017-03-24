package com.wbl.FileHandlingJava;

import java.util.Scanner;

public class SumInteger {
	
	
	public static void main(String[]args){
		
		System.out.println("Enter your First number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		System.out.println("Enter your Second number");
		Scanner s1 = new Scanner(System.in);
		int b = s1.nextInt();
		
		int total = a + b;
		System.out.println("The Sum of two number is" +total);

	}
	

}
