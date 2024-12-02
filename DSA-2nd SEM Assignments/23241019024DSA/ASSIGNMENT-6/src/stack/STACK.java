package stack;

import java.util.Scanner;

public class STACK 
{
	public static final int Maxsize=5;
	public static int top=-1;
	public static int S[]=new int[Maxsize];
	public static void push()
	{
		if(top==(Maxsize-1))
		{
			System.out.println("Overflow");	
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the element: ");
			int ele=sc.nextInt();
			top=top+1;
			S[top]=ele;
		}
	}
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("underflow");
		}
		else
		{
			int ele=S[top];
			System.out.println("popped element is: "+ele);
			top=top-1;
		}
	}
	public static void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.print(S[i]+" ");
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
