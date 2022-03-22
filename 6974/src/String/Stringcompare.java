package String;

public class Stringcompare {

	public static void main(String[] args) {
		String s1="Bus"; 
		 String s2="Bus"; 
		 String s3="Car"; 
		 String s4=new String("Bus"); 
		 
		 System.out.println(s1.equals(s2));   //Bus eqBusual Bus--true
		 System.out.println(s1.equals(s3));   //Bus equal Car--false
		 System.out.println(s1.equals(s4));   //Bus equal --true
		 System.out.println();
		 
		 System.out.println(s1==s2);//true (because both refer to same instance) 
		 System.out.println(s1==s3);//false(because s3 refers to instance created in non pool) 
		 System.out.println();
		 
		 System.out.println(s1.compareTo(s2)); // 0 
		 System.out.println(s1.compareTo(s3)); // 1(because s1>s3) 
		 System.out.println(s3.compareTo(s1)); // -1(because s3 < s1 ) 
	}

}
