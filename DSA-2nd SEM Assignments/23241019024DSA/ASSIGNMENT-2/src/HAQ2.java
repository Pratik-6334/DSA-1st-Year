import java.util.Scanner;
class Book
{
	String BName;
	int BEdition;
	double BPrice;
	void display()
	{
		System.out.println("Book Name: "+BName+" ,Book Edition: "+BEdition+" ,Book price: "+BPrice+"/-");
	}
	
}
public class HAQ2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of books choosen: ");
		int n=sc.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter Details of Book "+(i+1)+" is ");
			b[i].BEdition=sc.nextInt();
			b[i].BName=sc.next();
			b[i].BPrice=sc.nextDouble();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i].display();
		}
		double max=b[0].BPrice;
		int t=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i].BPrice>max)
			{
				max=b[i].BPrice;
				t=i;
			}
		}
		System.out.println("Book with max price is: ");
		b[t].display();
		sc.close();
	}

}
