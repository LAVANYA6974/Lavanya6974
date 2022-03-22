package Polymorphism;

public class paybills
{
	 public void payment()
	 
	{
	 System.out.println("send moneyhome,recharge mobile,online shoping..");
	 
	}
	}
	class googlepay extends paybills 
	{
	 public void payment() 
	   { 
	 System.out.println("Do direct bank to bank transfer");
	   }
	}
	public class paybills
	
	{
	 public static void main(String args[]) 
	 
	{
	 googlepay obj = new googlepay(); // 
	 obj.payment(); // runs the method in Dog class
	 
	}
	}
