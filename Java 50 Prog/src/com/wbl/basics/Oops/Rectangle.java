package com.wbl.basics.Oops;


	public class Rectangle extends Shape {



		public Rectangle(int noOfSides,float length,float width) {

			

			this.noofsides = noofsides;

			this.length = length;

			this.width = width;
	

		}

	/*	@Override

		public void set_Sides(int noOfSides, float length, float width) {

			// TODO Auto-generated method stub

			System.out.println("The no of sides,legth and width are:: " +noofsides  +length +width);

		
		}*/

		@Override

		public float calculate_Area() {

			// TODO Auto-generated method stub

			return length * width;

		}


		/*@Override

		public float calculate_Perimeter() {

			// TODO Auto-generated method stub

			return 2 *(length+width);

		}

		*/	

}
