package com.wbl.basics.LoopsBasic;

import java.util.Scanner;

public class Fact {
	
	public static void main(String[]args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
        int n =s.nextInt();
        int result = Fact(n);
        System.out.println("The factorial of " + n + " is " + result);
        
	}
      public static int Fact(int n){
    	  int result = 1;
    	  for(int i=1;i<n;i++){
    		  result = result*i;
    		  
    	  }
    	  
    	  return result;
      }
}
