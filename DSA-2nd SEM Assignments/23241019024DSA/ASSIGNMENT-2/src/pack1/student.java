package pack1;
import java.util.*;
public class student 
{
  String name;
  int roll;
  public void inputdetails()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter name and Roll no. ");
	  name=sc.next();
	  roll=sc.nextInt();
	  
  }
  public void showdetails()
  {
	  System.out.println(name+""+roll);
  }
}
