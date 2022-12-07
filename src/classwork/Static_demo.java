package classwork;

public class Static_demo {
	
	static int x = 230;
	public static void DisplayMessage() {
		System.out.println("In the DISPLAY-STATIC");
	}
	static {
		System.out.println("In static section");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_demo.DisplayMessage();
	}

}

