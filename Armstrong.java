package class2;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[] args) 
	{
		try(Scanner sc= new Scanner (System.in))
		{
	    int num, b,sum = 0;
	    System.out.println("PROGRAM TO FIND ARMSTRONG NUMBER FROM 1 TO N");
	    System.out.println("Enter the upper limit(n)");
	    int n= sc.nextInt();
	    System.out.print("Armstrong numbers from 1 to " +n+ " are:");
		for(int i = 1; i <= n; i++)
	    {
		    num = i;
		    while(num > 0)
		    {
		         b = num % 10;
		         sum = sum + (b * b * b);
		         num = num / 10;
		    }
		    
		    if(sum == i)
		    {
		         System.out.println(i+" ");
		    }
		            sum = 0;
		 }
		}
	 }
}

	