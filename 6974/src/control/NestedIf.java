package control;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);     
	       System.out.println("Enter the value age and weight:");
	       int age=in.nextInt();       //Creating two variables for age and weight   
	       int weight=in.nextInt(); 
	       if(age>=18)     //applying condition on age and weight
	       {       
	        if(weight>50)
	        {    
	            System.out.println("You are eligible to donate blood");    
	        } 
	        else
	        {  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	        } 
	       else
	     {  
	      System.out.println("Age must be greater than 18");  
	     }  
	       in.close();
	}  
		
	}


