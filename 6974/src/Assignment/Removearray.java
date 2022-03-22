package Assignment;
import java.util.Scanner;

public class Removearray
{
      public static void main(String[] args) 
	{
	
	int index=0;
	int max=4;
	
//	int array[]=new int[5];
   int[] array= new int[] {99,88,77,66,55};
	System.out.println("the original array:");
	for(int i=0; i<array.length ; i++)
	{
		System.out.print(array[i]+"  ");
	}
	System.out.println();
	
	Scanner sc=new Scanner(System.in);
   System.out.println("enter the index to delete value:");
	index=sc.nextInt();
	for(int i>=index;i<max.lenght;i++)
	{
		array[i]=array[i+1];
	}
	System.out.println("after deleting the value from the location are following:");
	for(int i=0;i<max;i++)
	{
		System.out.print(array[i]+" ");
	}
	//sc.close();
	}
    }