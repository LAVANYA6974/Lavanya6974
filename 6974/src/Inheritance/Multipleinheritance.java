package Inheritance;
    interface A
      {
	    final static int x=30;
	     abstract void display();
	     public void show();
      }
    interface B
    {
	     static int x=50;
	     public void show();
    }
     class car
     {
    	public void speed()
    	{
    		System.out.println("speed of the car is very good");
    		}
     }
public class Multipleinheritance extends car implements A,B
{

	public static void main(String[] args) {
		Multipleinheritance obj =new Multipleinheritance();
	
		obj.speed();
		obj.display();
		obj.show();
	}

	@Override
	public void show() 
	{
		System.out.println("this is my show method");
		System.out.println("the value of x of interface A:"+A.x);
		System.out.println("the value of x of interface B:"+B.x);
		
	}
    public void display() 
    {
    	System.out.println("this is my display method");
	}


}
