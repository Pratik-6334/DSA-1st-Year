class Deposit{
	  long principal;
	  int time;
	  double rate, totalAmt;
	  
	  public Deposit()
	  {
		  this.principal = 0;
	      this.time = 0;
	      this.rate = 0.0;
	      this.totalAmt = 0.0;
	  }
	  public Deposit(long principal, int time, double rate) {

	        this.principal = principal;
	        this.time = time;
	        this.rate = rate;
	        calcAmt();
	    }
	    public Deposit(long principal, int time) {

	        this.principal = principal;
	        this.time = time;
	        this.rate=7.1; //own input
	        calcAmt();
	    }
	    public Deposit(long principal, double rate) {

	        this.principal = principal;
	        this.time=2; //own input
	        this.rate = rate;
	        calcAmt();
	    }
	    void display() {
	        System.out.println("Principal: " +principal);
	        System.out.println("Time: " + time + " years");
	        System.out.println("Rate: " + rate + "%");
	        System.out.println("Total Amount: " +totalAmt);
	    }
	    void calcAmt() {
	        this.totalAmt = principal+(principal * rate * time)/100;
	    }
}
public class Q4 {

	public static void main(String[] args) {
	   Deposit deposit1 = new Deposit(10000, 5,7.1);
       Deposit deposit2 = new Deposit(20000, 2);
       Deposit deposit3 = new Deposit(5000,5.3);

       System.out.println("Deposit 1:");
       deposit1.display();

       System.out.println("\nDeposit 2:");
       deposit2.display();

       System.out.println("\nDeposit 3:");
       deposit3.display();
	}
}