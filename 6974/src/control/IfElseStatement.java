package control;
import java.util.Scanner;
public class IfElseStatement {

	public static void main(String[] args) {
		Scanner If=new Scanner(System.in);
		System.out.println("Enter the value a and b:");
		int a=If.nextInt();
		int b=If.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b:"+a);
		}
		else
		{
			System.out.println("b is greater than a:"+b);
		}
		If.close();
	}

}
