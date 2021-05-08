package class2;
import java.util.Scanner;

import Practice.Method;
public class Compare 
{

	public static void main(String[] args) 
	{
		/*int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(a>b?"First number is larger":"Second number is larger");*/
		
		
        
		//Factorial
		/*int a,fact;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial:");
        a = s.nextInt();
        for(int i=1; i<=n;i++)
        {
        	fact=fact*i;
        	System.out.println(fact);
        }*/
        
        /*int a,table;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find its multiplication table:");
        a = s.nextInt();
        for(int i=1; i<=10;i++)
        {
        	table = a*i;
        	System.out.println(a+ "*" +i+ "=" +table);
        }*/
        
        /*int a,i,fib=0;
        Compare ob=new Compare();
        Compare.fib(int);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        a = s.nextInt();
        while(i<a)
        {
        	if((a==1)||(a==0)) 
        	{
              System.out.println(a);
            }
           else
            {
              System.out.println("Fibbonacci series is: "+(fib(a-1)+fib(a-2));
            }
        }
		
		int a=0,b=1,i=1,num;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = s.nextInt();
        while(i<=num)
        {
		System.out.print(a+" ");
        int sumOfPrevTwo = a + b;
        a = b;
        b = sumOfPrevTwo;
        i++;
        }
		
		
		int a, i=2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if its prime or not:");
        a = s.nextInt();
        boolean flag = false;
        while (i <= a / 2) 
        {
           if (a % i == 0) 
           {
              flag = true;
              break;
           }
           ++i;
        }
        
        if(!flag)
        System.out.println("The number is prime.");
        else
        System.out.println("The number is not prime.");
		
		
		 int a, revnum=0, rem;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number to check if it is a palindrome or not::");
	        a = s.nextInt();
	        int orignum=a;
	        while(a!=0)
	        {
	        rem=a%10;
	        revnum=revnum*10+rem;
	        a=a/10;
	        }
	        if(orignum==revnum)
	            System.out.println("The number is a palindrome.");
	            else
	            System.out.println("The number is not a palindrome.");
	        }*/
		
		int a;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if its prime or not:");
        a = s.nextInt();
        prime(a);
		
	}	
	public static void prime(int a)
	{
		int i=2;
        
        boolean flag = false;
        while (i <= a / 2) 
        {
           if (a % i == 0) 
           {
              flag = true;
              break;
           }
           ++i;
        }
        
        if(flag==false)
        System.out.println("The number is prime.");
        else
        System.out.println("The number is not prime.");
	}

		
		
	
	}


