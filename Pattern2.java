//Printing a eureka using stars
package class4;
import java.util.Scanner;
public class Pattern2 
{
	public static void main(String args[]) 
    { 
   	 Scanner sc= new Scanner(System.in);
   	 
   	 System.out.println("Enter number of rows to print pyramid: ");
        int n=sc.nextInt();
        Pattern(n); 
   	 sc.close();
    } 
	public static void Pattern(int n) 
    {  
        for (int i=0; i<n; i++) 
         { 
        	for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
                System.out.println(); 
         }
        for (int i=0; i<n; i++) 
        { 
    	    for (int j=0; j<i; j++)
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


