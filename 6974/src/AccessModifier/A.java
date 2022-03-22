package AccessModifier;
public class A
{  
	
public void msg()
  {
	  int a=10;
	  int b=10;
	  System.out.println("a+b="+(a+b));
	  System.out.println("a-b="+(a-b));
	  System.out.println("a*b="+(a*b));
	 // System.out.println("default--> The access level of a default modifier is only within the package. It cannot be accessed from outside the package");
	 // System.out.println("The access level of a public modifier is everywhere. It can be accessed from within \r\n"
	  	//	+ " the class, outside the class, within the package and outside the package");
	  System.out.println("The access level of a private modifier is only within the class. It cannot be accessed \r\n"
	  		+ " from outside the class");
  } 
}  