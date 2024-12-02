import pack1.*;
import pack2.*;
public class Q8 
{

	public static void main(String[] args) 
	{
		test tobj=new test();
		tobj.inputdetails();
		tobj.showdetails();
		int gtotal=tobj.m1+tobj.m2+Sports.score1+Sports.score2;
		System.out.println("Grand total= "+gtotal);

	}

}
