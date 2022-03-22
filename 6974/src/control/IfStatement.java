package control;
import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value a and b:");
		int a=in.nextInt();
		int b=in.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b:"+a);
		}
		in.close();
	}
}