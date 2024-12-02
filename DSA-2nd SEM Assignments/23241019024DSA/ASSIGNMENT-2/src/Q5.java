class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person
{
	int Eid;
	double salary;
	Employee(String name,int age, int Eid, double salary)
	{
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void empDisplay()
	{
		System.out.println("Name:- "+name+" , age:- "+age+" , Eid:- "+Eid+" , salary:- "+salary+"/-");
	}
}
public class Q5 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee("SAHIL SAHOO",20,234101900,500000.0);
		e1.empDisplay();

	}

}
