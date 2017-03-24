package com.wbl.FileHandlingJava;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamfile {
	
	public static void main(String[] args) throws  IOException {

		int x,y,z;

		   DataInputStream dis = new DataInputStream(System.in);

		   System.out.println("Enter two integers ");

		   

		
		   x =Integer.parseInt (dis.readLine());

			 y = Integer.parseInt(dis.readLine());

			  z = x*y;

			      

			      System.out.println("multiply of entered integers = :"+z);	   

	}

}
