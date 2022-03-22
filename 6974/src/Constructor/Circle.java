package Constructor;

public class Circle {
	//creating a default constructor
	Circle(){
		System.out.println("Area of circle-------------");
	}
	
	//creating a parameterized construction
	Circle(double pi,int radius)
	{
		System.out.println("radius:"+radius);
		double area=pi*radius*radius;
		System.out.println("Area of circle:"+area);
	}
	//main method
	public static void main(String[] args)
	{
		//calling a default constructor
		Circle obj = new Circle();
		Circle obj1 = new Circle(3.14,5);
		}

}
