package classwork;

public class SleepThread  extends Thread{
	SleepThread(){
		start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SleepThread();
		try {
			for(int i = 1; i<=10;++i) {
				System.out.println("jj");
				System.out.println("Main Thread "+i);
				Thread.sleep(40000);
			}
			
		}catch(Exception ex) {
			System.out.println("Exception is "+ ex);
		}
	}
	public void run() {
		try {
			for (int i = 1; i< 10 ; ++i) {
				System.out.println("Child Thread "+i);
				Thread.sleep(10000);
			}
		}catch(Exception ex) {
			System.out.println("Exception is " + ex);
			
		}
		
	}

}
