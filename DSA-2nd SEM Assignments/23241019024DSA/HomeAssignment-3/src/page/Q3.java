package page;
import java.util.*;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int res=dec_Binary(n);
		System.out.println("Binary equivalent of "+n+" is: "+res);
        sc.close();
	}

	public static int dec_Binary(int i) 
	{
		if(i==0)
		{
			return 0;
		}
		else
		{
			return(i%2+10*dec_Binary(i/2));
		}
	}

}
