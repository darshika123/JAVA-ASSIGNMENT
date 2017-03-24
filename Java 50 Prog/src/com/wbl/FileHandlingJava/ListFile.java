package com.wbl.FileHandlingJava;

import java.io.File;

public class ListFile {
	
			public static void main(String[] args) {

				{

					try

					{

						File file = new File("C:/Users/darshika");
						File[] listOfFiles = file.listFiles();
	

						System.out.println("Below are the file names in "+file+"\n");	

						for (int i = 0; i < listOfFiles.length; i++) 

						{

						     

							System.out.println(listOfFiles[i].getName());			    

			}

					}

					catch(Exception e)

					{

						System.out.println("end of line");

					}

					}

				

				}

			}

			
