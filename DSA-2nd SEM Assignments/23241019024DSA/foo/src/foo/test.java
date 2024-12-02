package foo;

public class test {

	public static void main(String[] args) 
	{
		int n=5768;
		rev(n);

	}

	private static void rev(int n) 
	{
		int t=n;
		if(t==0) 
		{
		  	return;
		}
		else
		{
		  System.out.print(n%10);
		  rev(n/10);
		}
		
	}

}
