import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
	    {
			System.out.print("Enter two integers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
		    System.out.println("Value of a before swapping:"+a);
		    System.out.println("Value of b before swapping:"+b);
		    a=a+b;
		    b=a-b;
		    a=a-b;
		    System.out.println("Value of a after swapping:"+a);
		    System.out.println("Value of b after swapping:"+b);
		   
	    }

	}

}
