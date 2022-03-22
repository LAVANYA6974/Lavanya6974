package Assignment;
import java.util.Scanner;
public class Plaindrome 
{
 public static void main(String[] args) 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter num value:");
			int num=scan.nextInt();       //variables initialization
			scan.close();
			int  check = 0, rem, temp;
			temp = num;
			 while (temp > 0)
		       {
		     	rem = temp % 10;      //
		     	check = check * 10 + rem;
		     	temp /= 10;
		       };

		     // palindrome if num and reverse are equal
		     if (num == check)
		       System.out.println (num + " is Palindrome");
		     else
		       System.out.println (num + " is not Palindrome");
		   }
		 }
