package pack1;
import java.util.Scanner;
public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF M");
		int m=sc.nextInt();
		int j=fact(m);
		System.out.println("THE FACTORIAL OF "+m+" IS: "+j);
	}
	public static int fact(int n)
	{
		if(n==0)
		{
		  return 1;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
		   return(n*fact(n-1));
		}
	}

}
