package classwork;

import java.util.Scanner;

public class CS_Ticket {
	public static void main(String[] args) {
		//Entry Function
		BookTicket tb = new BookTicket();
		tb.ticketInput();
		tb.calculateCost();
		tb.printResult();
		
}
	

}
class BookTicket{
	int goldCount, silverCount, goldPrice = 200, silverPrice = 150;
	double totalAmount;
	public void ticketInput() {
		/* Method to get input from the user
		 * Parameters : None
		 * Returns: None */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of gold ticket:");
		this.goldCount = s.nextInt();	
		System.out.println("Enter the no of silver ticket:");
		this.silverCount = s.nextInt();	
		s.close();	
	}
	public void calculateCost() {
		/* Method to calculate the amount
		 * Parameters : None
		 * Returns : None
		 *  */
		this.totalAmount = 1.0 * ((this.goldCount * this.goldPrice) + (this.silverCount * this.silverPrice));
	}
	
	public void printResult() {
		/* Method to print the result
		 * Parameters : None
		 * Returns : None
		 *  */
		System.out.println("\nGold ticket(s):"+ this.goldCount + 
							"\nSilver Ticket(s)" + this.silverCount + 
							"\nTotal Cost:" + this.totalAmount);	
}
}