//FizzBuzz
package class1;
import java.util.Scanner;
public class Q4 
{
	public static void main(String[] args) 
	{
	    try (Scanner sc = new Scanner(System.in))
	    {
		   System.out.print("Enter the number: ");
		   int a = sc.nextInt();
		   if((a%5==0)&&(a%3==0))
		   {
		      System.out.println("FizzBuzz");
		   }
		   else if(a%5==0)
		   {
		      System.out.println("Buzz");
		   }
		   else if(a%3==0)
		   {
		      System.out.println("Fizz");
		   }
		   
		   else 
		   {
		      System.out.println(a);
		   }
		}
	}

}
