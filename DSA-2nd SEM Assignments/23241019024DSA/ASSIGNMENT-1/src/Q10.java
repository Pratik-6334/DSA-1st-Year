import java.util.Scanner;
public class Q10 
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
		int columnIndex=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		double res=sumColumn(a[][],columnIndex);
		System.out.println(res);
	}
	public static double sumColumn(double a[][], int columnIndex)
	{
		
	}

}
