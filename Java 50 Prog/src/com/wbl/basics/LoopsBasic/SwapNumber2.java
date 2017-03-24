package com.wbl.basics.LoopsBasic;

import java.util.Scanner;

public class SwapNumber2 {
	
	public static void main(String[]args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=s.nextInt();
		System.out.println("enter value of b:");
		b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("values in a:" +a);
		System.out.println("values in b:" +b);
			
	}

}
