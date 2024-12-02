import java.util.Scanner;
class Product
{
	int prodId;
	double price;
	int quantity;
	static double Tprice=0.0;
	Product(int prodId,double price,int quantity)
	{
		this.prodId=prodId;
		this.price=price;
		this.quantity=quantity;
	}
	void display()
	{
		System.out.println("prodId: "+prodId+" ,price: "+price+"/- ,quantity: "+quantity);
	}
}
public class Q3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Total no. of product is: ");
		int n=sc.nextInt();
		Product p[]=new Product[n];
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter product details for product: "+(i+1));
			int pi=sc.nextInt();
			double p1=sc.nextDouble();
			int q=sc.nextInt();
			p[i]=new Product(pi,p1,q);
		}
		for(int i=0;i<p.length;i++)
		{
			p[i].display();
		}
		for(int i=0;i<p.length;i++)
		{
			double temp=p[i].price*p[i].quantity;
			Product.Tprice=Product.Tprice+temp;
		}
		System.out.println("Total price is: "+Product.Tprice);
        sc.close();
	}

}
