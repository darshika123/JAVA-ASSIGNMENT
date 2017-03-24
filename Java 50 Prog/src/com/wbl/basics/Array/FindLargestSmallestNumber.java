package com.wbl.basics.Array;

public class FindLargestSmallestNumber {
	
	public static void main (String[]args)
{
		int numbers[] = new int []{ 22,90,342,888,102345,67533,65 };
		
		 //assign first element of an array to largest and smallest
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for (int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
				largest = numbers[i];
			
			
			else if(numbers[i]<smallest)
			     smallest = numbers[i];
			
		}
		System.out.println("largest number is :" +largest);
		System.out.println("smallest number is :" +smallest);
		

}
}
