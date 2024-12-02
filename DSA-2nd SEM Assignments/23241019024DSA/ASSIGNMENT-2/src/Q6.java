abstract class Marks
{
	double MarkIcp;
	double MarkDsa;
	double Percentage;
	Marks(double MarkIcp,double MarkDsa)
	{
		this.MarkIcp=MarkIcp;
		this.MarkDsa=MarkDsa;
	}
	abstract double getPercentage();
}
class CSE extends Marks
{
	double algodesign;
	CSE(double MarkIcp,double MarkDsa,double algodesign)
	{
		super(MarkIcp,MarkDsa);
		this.algodesign=algodesign;
	}
	double getPercentage()
	{
		Percentage=((MarkIcp+MarkDsa+algodesign)/300)*100;
		return Percentage;
	}
}
class NonCSE extends Marks
{
	double Enggdesign;
	NonCSE(double MarkIcp,double MarkDsa,double Enggdesign)
	{
		super(MarkIcp,MarkDsa);
		this.Enggdesign=Enggdesign;
	}
	double getPercentage()
	{
		Percentage=((MarkIcp+MarkDsa+Enggdesign)/300)*100;
		return Percentage;
	}
}
public class Q6 
{

	public static void main(String[] args) 
	{
		CSE c1=new CSE(75.5,86.6,94.6);
		NonCSE n1=new NonCSE(78.5,42.45,94.1);
        System.out.println("poorvi got "+c1.getPercentage());
        System.out.println("janvi got "+n1.getPercentage());
	}

}
