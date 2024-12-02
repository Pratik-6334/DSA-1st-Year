import java.util.Scanner;
class Commission
{
	double sales;
	Commission(double sales)
	{
		this.sales=sales;
	}
	double getCommission()
	{
		if(sales<100)
		{
			return(0.02*sales);
		}
		else if(sales>=100&&sales<5000)
		{
			return(0.05*sales);
		}
		else
		{
			return(0.08*sales);
		}
	}
}
public class Demo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sales: ");
		double sales=sc.nextInt();
		if(sales<0.0)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			Commission c1=new Commission(sales);
			double com=c1.getCommission();
			System.out.println("Commission for sales "+sales+" = "+com);
		}
		sc.close();
	}
}
