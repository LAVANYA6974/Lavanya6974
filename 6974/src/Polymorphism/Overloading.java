package Polymorphism;

public class Overloading 
	{
		public void area(int side) // Calculate the area of Square 
		{
		 int result = side*side;
		 System.out.println("Area of Square is "+result);
		 }
		 public void area(int length, int breadth) // Area of Rectangle
		{
		 int result = length*breadth;
		 System.out.println("Area of Rectangle is "+result);
		}
		 public void area(double pi, int r)
		{
		 double result = pi*r*r;
		 System.out.println("Area of Circle is "+result);
		 }
		 

		public static void main(String args[])
		 
		{
			Overloading obj = new Overloading();
		 obj.area(10);
		 obj.area(10,20);
		 obj.area(3.14, 6);

	    }
}
