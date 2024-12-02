import java.util.*;

public class Q7 {

	public static int fact(int n)
	{
		if(n==1 || n==0)
		    return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a no: ");
     int n=sc.nextInt();
     System.out.println("Factorial= "+fact(n));
     sc.close();
	}
}