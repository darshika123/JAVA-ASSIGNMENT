package com.wbl.loopsbasic;

public class Fibonacci {
	
	public void main (String[]args){
		
		int count = 15;
		int n1 = 0,n2 = 1,n3,i;
		System.out.println(n1+""+n2);
		
		for(i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}	

}
