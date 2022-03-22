package Assignment;

public class ReverseArray {

	public static void main(String[] args)
	{
	int[] arr= new int[] {1,2,3,4,5,6,7,8,9,10};
	System.out.println("the original array:");
	for(int i=0; i<arr.length ; i++)
	{
		System.out.print(arr[i]+"  ");
	}
	
	System.out.println();
	System.out.println("the reversed array:");                //Element 1 2 3 4 5 6 7 8 9 10
	for(int i=arr.length-1; i>=0; i--)                       //index   0 1 2 3 4 5 6 7 8 9 
	{
		System.out.print(arr[i]+"  ");
	}
	}

}
