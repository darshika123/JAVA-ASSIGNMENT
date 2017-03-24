package com.wbl.basics.General;

public class StaticExample {
	
	
//StaticClass Example
	static class X{
	      static String str="Inside Class X";
	  }
	  public static void main(String args[])
	  {
	      X.str="Inside Class Example1";
	      System.out.println("String stored in str is- "+ X.str);
	      
	    //Execute Static Block
	      System.out.println("Value of num="+num);
	      System.out.println("Value of mystr="+mystr);
	      
	      StaticExample s = new StaticExample ();
	  }
	  
	  
	  //static block
	  static int num;
	   static String mystr;
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	   

	   StaticExample(){
		   System.out.println("Constructor called");
	   }
	   
} 
		
	  
	  
	 