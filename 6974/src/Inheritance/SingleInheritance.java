package Inheritance;
class sem1
{
	public sem1()   
	{
		System.out.println("sem1 is created");
	}
	public int com,maths,eng;
	void input1()
	{
		com=67;
		maths=75;
		eng=88;	
	}
	
public void output1() 
{
	System.out.println("-------semester1--------");
	System.out.println("Marks of computer"+com);
	System.out.println("Marks of mathematics"+maths);
	System.out.println("Marks of english"+eng);
	int total=com+maths+eng;
	System.out.println("semester1 result:"+total);
	System.out.println("******************************");
	}
}

class sem2 extends sem1
{
	public sem2()   
	{
		System.out.println("sem2 is created");
	}
    public int c,cpp,java;
	void input2()
	{
		c=77;
		cpp=78;
		java=74;	
	}
	
public void output2() 
{
	System.out.println("-------semester2--------");
	System.out.println("marks of c-language"+c);
	System.out.println("marks of cpp"+cpp);
	System.out.println("marks of java"+java);
	int total=c+cpp+java;
	System.out.println("semester2 result:"+total);
	System.out.println("******************************");
	}
}

class sem3 extends sem2
{
	public sem3()   
	{
		System.out.println("sem3 is created");
	}
    public int cs,ss,eg;
	void input3()
	{
		cs=79;
		ss=66;
		eg=80;	
	}
	
public void output3() 
{
	System.out.println("-------semester3--------");
	System.out.println("marks of control system"+cs);
	System.out.println("marks of signal system"+ss);
	System.out.println("marks of engineering graphics"+eg);
	int total=cs+ss+eg;
	System.out.println("semester3 result:"+total);
	System.out.println("******************************");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	sem3 obj=new sem3();
	obj.input1();
    obj.input2();
    obj.input3();
    obj.output1();
    obj.output2();
	obj.output3();

	}

}
