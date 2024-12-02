package page;
import java.util.*;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string n: ");
		String n=sc.nextLine();
		String reverse="";
		System.out.print("Reverse: ");
		String res=Palindrome(n,reverse,n.length()-1);
		System.out.println(res);
	}
	public static String Palindrome(String a,String rev,int n)
	{
		if(n==rev.length())
		{
			rev=a.charAt(0)+rev;
			return rev;
		}
		else
		{
			rev=a.charAt(n)+rev;
			return Palindrome(a,rev,n-1);
		}
	}

}
