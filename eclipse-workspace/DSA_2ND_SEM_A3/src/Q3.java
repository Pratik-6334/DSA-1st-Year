import java.util.Scanner;

class Student{
	  int marks; String name;
	  
	  public Student(int marks,String name)throws Exception
	  {
		  this.marks=marks;
		  this.name=name;

		  if(marks<0 || marks>100)
		  {
			  throw new MarksOutOfBoundsException("Invalid Marks");
		  }
		  else{this.marks=marks;}
	  }
	  public void display()
	  {
		  System.out.println("Your name: "+this.name+"\tYour marks: "+this.marks);
	  }
}
	  class MarksOutOfBoundsException extends Exception
	  {
		  public MarksOutOfBoundsException(String str)
		  {
			  super(str);
		  }
      }
public class Q3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Your name: ");
		String s=sc.next();
		System.out.print("Enter marks: ");
		int m=sc.nextInt();

		try
		{
			Student S=new Student(m,s);
			S.display();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
			sc.close();
		}
	}
}