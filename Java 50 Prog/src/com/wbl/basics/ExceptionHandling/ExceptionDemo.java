package com.wbl.basics.ExceptionHandling;

public class ExceptionDemo extends ExceptionParent {
	
	public static void main(String[]args){
		
		try{
			System.out.println ("Result");
		}
		
		 catch(ArithmeticException e){
	         System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
	      }	
		finally{
			System.out.println("finally block is always executed");}  
	}
		

}
