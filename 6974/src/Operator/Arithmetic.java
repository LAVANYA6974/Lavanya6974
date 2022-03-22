package Operator;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a=r.nextInt();
		int b=r.nextInt();
	    // addition operator
	    System.out.println("a + b="+ (a + b));

	    // subtraction operator
	    System.out.println("a - b = " + (a - b));

	    // multiplication operator
	    System.out.println("a * b = " + (a * b));

	    // division operator
	    System.out.println("a / b = " + (a / b));

	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    r.close();
	  }
	
	}