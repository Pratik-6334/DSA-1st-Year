package pack1;
import java.util.*;
public class test extends student
{
  public int m1,m2;
  public void inputdetails()
  {
	  super.inputdetails();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter mark1 and mark2");
	  m1=sc.nextInt();
	  m2=sc.nextInt();
	 
  }
  public void showdetails()
  {
	  super.showdetails();
	  System.out.println(m1+" "+m2);
  }
}
