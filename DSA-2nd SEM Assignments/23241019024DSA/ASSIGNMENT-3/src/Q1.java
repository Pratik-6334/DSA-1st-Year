class LuckyNumberException extends Exception
{
	LuckyNumberException(String s)
	{
		super(s);
	}
}
public class Q1 
{

	public static void main(String[] args) 
	{
		int max=-100,min=100;
		int luck= (int)(Math.random()*(max-min+1))+min;
		try
		{
			if(luck<0)throw new LuckyNumberException("Bad luck");
			else
			{
				System.out.println("your lucky number is: "+luck);
				System.out.println("Good luck");
			}
		}
		catch(LuckyNumberException e)
		{
			System.out.println("your lucky number is: "+luck);	
			System.out.println(e);
		}

	}

}
