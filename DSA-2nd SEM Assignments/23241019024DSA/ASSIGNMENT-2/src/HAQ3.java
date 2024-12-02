import java.util.*;
class Bank
{
	String bankNname;
	double depositAmount;
	static double totalAamount=0.0;
	void setBankName(String bankNname)
	{
		this.bankNname=bankNname;
	}
	void setAmount(double depositAmount)
	{
		this.depositAmount=depositAmount;
	}
	void showData()
	{
		System.out.println("Bank Name: "+bankNname+" ,Deposited Amount: "+depositAmount);
	}
}
public class HAQ3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of banks visited: ");
		int n=sc.nextInt();
		Bank b[]=new Bank[n];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter Bank Name of Bank "+(i+1)+" is: ");
			String p=sc.next();
			double d=sc.nextDouble();
			b[i]=new Bank();
			if(d<1000)
			{
				System.out.println("Invalid deposit amount");
			}
			else
			{
				b[i].setBankName(p);
				b[i].setAmount(d);
				Bank.totalAamount=Bank.totalAamount+d;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			b[i].showData();
		}
		double min=b[0].depositAmount;
		int t=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].depositAmount<min)
			{
				min=b[i].depositAmount;
				t=i;
			}
		}
		System.out.println("Bank with min price is: ");
		b[t].showData();
		sc.close();

	}

}
