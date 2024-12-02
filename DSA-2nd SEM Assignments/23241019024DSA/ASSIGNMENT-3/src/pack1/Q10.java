package pack1;
import java.util.*;
public class Q10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		System.out.println("Search element is: "+key);
		int a[]= {9,11,12,14,15,16,18,19};
		int result=Binarysearch(key,0,a.length-1,a);
		if(result==-1)
		{
			System.out.println("search is unsuccesfull");
		}
		else
		{
			System.out.println("search is succesfull");
		}
		sc.close();
	}

	public static int Binarysearch(int key, int i, int j, int a[]) 
	{
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(key==a[mid])
			{
				return mid;
			}
			else if(key>a[mid])
			{
				i=mid+1;
			}
			else
			{
				j=mid-1;
			}
		}
		return -1;
	
	}

}
