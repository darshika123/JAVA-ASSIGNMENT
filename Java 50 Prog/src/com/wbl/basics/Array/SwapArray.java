package com.wbl.basics.Array;

public class SwapArray {

	
	 public static void main(String[] args) {

	        int[] a={8,6,7,1,5};

	              a=asd(a);

	        for(int i:a)

	              System.out.println(i);

	}

	    public static int[] asd(int[] a){


	        for(int i=0;i<a.length;i++){

	            for(int j=0;j<a.length;j++){

	                int temp=0;

	                if(a[i]<a[j]){

	                    temp=a[j];                  

	                    a[j]=a[i];                  

	                    a[i]=temp;      

	                  }         

	                }

	        }

	        return a;



	    }
}
