package com.wbl.basics.LoopsBasic;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[]args)
	{
		int a,b,c;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		a=s.nextInt();
		System.out.println("enter value of b");
		b=s.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("values in a:" +a);
		System.out.println("values in b:" +b);
				
	}
}
//Scanner s=new Scanner(System.in): are used for receive input from keyboard.
//nextInt(): method are used for get integer type value from keyboard.
//System.out.println("....."): are used for display message on screen or console//