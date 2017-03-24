package com.wbl.basics.LoopsBasic;
import java.lang.Error;


public class Factorial {
	
	
	public static void main(String[] args){
		
		int n = 7;
		int result = factorial(n);
		System.out.println("Factorial of 7 is:" +result);
			
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 0)
		{
			return 1;
		
		}
		else{
			return n * factorial(n-1);
		}
	
}
}
