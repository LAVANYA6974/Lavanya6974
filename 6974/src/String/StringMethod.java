package String;                                        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14  ---index
                                                       //H i , D u d e - w e l  c  o  m  e  
public class StringMethod {                            //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15  ---length

	public static void main(String[] args) {   
		String s=new String("Hi,Dude-welcome"); 
		System.out.println(s.charAt(8));  //charAt---to find the index of the string
		System.out.println(s.indexOf('c'));
		
		System.out.println(s.concat("to Edubridge"));   //concat---to add an array at the end of the string
		
		System.out.println(s. equalsIgnoreCase("Hi,Dude-welcome"));   //equal---to  compare the value is same or not 
		System.out.println(s. equalsIgnoreCase("Dudehi-welcome"));
		
		System.out.println(s.length());       //length---to find the length of the string
		
		System.out.println(s.replace('w','W'));    //replace---the string character is replace by another argument
		
		System.out.println(s.toLowerCase()); 
		
		System.out.println(s.toUpperCase()); 
		
		System.out.println(s.startsWith("hi"));
		System.out.println(s.endsWith("come"));
		
		System.out.println(s.substring(7));
		System.out.println(s.substring(3, 7));
		
		
	}

}
