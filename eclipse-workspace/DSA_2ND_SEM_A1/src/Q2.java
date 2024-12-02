import java.util.Scanner;

public class Q2 {
   public Q2() {}

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Weight in kg: ");
      double w = sc.nextDouble();
      System.out.println("Enter the Height in m: ");
      double h = sc.nextDouble();
      double Bmi = w / (h * h);
      if (Bmi < 18.5) {
         System.out.println("Underweight");
      } else if (Bmi >= 18.5 && Bmi <= 24.9) {
         System.out.println("Normal Weight");
      } else if (Bmi > 24.9 && Bmi <= 29.9) {
         System.out.println("overweight");
      } else {
         System.out.println("obesse");
      }

      sc.close();
   }
}
