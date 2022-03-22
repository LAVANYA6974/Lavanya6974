package Constructor;

public class car
{ 
 String name;
 String model;
 double speed;
 //creating a parameterized constructor 
 car(String name,String model,double speed) // Here, I and n are local variables
 { 
 this.name = name; 
 this.model= model;
 this.speed= speed;
 }
 void display() // Member function
 {
 System.out.println("\nString"+name);
 System.out.println("\nString"+model);
 System.out.println("\ndouble"+speed);
 
 }
 public static void main(String args[])
 { 
 //creating objects and passing values 
 car s1 = new car("BMW","Zxi",160.50);
 car s2 = new car("Swift","xyz",230.40); 
 //calling method to display the values of object 
 s1.display(); 
 s2.display();
 } 
 }