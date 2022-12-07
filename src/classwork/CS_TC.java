package classwork;
import java.util.Scanner;
public class CS_TC {
	public static void main(String[] args) {
//		Entry Function
		TicketBook tb = new TicketBook();
		int ticket = tb.getInput();
		double amount = tb.totalAmountCalculator();
		System.out.println("\nNo. of Tickets:" + ticket + "\n Cost : " +amount );
}
}

class TicketBook{
	int ticketCount, ticketCost = 400;
	double totalAmount;
	public int getInput() {
		/* Method to get input from the user
		 * Parameters : Void
		 * Returns: ticketCount - no of tickets */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of ticket:");
		this.ticketCount = s.nextInt();	
		s.close();
		return this.ticketCount;
	}
	public double totalAmountCalculator() {
		/* Method to calculate the amount
		 * Parameters : None
		 * Returns : Total amount
		 *  */
		if(this.ticketCount > 10) {
			this.totalAmount = 0.9 * (this.ticketCost * this.ticketCount);
		}else {
			this.totalAmount = (this.ticketCost * this.ticketCount);
		}
		return this.totalAmount;
	}
}