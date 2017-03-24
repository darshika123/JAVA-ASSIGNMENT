package com.wbl.basics.Collections;

import java.awt.List;
import java.util.ArrayList;

import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrListDetail {
	
	public static void main(String[] args) {

        //ArrayList<String> Declaration
        ArrayList<String> al= new ArrayList<String>();
        //add method for String ArrayList
        al.add("Ram");
        al.add("Shyam");
        al.add("CPS");
        al.add("John");
        al.add("Steve");
        System.out.println("Elements of ArrayList of String Type: "+al);
        
        
        //To Search for an element in the List.
        System.out.println("ArrayList contains the string 'pen': "
                +al.contains("pen"));
        System.out.println("ArrayList contains the string 'Ram': "
                  +al.contains("Ram"));

       
        
       //To Print the elements of the list using Iterator. 
        java.util.Iterator<String> it = al.iterator();
        
        while(it.hasNext()) {
            String obj = (String)it.next();
            System.out.println(obj);
          }

       
      //Obtaining list iterator using forward and backward direction
       ListIterator<String> litr = null;
        ArrayList<String> names = new ArrayList<String>();
        
        
        litr=al.listIterator();
     
        System.out.println("Traversing the list in forward direction:");
        while(litr.hasNext()){
           System.out.println(litr.next());
        }
        System.out.println("\nTraversing the list in backward direction:");
        while(litr.hasPrevious()){
           System.out.println(litr.previous());
        }
      }
       

}
