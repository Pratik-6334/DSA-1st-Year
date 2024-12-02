package page;
import java.util.*;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m and n: ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int k=gcd(m,n);
		System.out.println("G.C.D of "+m+" and "+n+" is: "+k);
		sc.close();
	}
	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			int z=a%b;
			a=b;
			return gcd(a,z);
		}
	}

}
