package class5;
import java.util.Scanner;
public class PatternswNum3 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows=sc.nextInt();
		int n=rows;
		int i=1;
		while(i<=n)
	    {
			//int rows = 5;

            while(i <= rows)
            {
                int j = 1;
                while(j <= i)
                {
                    System.out.print("* ");
                    j++;
                }
                System.out.print("\n");
                i++;

            }
        }
		System.out.println();
		sc.close();
	      }
	     
	      
	}

