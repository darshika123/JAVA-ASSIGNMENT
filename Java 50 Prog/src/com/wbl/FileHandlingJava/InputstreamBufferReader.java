package com.wbl.FileHandlingJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputstreamBufferReader {
	
//public void InputStreamBufferReader ()throws Exception {

		

	public static void main(String[] args) throws IOException {

		int x,y,z;

			InputStreamReader r=new InputStreamReader(System.in);  

			BufferedReader br=new BufferedReader(r);



			 System.out.println("Enter two integers");

		   x =Integer.parseInt (br.readLine());

		 y = Integer.parseInt(br.readLine());

		   z = x-y;

		
		      System.out.println("Substract of entered integers ="+z);

		   

		}


}
