import java.util.*;

public class Q5 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int no=sc.nextInt();

 System.out.println("Sum of number untill it becomes single digit "+sumofdigits(no));
	sc.close();
	}
    public static int sumofdigits(int n)
    {
    	int sum = 0;

        while (n>0 || sum>9) 
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n% 10;
            n=n/10;
        }
        return sum;
    }
 }