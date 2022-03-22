package control;
import java.util.Scanner;
public class IfElself {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter mark:");
		int mark=s.nextInt();
		if(mark<50){
			System.out.println("fail");
			System.out.println("Try to pass");
			
		}
		else if(mark>50 && mark<60)
		{
			System.out.println("D grade");
			System.out.println("Study Hard");
		}
		else if(mark>60 && mark<70)
		{
			System.out.println("C grade");
			System.out.println("Need more practice to get A+ grade");
		}
		else if(mark>70 && mark<80)
		{
			System.out.println("B grade");
			System.out.println("Good!Need more practice to get A+ grade");
		}
		else if(mark>80 && mark<90)
		{
			System.out.println("A grade");
			System.out.println("Very Good!Need more practice to get A+ grade");
		}
		else if(mark>90 && mark<=100)
		{
			System.out.println("A+ grade");
			System.out.println("Excellent *****");
		}
		else
		{
			System.out.println("invalid");
		}
		s.close();
	}
}

