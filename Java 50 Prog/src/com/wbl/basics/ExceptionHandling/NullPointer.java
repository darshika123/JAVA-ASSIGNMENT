package com.wbl.basics.ExceptionHandling;

public class NullPointer {
	
	
	private static final Object NullPointer = null;

	public static void main(String[]args){
		
		String ptr = null;
		try{
			
		
		if (ptr.equals(NullPointer))
			System.out.println("Its Same");
		else
			System.out.println("Not Same");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception Caught");
		}
	}

}
