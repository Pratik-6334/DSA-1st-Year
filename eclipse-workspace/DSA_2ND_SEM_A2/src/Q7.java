interface DetailInfo{
	      void display();
	      void count();
}
class Person3 implements DetailInfo
{
	String name;
	static int maxCount;
	public Person3(String name)
	{
		this.name=name;
	}
	public void count()
	{
		maxCount=this.name.length();
	}
	public void display()
	{
		System.out.println("Name: "+name+"\nNumber of characters present in the name= "+maxCount);
	}
}
public class Q7 {
	public static void main(String[] args) {

        Person3 ob=new Person3("Pratik");
        ob.count();
        ob.display();
	}
}