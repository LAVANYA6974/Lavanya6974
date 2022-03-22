package Iteration;

public class DoWhile {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0; 
		do 
		{                  // sum 0, 1,3, 6, 10,15,21,28,36,45,55
			sum = sum + i;  // I 1, 2,3,4,5,6,7,8,9,10
		i++;
		}while (i<=10);
		System.out.println("The sum of 1 to 10 is .. " + sum);

	}

}
