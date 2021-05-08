package class1;
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
	    {
			System.out.print("Enter two characters: ");
			char ch = sc.next().charAt(0);
			char hc = sc.next().charAt(0);
		    System.out.println("Sum:"+(ch+hc));
		    System.out.println("Difference:"+(ch-hc));
		    System.out.println("Product:"+(ch*hc));
		    System.out.println("Quotient:"+(ch/hc));
		    System.out.println("Remainder:"+(ch+hc));
	    }

     }
}
