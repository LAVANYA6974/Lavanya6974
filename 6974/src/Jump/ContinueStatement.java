package Jump;

public class ContinueStatement {

	public static void main(String[] args) {
		//statement is used only within looping statements.
		//The remaining statements in the loop are skipped. The execution starts from the 
		//top of loop again.
		//When the continue statement is encountered, the next iteration starts.
		for (int i=1; i<20; i++)
		{
		if (i%2 == 0)
		{
		continue;
		}
		System.out.println("\n" + i);
		}
	}
}
