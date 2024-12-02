import java.util.Scanner;
class Per
{
	int age;
	String name;
    void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter name and age : ");
		name=sc.next();
		age=sc.nextInt();
		sc.close();
	}
    void displayData()
    {
    	System.out.println(name+" "+age);
    }
}
public class Q1 
{

	public static void main(String[] args) 
	{
		Per p1=new Per();
		Per p2=new Per();
		p1.name="Rohan";
		p1.age=20;
		p2.setData();
		p1.displayData();
		p2.displayData();
		if(p1.age<p2.age)
		{
			System.out.println(p1.name+" is younger.");
		}
		else
		{
			System.out.println(p2.name+" is younger.");
		}
	}

}
