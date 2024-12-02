import java.util.*;

class prsn{
	  String name;
	  int age;
	  public prsn(String name,int age) {
		  this.name=name;
		  this.age=age;
	  }
}
class Employee extends prsn{
	  int Eid;
	  double salary;
	  public Employee(String name,int age,int Eid,double salary) {
		  super(name,age);
		  this.Eid=Eid;
		  this.salary=salary;
	  }
      public void empDisplay() {
           System.out.println("Employee ID: " + this.Eid);
           System.out.println("Name: " + this.name);
           System.out.println("Age: " + this.age);
           System.out.println("Salary: " + this.salary);
      }
}
public class Q5 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Employee Id: ");
		int eid=sc.nextInt();
		System.out.println("Enter Name: ");
		String Name=sc.next();
		System.out.println("Enter Age: ");
		int Age=sc.nextInt();
		System.out.println("Enter Salary: ");
		double Salary=sc.nextDouble();
		
		Employee ob=new Employee(Name,Age,eid,Salary);
		ob.empDisplay();
		sc.close();
	}
}