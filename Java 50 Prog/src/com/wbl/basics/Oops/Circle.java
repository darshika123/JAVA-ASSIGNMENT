package com.wbl.basics.Oops;

public class Circle extends Shape implements ShapeConstants {


	public float radius;

	public Circle(int noOfSides,float radius) {

	this.noofsides = noofsides;

	this.radius = radius;

}

@Override

public float calculate_Area() {

	// TODO Auto-generated method stub

	

	return pi*radius*radius;

}

@Override

public  float calculate_Perimeter() {

	return 2 *pi*radius;

}

}