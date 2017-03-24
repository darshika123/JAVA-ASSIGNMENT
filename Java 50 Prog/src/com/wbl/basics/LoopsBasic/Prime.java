package com.wbl.basics.LoopsBasic;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[]args)
	{
		int a;
		boolean isPrime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a no. to check:");
		int num=scan.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
			a=num%i;
			if(a==0)
			{
				isPrime=false;
				break;			
			}	
		}
		
		if(isPrime)
			System.out.println("num + is Prime no");
		else
			System.out.println("num + is not Prime no");
	}
	

}
