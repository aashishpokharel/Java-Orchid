package classwork;

public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bases d = new Deriveds();
		d.displayX();
	}
}


class Bases{
	public int x = 220;
	public Bases(){
		System.out.println("Base");	
	}
	public void displayX() {
		System.out.println("X is " + x);
	}
}
class Deriveds extends Bases{
	public Deriveds() {
		System.out.println("Derived");
	}	
	public void displayX() {
		System.out.println("X from derived " + x );
	}
}

