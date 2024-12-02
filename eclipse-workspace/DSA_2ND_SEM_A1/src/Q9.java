import java.util.*;

public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[4][4];
        System.out.println("Enter the elements of the 4-by-4 matrix:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        double diagonalSum = sumMajorDiagonal(matrix);
        // Display the matrix and the diagonal sum
        System.out.println("\nThe elements of the 4-by-4 matrix are:");
        printMatrix(matrix);
        System.out.println("\nThe sum of the major diagonal elements is: " + diagonalSum);
        sc.close();
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i <m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
    public static void printMatrix(double[][] m) {
    	System.out.println("The Matrix is :");
        for(int i=0;i<m.length;i++) 
        {
        	for(int j=0;j<m.length;j++)
        	{
        		System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}