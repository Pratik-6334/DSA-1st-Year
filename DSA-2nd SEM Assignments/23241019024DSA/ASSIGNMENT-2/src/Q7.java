interface DetailInfo
{
	void Display();
	int count();
}
class Person1 implements DetailInfo 
{
	static int maxcount=0;
	String name;
	Person1(String name)
	{
		this.name=name;
	}
	public void Display() 
	{
		System.out.println("Name:- "+name+", count is:- "+name.length());	
	}
	public int count() 
	{
		return name.length();	
	}
	
}
public class Q7 
{
   public static void main(String[] args)
   {
	   Person1 p1=new Person1("Alok");
	   Person1 p2=new Person1("Anirudha");
	   Person1 p3=new Person1("Anamika");
	   p1.Display();
	   p2.Display();
	   p3.Display();
	   if(p1.count()>Person1.maxcount)
	   {
		   Person1.maxcount=p1.count();
	   }
	   if(p2.count()>Person1.maxcount)
	   {
		   Person1.maxcount=p2.count();
	   }
	   if(p3.count()>Person1.maxcount)
	   {
		   Person1.maxcount=p3.count();
	   }
	   System.out.println("maxcount:- "+Person1.maxcount);
   }
}
