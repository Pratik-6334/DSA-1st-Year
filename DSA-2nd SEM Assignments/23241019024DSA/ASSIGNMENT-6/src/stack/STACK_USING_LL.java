package stack;
import java.util.Scanner;
class node
{
	int info;
	node next;
}
public class STACK_USING_LL 
{
	public static node top=null;
	public static void push()
	{
		node p=new node();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter info ");
		p.info=sc.nextInt();
		p.next=top;
		top=p;
	}
	public static void pop()
	{
		if(top==null)
		{
			System.out.println("underflow");
		}
		else
		{
			node p=top;
			top=top.next;
			p.next=null;
			System.out.println("Deleted node: "+p.info);
		}
	}
	public static void display()
	{
		if(top==null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			node q=top;
			while(q!=null)
			{
				System.out.print(q.info+" ");
				q=q.next;
			}
		}
	}
	public static void main(String[] args) 
	{	
		while(true)
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("****menu****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:pop");
			System.out.println("3:Display");
			System.out.println("Enter the choice");
			int choice=ob.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
		
	}

}
