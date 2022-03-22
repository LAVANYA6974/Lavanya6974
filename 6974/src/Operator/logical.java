package Operator;

public class logical {

	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);//false && true = false  
		System.out.println(a<b||a<c);//false & true = true 
		}  
	    }
	    







/*operator   meaning        X   Y  AND OR 
    &&       logical AND    0   0   0   0
    ||       logical OR     0   1   0   1
    !        logical NOT    1   0   0   1
                            1   1   1   1   */
//&&->1 if both bits are 1.
//||->1 if either bit is 1.