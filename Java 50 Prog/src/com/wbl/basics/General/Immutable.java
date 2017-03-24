package com.wbl.basics.General;

public final class Immutable {
	

	public  final String course = "Whitebox JAVA";

	public  final int courseFee = 600;

	

	public static final void displinfo() {

		Immutable stud = new Immutable();

		//stud.course = "Unix";				//not allowing the course value to change

		//stud.courseVersion = 100;

	System.out.println("Course:: " +stud.course +"  CourseFee:: "+ stud.courseFee);

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		displinfo();	

	}
	    
	
}
