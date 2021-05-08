//WAP to check whether an alphabet is a vowel or a consonant
package class1;

import java.util.Scanner;

public class Q2 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in))
	    {
			System.out.print("Enter a character: ");
			char ch = sc.next().charAt(0);
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    {
		       System.out.println("Character is a vowel");
		    }
		    else 
		    {
		       System.out.println("Character is a consonant");
		    }
		}
	}
}
