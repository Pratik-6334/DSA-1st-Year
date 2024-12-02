import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter the elements of the 3-by-4 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nThe elements of the 3-by-4 matrix are:");
        printMatrix(matrix);
        System.out.println("Enter the column you want sum :");
        int col=sc.nextInt();
        System.out.println("Sum of Column "+col+" is : "+sumColumn(matrix,col-1));
        // Calculate and display the sum of each column
        for (int j = 1; j <=4; j++) {
            double columnSum = sumColumn(matrix,j-1);
            System.out.println("Sum of column " + j + ": " + columnSum);
        }
        sc.close();
    }

    // Method to compute the sum of a specified column
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void printMatrix(double[][] m) {
    	System.out.println("The Matrix is :");
        for(int i=0;i<3;i++) 
        {
        	for(int j=0;j<4;j++)
        	{
        		System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}