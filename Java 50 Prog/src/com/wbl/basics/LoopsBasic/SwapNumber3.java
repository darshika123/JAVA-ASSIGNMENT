package com.wbl.basics.LoopsBasic;

public class SwapNumber3 {
	
	public static void main(String[]args)
	{
		int num1=10;
		int num2=20;
		System.out.println("before swapping");
		System.out.println("value of num1 is:" +num1);
		System.out.println("value of num2 is:" +num2);
		
		swap(num1,num2);
		
		}

	private static void swap(int num1, int num2) {
		
		// TODO Auto-generated method stub
		int a = num1;
		num1 = num2;
		num2 = a;
		System.out.println("After Swapping");
		System.out.println("value of num1 is:" +num1);
		System.out.println("value of num2 is:" +num2);
		
	}
}
