import java.util.Scanner;
class Complex
{
	int real;
	int imag;
	void setdata(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	void Display()
	{
		System.out.println(real+" + "+imag+"i");
	}
    Complex add(Complex t1,Complex t2)
	{
		Complex t3=new Complex();
		t3.real=t1.real+t2.real;
		t3.imag=t1.imag+t2.imag;
		return t3;
	}
}
public class Q2 {

	public static void main(String[] args) 
	{
		Complex c1=new Complex();
		Complex c2=new Complex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of m,n,x and y where m and n are real and imag of first complex number and x and y are of complex number 2");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		c1.setdata(m, n);
		c2.setdata(x, y);
		c1.Display();
		c2.Display();
		Complex c3=new Complex();
		c3=c3.add(c1,c2);
		System.out.println("-------(+)");
		c3.Display();
        sc.close();
	}

}
