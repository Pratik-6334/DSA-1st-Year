import java.util.Scanner;

public class Q1 {
	
   public Q1() {}

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n = sc.nextInt();
      int count = 0;

      for(int t = n; t > 2; ++count) {
         t /= 2;
      }
      System.out.println("Number of times: " + count);
      sc.close();
   }
}
