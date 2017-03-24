package com.wbl.basics.String;

public class StringSearchAndReplace {
	
	public static void main(String[]args){
		
    String str = "Welcome to white box learning ";
    String searchString = "Welcome";
    
   System.out.println(str.contains(searchString));
   
   System.out.println("str.replace(Welcome,Hello): " + str.replace("Welcome", "Hello"));
   
	
	}
		

}
