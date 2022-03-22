package Assignment;
import java.util.Scanner;
public class PrimeNumber
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=scan.nextInt();       //variables initialization
		System.out.println("prime number 1 to n are:");
		int i,j,count;
		for(i=2;i<=n;i++)    //2 3 4....
		{
			count=0;
			for(j=2;j<i;j++)
			{ 
				if(i % j == 0)  //2%2 3%3....
				{
					count++;
				}
			}
			if(count==0) 
			{
				System.out.println(i+"");  //2 3....
			}
		}
	  }
}
		