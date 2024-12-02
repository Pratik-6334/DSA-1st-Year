import java.util.*;
public class max_min {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no.s ");
		int n=sc.nextInt();
		System.out.println("Enter numbers in array:");
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		int min=ar[0];
		int lmax=ar[0];
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			else
			{
				if(min<ar[i])
				{
					min=ar[i];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]>lmax&&ar[i]!=max)
			{
				lmax=ar[i];
			}
			
		}
		System.out.println("max is "+max);
		System.out.println("min is "+min);
		System.out.println("min is "+lmax);
		sc.close();
	}
}