import java.util.*;

public class Q3 {
	
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt(); 
        int r ,n1=n,sum=0,product=1;

		while(n!=0)

        {   
			r=n%10;
			sum+=r;
			product*=r;
			n=n/10;
	    }
		if(sum==product)
		{
		System.out.println("The number "+n1+" is spy number ");
		}
		else {
			System.out.println("The number "+n1+" is not a spy number ");
		}
		sc.close();
	}
}