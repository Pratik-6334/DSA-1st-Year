public class Q5 {

	public static < E > void printArray( E[] inputArray)
	{
		for(int i=0;i<inputArray.length ;i++) {
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
       Integer arr[]= {1,2,3,4,5};
       printArray(arr);
       String s[]= {"A","B","C","D","E"};
       printArray(s);
	}
 }