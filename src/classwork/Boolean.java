package classwork;

class Boolean {

// Main driver method
	public static void main(String args[])
	{
		boolean b1 = true, b2= false;
		if(b1 == true) {
			System.out.println("b1 is true");
		}else {
			System.out.println("B1 is false");
		}
		if(b1 == true && b2 == true) {
			System.out.println("both b1  & b2 are true");
		}else {
			System.out.println("One of b1 and b2 is false");
		}
	}
}
