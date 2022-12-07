package classwork;

public class DerivedConstructor {
	public static void main(String[] args) {	
		Derived d = new Derived();
		d.displayX();
	}
}
class Base{
	public int x = 220;
	public Base(){
		System.out.println("Base");	
	}
	public void displayX() {
		System.out.println("X is " + x);
	}
}
class Derived extends Base{
	public Derived() {
		System.out.println("Derived");
	}	
}