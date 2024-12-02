import java.util.Scanner;
class Product{
	int prodid,price,quantity;
	static int totalPrice;
	public Product(int pId, int p, int Q)
	{
		this.prodid=pId;
		this.price=p;
		this.quantity=Q;
		this.totalPrice += this.price;
	}
	public void display()
	{
		System.out.println(prodid+"\t\t "+price+"\t "+quantity);
	}
}
public class Q3{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter quantity of product: ");
		int n=sc.nextInt();
		Product P[]=new Product[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Product ID, price and quantity: ");
			int pid=sc.nextInt();
			int p=sc.nextInt();
			int q=sc.nextInt();
			P[i]=new Product(pid,p,q);
		}
		System.out.println("Product ID\t tprice\t quantity ");
		for(int i=0;i<n;i++)
		{
			P[i].display();
		}
		System.out.println("Total Price: "+ Product.totalPrice);
		sc.close();
	}
}