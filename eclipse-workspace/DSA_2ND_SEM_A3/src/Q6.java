public class Q6 {

	public static void main(String[] args) {

      Integer arr[]= {1,2,3,4,1,1,1};
      Integer i=1; 
      System.out.println("Occurrence of "+i+" is "+count(arr,i)+" times");
	}
	public static <T>int count(T[] array, T item)
	{
		int c=0;
		System.out.print("[");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==item)
			{
				c++;
			}
			System.out.print(array[i]+" ");
			}
		System.out.println("]");
		return c;
	}
}