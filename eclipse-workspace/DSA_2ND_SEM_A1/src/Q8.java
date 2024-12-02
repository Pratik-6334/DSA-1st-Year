import java.util.*;
public class Q8 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of row of 2D array: ");
        int rows =sc.nextInt();
        System.out.print("Enter no of & columns of 2D array: ");
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        for(int i=0;i<rows;i++) 
        {
        	for(int j=0;j<columns;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}	
        }
        System.out.println("The 2D array is:");
        for(int i=0;i<rows;i++) 
        {
        	for(int j=0;j<columns;j++)
        	{
        		System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                sum += arr[i][j];
            }
        }
        System.out.println("\nThe sum of elements of the 2D array is " + sum);
        sc.close();
    }
}