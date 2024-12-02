import java.util.Scanner;
public class Q9 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int m=sc.nextInt();
		System.out.println("Enter the column size: ");
		int n=sc.nextInt();
		Double[][] a=new Double[m][n];
		System.out.println("Enter the array: ");
		double sum1=0,sum2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextDouble();
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			   if(i==j)
			   {
				   sum1=sum1+a[i][j];
			   }
			   else if(i!=j&&(i+j)%(a.length-1)==0)
			   {
				   sum2=sum2+a[i][j];
			   }
			}
		}
		if(sum1>sum2)
		{
			System.out.println("sum of the major diagonal is: "+sum1);
		}
		else
		{
			System.out.println("sum of the major diagonal is: "+sum2);
		}
        sc.close();
	}

}
