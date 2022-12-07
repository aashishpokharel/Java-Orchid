package classwork;

public class Interface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NMB user = new NMB(20000.0);
		boolean withdraw_status = user.Withdraw(122000000.0);
		if(withdraw_status == true) {
			System.out.println("Successful Withdraw");
		}else {
			System.out.println("UnSuccessful Withdraw");
		}
		boolean deposit_status = user.Deposit(1000);
		if(deposit_status == true) {
			System.out.println("Successful Deposit");
		}else {
			System.out.println("UNSuccessful Deposit");
		}
	}
}

interface Bank{
	public boolean Withdraw(double amount);
	public boolean Deposit(double amount);
}

class NMB implements Bank{
	double balance;
	
	@Override
	public boolean Withdraw(double amount) {
		if(amount > this.balance) {
//			System.out.println("Insufficient");
			return false;
		}
		this.balance -= amount;
//		System.out.println("Withdraw successful");
		return true;
	}
	
	@Override
	public boolean Deposit(double amount) {
		this.balance += amount;
		return true;
		
	}
	public NMB(double balance) {
		this.balance = balance;
	}
}