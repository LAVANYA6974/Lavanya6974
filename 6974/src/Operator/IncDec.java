package Operator;

import java.util.Scanner;

public class IncDec {  //++a->increment a by 1 then use the new value of a in the expression 
	                   
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		
		System.out.println("Enter a and b:");
		int a=r.nextInt();
		int b=r.nextInt();
         System.out.println("a++:"+(a++));  //a++->use the current value of a in the expression,then increment by 1
         System.out.println("Value of a "+a);
         System.out.println("++a:"+(++a));
         
         System.out.println("b++:"+(b++));
         System.out.println("Value of b "+b);
         System.out.println("++b:"+(++b));
         
         System.out.println("a--:"+(a--));
         System.out.println("Value of a "+a);
         System.out.println("--a:"+(--a));
         
         System.out.println("b--:"+(b--));
         System.out.println("Value of b "+b);
         System.out.println("--b:"+(--b));
         r.close();
	}

}
