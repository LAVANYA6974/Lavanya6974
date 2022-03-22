package String;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("welcome to Edubride");
		System.out.println("Original String :"+str);
	
		System.out.println("Length of string " +str.length());

		for(int i=0;i<str.length();i++)
		{
		int p = i+1;
		 System.out.println("Characters at position : "+p+" is "+str.charAt(i));
		}
		
		str.append(" learning");
		System.out.println("Modified String :"+str);
		
	}
}
