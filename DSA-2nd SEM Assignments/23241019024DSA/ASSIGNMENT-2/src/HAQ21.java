import java.util.Scanner;
class Book1
{
		String BName;
		int BEdition;
		double BPrice;
		Book1(String BName,int BEdition,double BPrice)
		{
			this.BEdition=BEdition;
			this.BName=BName;
			this.BPrice=BPrice;
		}
		void display()
		{
			System.out.println("Book Name: "+BName+" ,Book Edition: "+BEdition+" ,Book price: "+BPrice+"/-");
		}
		
}
public class HAQ21
{

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no. of books choosen: ");
			int n=sc.nextInt();
			Book1 b[]=new Book1[n];
			for(int i=0;i<b.length;i++)
			{
				System.out.println("Enter Details of Book "+(i+1)+" is ");
				int Edition=sc.nextInt();
				String Name=sc.next();
				double Price=sc.nextDouble();
				b[i]=new Book1(Name,Edition,Price);
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



