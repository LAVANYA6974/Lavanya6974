package Operator;

public class Bitwise 
{

	public static void main(String[] args)
	{
		int a = 9; 
	    int b = 10; 
		 
		 // bitwise and 
		//1001&1010=1000
		 System.out.println("a&b = " + (a & b)); //8
		 
		 // bitwise or 
		  //1001|1010=1011
		 System.out.println("a|b = " + (a | b)); //11
		 
		 // bitwise xor 
		 //1001^1010=0011
		 System.out.println("a^b = " + (a ^ b)); //3
		
		 System.out.println("~a="+(~a));
		 
		 System.out.println("Bitwise Left Shift: a<<2 = "+(a<<2));
		 
		 System.out.println("Bitwise Right shift:a>>2="+(a>>2));
		
	
}
       	
}

/*a  b  a&b  a|b  a^b   (~a-.inverse the bit)
0  0   0    0    0     0      1
0  1   0    1    1     1      0
1  0   0    1    1
1  1   1    1    0 */
