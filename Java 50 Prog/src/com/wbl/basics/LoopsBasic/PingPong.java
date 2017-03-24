package com.wbl.basics.LoopsBasic;

import java.util.Scanner;

public class PingPong {
	
	public static void main(String[]args)
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=s.nextInt();
		
		if ( a % 2 == 0 )
		{
			System.out.println("PING");
		}
		
		else
			System.out.println("PINGPONG");
		
		//elseif ( a % 2 == 0 )
		//{
		//	System.out.println("PONG");
			
		//}
		
		//else((a%3 == 0) && (a%5 == 0))
		//{
		//	System.out.println("PINGPONG");
		//}
	}

}
