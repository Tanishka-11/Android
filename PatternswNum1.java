//Printing a right triangle using numbers
package class4;
import java.util.Scanner;
public class PatternswNum1
{
	public static void main(String args[]) //driver function
    { 
   	 Scanner sc= new Scanner(System.in);
   	 {
   		 
   	     System.out.println("Enter number of rows to print right triangle: ");
         int n=sc.nextInt();
         Pattern(n); 
         sc.close();
   	 }
    } 
	public static void Pattern(int n) 
    {   int num=1;
        for (int i=0; i<n; i++) 
         { 
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print(num+ " ");
                num++;
            } 
            System.out.println(); 
         }
     
    } 
} 

