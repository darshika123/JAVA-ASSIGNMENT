package com.wbl.basics;

import java.util.Scanner;

public class OddEven {
	
	public static void main (String args[]){
		
		int a ;
		
		Scanner in = new Scanner(System.in);
	      a = in.nextInt();
		
		System.out.println("Enter a no");
		
	      if ( a % 2 == 0 )
	    	System.out.println("This is Even no");  
	      
	      else
	    	  
	    	  System.out.println("This is Odd no");
	    	    
	}

}
