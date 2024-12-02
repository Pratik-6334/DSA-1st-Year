package page;
import java.util.*;
public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string n: ");
		String n=sc.nextLine();
		System.out.print("Reverse: ");
		reverse(n,n.length()-1);
	}
	public static void reverse(String a,int n)
	{
		if(n==0)
		{
			System.out.print(a.charAt(0));
		}
		else
		{
			System.out.print(a.charAt(n));
			reverse(a,n-1);
		}
	}

}
