abstract class Marks{

	  int markICP,markDSA;
	  double percentage;
	  public Marks(int ICP,int DSA)
	  {
		  this.markICP=ICP;
		  this.markDSA=DSA;
	  }
	  abstract void getPercentage();
}
class CSE extends Marks{
	int algoDesign;
	CSE(int ICP,int DSA,int algoDesign)
	{
		super(ICP,DSA);
		this.algoDesign=algoDesign;
	}
		public void getPercentage()
		{
		percentage=(markICP+markDSA+algoDesign)/3.0;
		System.out.println("CSE student percentage: "+percentage);
		}
	}
class NonCSE extends Marks
{
	int enggMechanics;
	public NonCSE(int ICP,int DSA,int enggMechanics)
	{
		super(ICP,DSA);
		this.enggMechanics=enggMechanics;
   }
	public void getPercentage()
	{
	percentage=(markICP+markDSA+enggMechanics)/3.0;
	System.out.println("Non CSE student percentage: "+percentage);
	}
}
public class Q6 {
	
	public static void main(String[] args) {
        CSE S1=new CSE(84,65,70); S1.getPercentage();
        NonCSE S2=new NonCSE(87,56,78); S2.getPercentage();
	}
}