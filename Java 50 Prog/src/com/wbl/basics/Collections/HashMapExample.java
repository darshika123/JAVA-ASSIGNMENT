package com.wbl.basics.Collections;

import java.util.HashMap;

public class HashMapExample {
	
	// Creating a HashMap of int keys and String values
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
 
    // Adding Key and Value pairs to HashMap
 
   hashmap.put(11,abc);
   hashmap.put(12, "def");
    
    //To search for a key in HashMap
    boolean flag = hashmap.containsKey(11);
    System.out.println("Key 11 exists in HashMap? : " + flag);


    /* Get values based on key*/
    String var= hashmap.get(12);
    System.out.println("Value at index 12 is: "+var);

    
    /* Remove values based on key*/
    //hashmap.remove(11);
    //System.out.println("Map key and values after removal:");
}