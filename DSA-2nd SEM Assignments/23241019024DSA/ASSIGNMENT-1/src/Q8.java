import java.util.*;
public class Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int m=sc.nextInt();
		System.out.println("Enter the column size: ");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the array: ");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
				sum=sum+a[i][j];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" \t ");
			}
			System.out.println(" ");
		}
		System.out.println("sum of the 2D-Array is: "+sum);
        sc.close();
	}

}
