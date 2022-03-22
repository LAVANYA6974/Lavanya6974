package Assignment;

public class Copyarray {

	public static void main(String[] args) 
	{
		int a[]= {1,3,5,8,0};
		int b[]=new int[a.length];
		b=a;  //b refer to same location   
		System.out.println("contents of a[]:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");   
		}
		System.out.println();
		
		System.out.println("contents of b[]:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");   
		}
	}
	}

