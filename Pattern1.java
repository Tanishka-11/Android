//Printing a pyramid using stars
package class4;
import java.util.Scanner;
public class Pattern1 
{
	public static void main(String args[]) //driver function
    { 
   	 try(Scanner sc= new Scanner(System.in))
   	 {
   	 System.out.println("Enter number of rows to print pyramid: ");
        int n=sc.nextInt();
        Pattern(n); 
   	 }
    } 
	public static void Pattern(int n) 
    {  
        for (int i=0; i<n; i++) 
            { 
        	for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); 
            } 
  
            System.out.println(); 
            }
     
    } 
} 

