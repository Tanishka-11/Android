package Practice;
import java.util.Scanner;
public class PrintAllPrimes 
{

	public static void main(String[] args) 
	{
		PrintAllPrimes ob=new PrintAllPrimes();
	     ob.display();
	     PrintAllPrimes.print();

	}
	void display()
	{
		System.out.println("PROGRAM TO FIND PRIME NUMBERS FROM 1 TO N");
	}
	
	public static void print()
    {
  	  try(Scanner sc = new Scanner(System.in))
  	  {
  		int i,m;
  		System.out.println("Enter the upper limit(n): ");
  		int n= sc.nextInt();
  		String  PrimeNumbers = "";
       
        for (i = 1; i <= n; i++)  	   
        { 		 		  
           int count=0; 		  
           for(m=i; m>=1; m--)
           {
  	    if(i%m==0)
  	    {
  		count += 1;
  	    }
  	 }
  	 if (count==2)
  	 {
  	    PrimeNumbers = PrimeNumbers + i + " ";
  	 }	
        }	
        System.out.println("Prime numbers are 1 to " +n+ " are : ");
        System.out.println(PrimeNumbers);
  		 
  	  }
    }
}

