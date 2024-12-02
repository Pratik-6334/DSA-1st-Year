import java.util.*;
class MarkOutOfBoundsException extends Exception
{
	MarkOutOfBoundsException(String s)
	{
		super(s);
	}
}
class student
{
	int mark;
	String Sname;
	student(int mark,String Sname)
	{
		this.mark=mark;
		this.Sname=Sname;
	}
	void display()
	{
		System.out.println("Name of the student: "+Sname+" , marks obtained: "+mark);
	}
}
public class Q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NAME AND MARKS OF THE STUDENT: ");
		String name=sc.next();
		int m=sc.nextInt();
		try 
		{
		  if(m>100)throw new MarkOutOfBoundsException("Try again");
		  else
		  {
			 student s1=new student(m,name);
		     s1.display();
		  }  
		}
		catch(MarkOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		sc.close();
	}

}
