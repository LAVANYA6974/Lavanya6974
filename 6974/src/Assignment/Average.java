package Assignment;
import java.util.Scanner;     
public class Average 
{
    public static void main(String[] args) 
    {
    	int n,num,sum=0;
    	float average;
    	Scanner obj=new Scanner(System.in);
    	System.out.println("Enter no.of subject mark:");
    	n=obj.nextInt();
    	int marks[]=new int[n];
    	System.out.println("Enter all the elements:");
    	
    	for(int i=0;i<n;i++)
    	{
    		marks[i]=obj.nextInt();
    		sum=sum+marks[i];
        }
    	System.out.println("sum:"+sum);
    	
    	average=sum/n;
    	System.out.println("average:"+average);
    	obj.close();
    	}
    	
    }
	