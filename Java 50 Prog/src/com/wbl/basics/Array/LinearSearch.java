package com.wbl.basics.Array;

public class LinearSearch {
	
	public static int linearSearch(int[]arr,int key){
		int size = arr.length;
		for(int i = 0;i < size;i++){
			if(arr[i] == key){
				return i;
			}
		}
			return -1;
			
		}

	
	public static void main(String args[]){
		
		int[] myArr = {12,78,0,65,234,88,99,76};
	        int searchkey = 65;
	        
			System.out.println("Key "+ searchkey +" found at index: "+linearSearch( myArr , searchkey));
		
	}
}
