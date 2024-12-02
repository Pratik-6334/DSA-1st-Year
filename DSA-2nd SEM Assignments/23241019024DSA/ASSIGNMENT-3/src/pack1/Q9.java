package pack1;
import java.util.*;
public class Q9 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n: ");
		int n=sc.nextInt();
		System.out.print("Reverse: ");
		reverse(n);
	}
	public static void reverse(int a)
	{
		if(a==0)
		{
			return;
		}
		else
		{
			System.out.print(a%10);
			reverse(a/10);
			
		}
	}

}
