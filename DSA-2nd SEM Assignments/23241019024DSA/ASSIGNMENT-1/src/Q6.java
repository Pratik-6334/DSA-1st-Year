import java.util.*;
public class Q6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value i= ");
		int i=sc.nextInt();
		boolean res=isodd(i);
		if(res)
		{
			System.out.println(i+" is an odd number. ");
		}
		else
		{
			System.out.println(i+" is not an odd number. ");
		}
		sc.close();
	}
	public static boolean isodd(int n)
	{
		return(n&1)==1;
	}

}
