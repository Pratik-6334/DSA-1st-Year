import java.util.*;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n1=sc.nextInt();

		System.out.println(n1+" is odd: "+isOdd(n1));
		sc.close();
		}

	public static boolean isOdd(int n)
	{
	 return (n&1)!=0;
	}
}