import java.util.*;
class node
{
	int info;
	node next;
}
public class SINGLELINKEDLIST 
{
    static node start=null;
    public static void create()
    {
    	Scanner sc=new Scanner(System.in);
    	node p=new node();
    	System.out.println("enter info: ");
    	p.info=sc.nextInt();
    	p.next=null;
    	start=p;
    	node q=p;
    	System.out.println("do you want to create more nodes:(y/n)");
    	char choice=sc.next().charAt(0);
    	while(choice!='N')
    	{
    		p=new node();
        	System.out.println("enter info: ");
        	p.info=sc.nextInt();
        	p.next=null;
        	q.next=p;
        	q=p;
        	System.out.println("y/n");
        	choice=sc.next().charAt(0);
    	}
    }
    public static void display()
    {
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
    	p.next=start;
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
    		start=p;
    	}
    	else
    	{
    		node t=new node();
    		while(t.next!=null)
    		{
    			t=t.next;
    		}
    		t.next=p;
    	}
    }
    public static void InsAnyPos()
    {
    	Scanner sc=new Scanner(System.in);
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
    			t.next=p;
    		}
    	}
    }
    public static void Delbeg()
    {
    	if(start==null)
    	{
    		System.out.println("LL is empty. ");
    	}
    	else
    	{
    		node t=start;
    		start=t.next;
    		t.next=null;
    		System.out.println("Deleted node is: "+t.info);
    	}
    }
    public static void Delend()
    {
    	if(start==null)
    	{
    		System.out.println("LL is empty. ");
    	}
    	else if(start.next==null)
    	{
    		System.out.println("deleted node: "+start.info);
    		start=null;
    	}
    	else
    	{
    		node t=start;
    		while(t.next.next!=null)
    		{
    			t=t.next;
    		}
    		System.out.println("Deleted node is: "+t.info);
    		t.next=null;
    	}
    }
    public static void DelAnyPos()
    {
    	if(start==null)
    	{
    		System.out.println("LL is empty.");
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
        			t.next=null;
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
			System.out.println("6:Counting");
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
