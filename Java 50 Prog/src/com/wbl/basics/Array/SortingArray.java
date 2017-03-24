package com.wbl.basics.Array;

import java.util.Scanner;

public class SortingArray {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		//get value from user
		System.out.println("Enter a No:");
		int n = sc.nextInt();
		
		//declare Array and other variables
		int []a = new int[n];
		int i,j,temp = 0;
		
		//now get all array elements from user
		System.out.println("enter "+ n +  " Array elements:");
		for(i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		//print all array elements
		System.out.println("\n Array elements are:");
		for(i=0;i<n;i++){
			System.out.println("  "+a[i]);
		}
	//now arrange array in ascending array
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
	//print array in ascending array
		System.out.println("Array elements in Ascending order:");
		for(i=0;i<n;i++){
			System.out.println("   " + a[i]);
		}
		
		//now arrange array in decending array
				for(i=0;i<n;i++){
					for(j=i+1;j<n;j++){
						if(a[i]<a[j]){
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
							
						}
					}
				}
				
			//print array in decending array
				System.out.println("Array elements in decending order:");
				for(i=0;i<n;i++){
					System.out.println("   " + a[i]);
				}
	}
		
}
