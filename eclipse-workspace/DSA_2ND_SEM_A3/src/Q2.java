public class Q2 {

	   public void insert(String colour[])throws ArrayIndexOutOfBoundsException
	   {
		   colour[colour.length]="Black";
	   }
       public void display(String colour[])
       {
    	   System.out.println("Selected colours are:");

    	   for(int i=0;i<colour.length;i++)
           {
           	System.out.print(colour[i]+", ");
           }
       }
       public void StringToInt(String colour[])
       {
    	   throw new NumberFormatException("Cannot convert String to int ");
       }
	public static void main(String[] args) {

        String colour[]={"Red","Blue","Yellow","Green"};
        Q2 ob=new Q2();
        ob.display(colour);
        
        try
        {
            ob.insert(colour);
        }
        catch(Exception e)
        {
        	System.out.println("\nError "+e);
        }
        try
        {
        	ob.StringToInt(colour);	
        }
        catch(Exception e)
        {
        	System.out.println("\nError "+e);
        }
    }
}