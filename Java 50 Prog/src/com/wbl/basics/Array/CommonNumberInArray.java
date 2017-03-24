package com.wbl.basics.Array;

public class CommonNumberInArray {
	
	public static void main(String args[]){
		
		int[]arr1 = { 12,67,35,100,1234,88 };
		int[]arr2 = { 56,90,100,78,33,5678,12,99 };
		
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println(arr2[j]);
			}
		}
		
	}

}
