import java. util.*;

public class Q7 {

	public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of elements of array ");
       int n=sc.nextInt();
       int arr[]=new int[n];

       for(int i=0 ;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       System.out.print("Elemts of the array:");

       for(int i=0 ;i<n;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
       
       int max,min,c1=0,c2=0,p1=0,p2=0;
       max=arr[0];
       min=arr[0];
       for(int i=1;i<n;i++)
       {
    	   if(arr[i]>max)
    	   {
    		   max=arr[i];
    	   }
    	   else if(arr[i]<min)
    	   {
    		   min=arr[i];
    	   }
       }
       for(int i=0;i<n;i++)
       {
    	   if(max==arr[i])
    	   {   
    		   c1++;
    	       if(c1==1)
    	       {
    	    	   p1=i+1;
    	    	   }
    	   }
    	   else if(min==arr[i])
    	   { 
    		   c2++;
    		   p2=i+1;
    	   }
       }
       System.out.println("\nMaxmimum element "+max+" occurs "+c1+" times \nMin element " +min+" occurs "+c2+" times");
       System.out.println("First occurrence of maximum element is at position "+p1+" \nLast occurrence of minimum element is at position "+p2);
       sc.close();
       }
}