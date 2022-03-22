package String;

public class Stringdemo {

	public static void main(String[] args) 
	{
	String s="it refers to literal assignment";  
	String s1=new String("it refers to new word assignment");
	char ch[]= {'a','r','r','a','y',' ','t','o',' ','s','t','r','i','n','g',' ','c','o','n','v','e','t','e','r'};
	System.out.println(s);
	System.out.println(s1);
	System.out.println(ch);
	System.out.println();
	
	char chars[]= {'h','e','l','l','o','j','a','v','a','!'};
	String s2=new String(chars);
	System.out.println("String is:"+s2);  //string initialized by the array of character 
	System.out.println();
	
	String s3=new String(chars,4,4);
	System.out.println("String is:"+s3);    //sub range of character array(index value)
	System.out.println();
	
	String s4=new String(chars);         //string object contain same character sequence of another string object
	System.out.println("String is:"+s4);
	String s5=new String(chars);
	System.out.println("String is:"+s5);
	System.out.println();
	
	byte ascChars[]= {65,66,67,68,69,70};    //byte array 
	String s6=new String(ascChars);
	System.out.println("String is:"+s6);
	String s7=new String(ascChars,2,3);
	System.out.println("String is:"+s7);
	}

}
