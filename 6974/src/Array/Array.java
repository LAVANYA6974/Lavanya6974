package Array;
import java.util.Scanner;
public class Array {
		
	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.println("enter number of students");
		int n=r.nextInt();
		
		int marks[]=new int[n];
		
		System.out.println("enter marks");
		for(int i=0;i<marks.length;i++)
		{
			 marks[i]=r.nextInt();
		}
		
		System.out.println("marks are");
		for(int a:marks)
		{
			System.out.println("marks of students"+marks[a]);
		}
		r.close();
	}
}
