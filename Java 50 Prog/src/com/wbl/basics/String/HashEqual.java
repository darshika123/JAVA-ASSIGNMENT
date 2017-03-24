package com.wbl.basics.String;

import java.util.Set;
import java.util.HashSet;

public class HashEqual {
	
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub


		Emp emp1 = new Emp(10);
		Emp emp2 = new Emp(10);
		

		if(emp1.equals(emp2)) 

			System.out.println("They are equal");

		else

			System.out.println("Not Equal");

		

		Set<Emp> hshSet = new HashSet<Emp> ();

		hshSet.add(emp1);

		hshSet.add(emp2);

		

		System.out.println("HashCode::" +emp1.hashCode());

		System.out.println("HashCode::" +emp2.hashCode());

		System.out.println("Size of Hashset::" +hshSet.size());
		
		
		
	}	
   
		
	}




	

