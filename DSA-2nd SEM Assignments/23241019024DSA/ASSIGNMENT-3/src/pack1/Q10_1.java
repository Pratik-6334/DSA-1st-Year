package pack1;
import java.util.Scanner;
public class Q10_1 
{
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the position n: ");
      int n=sc.nextInt();
      int fno=fibo(n);
      System.out.println(n+"th fibonacci number is: "+fno);
      sc.close();
	}

	private static int fibo(int n) 
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2||n==3)
		{
			return 1;
		}
		else
		{
			return fibo(n-1)+fibo(n-2);
		}
	}

}
