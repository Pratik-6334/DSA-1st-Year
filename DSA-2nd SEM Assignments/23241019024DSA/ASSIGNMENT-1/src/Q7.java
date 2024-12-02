import java.util.*;
public class Q7 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0],min=a[0];
		int count=0,ccount=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
			else if(a[i]<=min)
			{
				min=a[i];
				ccount++;
			}
		}
		System.out.println("MAXIMUM ELEMENT OF ARRAY IS "+max+" AND OCCURS "+ccount+" times");
		System.out.println("MINIMUM ELEMENT OF ARRAY IS "+min+" AND OCCURS "+count+" times");
		System.out.println(max+""+min);
        sc.close();
	}

}
