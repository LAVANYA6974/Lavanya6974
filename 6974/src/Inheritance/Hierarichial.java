package Inheritance;

public class Hierarichial 
{
	   public void methodA()
	   {
	      System.out.println("method of Class A");
	   }
	}
	class D extends Hierarichial
	{
	   public void methodB()
	   {
	      System.out.println("method of Class B");
	   }
	}
	class E extends Hierarichial
	{
	  public void methodC()
	  {
	     System.out.println("method of Class C");
	  }
	}
	class F extends Hierarichial
	{
	  public void methodD()
	  {
	     System.out.println("method of Class D");
	  }
	}
	class JavaExample
	{
	  public static void main(String args[])
	  {
	     B obj1 = new B();
	     C obj2 = new C();
	     D obj3 = new D();
	     //All classes can access the method of class A
	     obj1.methodA();
	     obj2.methodB();
	     obj3.methodC();
	  }
	}
