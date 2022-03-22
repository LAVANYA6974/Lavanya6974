package Jump;

public class BreakStatement 
{   //This statement is used to jump out of a loop.
	//The remaining statements which are after the break and within the loop are skipped.

	public static void main(String[] args)
	{   
		 System.out.println("Break statements");
		int i = 1;
		while (i<=10) 
		{
	    System.out.println("\n" + i); //1 2 3 4
		i++;
		if (i==5)
		{
		break;
      	}
		} 
	}
}
