import java.util.*;
public class Q8 {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("ENTER THE VALUE OF X AND N: ");
	 int x=sc.nextInt();
	 int n=sc.nextInt();
	 int val=power(x,n);
	 System.out.println("The value of "+x+"^"+n+" is: "+val);
	}
	public static int power(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		else
		{
			return a*power(a,b-1);
		}
	}

}
