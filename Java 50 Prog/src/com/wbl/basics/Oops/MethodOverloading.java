package com.wbl.basics.Oops;

public class MethodOverloading {
	
	public  int addition(int num1,int num2) {

		int result=0;

		result = num1+ num2;

		return result; 

	}

	public float addition(float num1,float num2) {

		float result =0.0f;

		result = num1+num2;

		return result;

	}

	public int addition(int num1,int num2,int num3) {

	int result = 0;

	result = num1+num2+num3;

	return result;

	}	

}
