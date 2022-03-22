package Operator;

public class Assignment {

	public static void main(String[] args) {
		int a=10,  c=20;    //20 30 20 400 
		 System.out.println("The Assignment Value is : ");
		 c += a ;//c=c+a
	      System.out.println("c += a  = " + c );//30

	      c -= a ;//c=c-a
	      System.out.println("c -= a = " + c );//20

	      c *= a ;//c=c*a
	      System.out.println("c *= a = " + c );//400
	      
	      c /= a;//c=c/a
	      System.out.println("c /= a = " + c );//20
	      
	      c %= a ;//c=c%a
	      System.out.println("c %= a = " + c );//0
	}
}
