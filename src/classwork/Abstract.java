package classwork;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Shape{
	String color;
	public void getArea() {
		
	}
}

class Circle extends Shape{
	int length, breadth;
	double area;
	public Circle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public void getArea() {
		this.area = this.length * this.breadth;
		System.out.println("Area" + this.area);
	}
}