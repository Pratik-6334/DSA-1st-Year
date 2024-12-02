class Deposit
{
	long p;
	int time;
	double rate;
	double Tamt;
	Deposit()
	{
		p=4000;
		time=60;
		rate=5;
	}
	Deposit(long p,int time,double rate)
	{
		this.p=p;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long p,double rate)
	{
		this.p=p;
		this.rate=rate;
		this.time=9;
	}
	Deposit(long p,int time)
	{
		this.p=p;
		this.time=time;
		this.rate=8.5;
	}
	void calcamt()
	{
		Tamt=p+(p*rate*time)/100;
		System.out.println("Total amount is: "+Tamt);
	}
	void display()
	{
		System.out.println("principal is: "+p+" rate is: "+rate+" time taken: "+time);
	}
	
}
public class Q4 
{

	public static void main(String[] args) 
	{
		Deposit d1=new Deposit();
		Deposit d2=new Deposit(10000,5,3.6);
		Deposit d3=new Deposit(10000,6);
		Deposit d4=new Deposit(10000,8.5);
        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d1.calcamt();
        d2.calcamt();
        d3.calcamt();
        d4.calcamt();
	}

}
