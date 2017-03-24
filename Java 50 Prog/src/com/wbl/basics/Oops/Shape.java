package com.wbl.basics.Oops;

public abstract class Shape {
	
	public int noofsides;
	public float length;
	public float width;
	public float area;
	
	//public  abstract void set_Sides(int noOfSides, float length, float width);

	

		public abstract float calculate_Area();

		

		public  float calculate_Perimeter() {

			return 2 *(length+width);

		}
	

}
