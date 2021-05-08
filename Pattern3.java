//Printing an inverted pyramid using stars
package class4;
import java.util.Scanner;
public class Pattern3 
{
	public static void main(String args[])
    { 
   	 Scanner sc= new Scanner(System.in);
   	 
   	 System.out.println("Enter number of rows to print inverted pyramid: ");
        int n=sc.nextInt();
        Pattern(n); 
        sc.close();
    } 
	public static void Pattern(int n) 
    {  
        for (int i=0; i<n; i++) 
            { 
        	for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=n-1-i; j++ )
            { 
                System.out.print("* "); 
            } 
  
            System.out.println(); 
            }
    } 
} 


