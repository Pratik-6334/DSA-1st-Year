package P1;
import java.util.Scanner;
class node
{
	node prev;
	int info;
	node next;
}
public class DOUBLELINKEDLIST 
{
    static node start=null;
    static node end=null;
    public static void create()
    {
    	Scanner sc=new Scanner(System.in);
    	node p=new node();
    	System.out.println("enter info");
    	p.info=sc.nextInt();
    	p.next=null;
    	p.prev=null;
    	start=p;
    	end=p;
    	System.out.println("do you want to create more node:y/n");
    	char choice=sc.next().charAt(0);
    	while(choice!='n')
    	{
    		p=new node();
    		System.out.println("enter info");
    		p.info=sc.nextInt();
        	p.next=null;
        	end.next=p;
        	p.prev=end;
        	end=p;
        	System.out.println("do you want to create more node:y/n");
        	choice=sc.next().charAt(0);
    	}
    	
    }
    public static void display()
    {
    	if(end==null)
    	{
    		System.out.println("dll is empty");
    	}
    	else
    	{
    		node q=end;
    		while(q!=null)
    		{
    			System.out.println(q.info+" ");
    			q=q.prev;
    		}
    	}
    	if(start==null)
    	{
    		System.out.println("ll is empty");
    	}
    	else
    	{
    		node p=start;
    		while(p!=null)
    		{
    			System.out.print(p.info+"---->");
    			p=p.next;
    		}
    	}
    }
    public static void Insbeg()
    {
    	Scanner sc=new Scanner(System.in);
    	node p=new node();
    	System.out.println("enter info");
    	p.info=sc.nextInt();
    	p.prev=null;
    	p.next=start;
    	start.prev=p;
    	start=p;
    }
    public static int InsCountNodes()
    {
    	int count=0;
    	node p=start;
    	while(p!=null)
    	{
    		count++;
    		p=p.next;
    	}
    	return count;
    }
    public static void Insend()
    {
    	Scanner sc=new Scanner(System.in);
    	node p=new node();
    	System.out.println("enter info");
    	p.info=sc.nextInt();
    	p.next=null;
    	if(start==null)
    	{
    		p.prev=null;
    		start=p;
    		end=p;
    	}
    	else
    	{
    		p.prev=end;
    		end.next=p;
    		end=p;
    	}
    }
    public static void InsAnyPos()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter position: ");
    	int pos=sc.nextInt();
    	int count=InsCountNodes();
    	if(pos>(count+1))
    	{
    		System.out.println("insertion not possible ");
    	}
    	else
    	{
    		if(pos==1)
    		{
    			Insbeg();
    		}
    		else if(pos==(count+1))
    		{
    			Insend();
    		}
    		else
    		{
    			node p=new node();
    			System.out.println("enter info");
    			p.info=sc.nextInt();
    			node t=start;
    			for(int i=1;i<=(pos-2);i++)
    			{
    				t=t.next;
    			}
    			p.next=t.next;
    			t.next.prev=p;
    			p.prev=t;
    			t.next=p;
    		}
    	}
    }
    public static void Delbeg()
    {
    	if(start==null)
    	{
    		System.out.println("DLL is empty. ");
    	}
    	else if(start.next==null)
    	{
    		System.out.println("deleted node: "+start.info);
    		start=null;
    		end=null;
    	}
    	else
    	{
    		node t=start;
    		t.next.prev=null;
    		start=t.next;
    		t.next=null;
    		System.out.println("Deleted node is: "+t.info);
    	}
    }
    public static void Delend()
    {
    	if(end==null)
    	{
    		System.out.println("DLL is empty. ");
    	}
    	else if(start.next==null)
    	{
    		System.out.println("deleted node: "+start.info);
    		start=null;
    		end=null;
    	}
    	else
    	{
    		node t=end;
    		t.prev.next=null;
    		end=t.prev;
    		t.prev=null;
    		System.out.println("Deleted node is: "+t.info);
    	}
    }
    public static void DelAnyPos()
    {
    	if(start==null)
    	{
    		System.out.println("DLL is empty.");
    	}
    	else 
    	{
    		Scanner sc=new Scanner(System.in);
        	System.out.println("enter position: ");
        	int pos=sc.nextInt();
        	int count=InsCountNodes();
        	if(pos>count)
        	{
        		System.out.println("Deletion not possible ");
        	}
        	else
        	{
        		if(pos==1)
        		{
        			Delbeg();
        		}
        		else if(pos==count)
        		{
        			Delend();
        		}
        		else
        		{
        			node q=start;
        			for(int i=1;i<=(pos-2);i++)
        			{
        				q=q.next;
        			}
        			node t=q.next;
        			q.next=t.next;
        			t.next.prev=q;
        			t.next=null;
        			t.prev=null;
        			System.out.println("Deleted node: "+t.info);
        		}
        	}
    	}
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("****menu****");
			System.out.println("0:Exit");
			System.out.println("1:Creation");
			System.out.println("2:Display");
			System.out.println("3:Insbeg");
			System.out.println("4:Insend");
			System.out.println("5:InsAnyPos");
			System.out.println("7:Delbeg");
			System.out.println("8:Delend");
			System.out.println("9:DelAnyPos");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				Insbeg();
				break;
			case 4:
				Insend();
				break;
			case 5:
				InsAnyPos();
				break;
			case 6:
				int t=InsCountNodes();
				System.out.println("count is: "+t);
				break;
			case 7:
				Delbeg();
				break;
			case 8:
				Delend();
				break;
			case 9:
				DelAnyPos();
				break;
			default:
				System.out.println("Wrong choice");
			}	
			
		}
	}

}
