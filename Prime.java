package Practice;
import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args) 
	{
		 Prime ob=new Prime();
	     ob.display();
	     Prime.check();
	}
	void display()
	{
		System.out.println("PROGRAM TO CHECK IF A NUMBER IS PRIME OR NOT");
	}
	
	public static void check()
    {
  	  try(Scanner sc = new Scanner(System.in))
  	  {
  		 int i,m,flag=0;
  		 System.out.println("Enter a number: ");
  		 int a= sc.nextInt();
  		 int num=a;
  		 m=a/2;
  		if(num==0||num==1)
  		{  
  		   System.out.println("The entered number is not prime");      
  		}
  		else
  		{  
  		   for(i=2;i<=m;i++){      
  		    if(num%i==0)
  		    {      
  		     System.out.println("The entered number is not prime.");      
  		     flag=1;      
  		     break;      
  		    }      
  	  }
  		 if(flag==0)  
  		 { 
  			 System.out.println(num+" is prime number"); 
  		} 
    }

}
}
}