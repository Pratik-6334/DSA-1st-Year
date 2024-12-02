import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
        String s[]=new String[m];
        try
        {
        	for(int i=0;i<s.length;i++)
        	{
        	  s[n]=sc.next();
        	}
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
        

        
     
	}

}
