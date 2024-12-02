import java.util.*;

public class Q9 {

	public static String reverse(int n)
	{
		if(n==0)
		 return "";

		else
			return n%10+reverse(n/10);
	}
	public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. ");
		int n=sc.nextInt();
		System.out.println("Reverse "+reverse(n));
		sc.close();
	}
}