package classwork;

public class AreaOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindArea A = new  FindArea();
		System.out.println("The area of rectangle is " + A.area(2,2));
		System.out.println("The area of circle is " + A.area(2));
		System.out.println("The area of triangle is " + A.area(2.0,3));

	}
}

class FindArea{
	
	public double area(double radius) {
		double area_c = 3.14 * (radius * radius);
		return area_c;
	}
	public int area(int length, int breadth) {
		int area_rect = (breadth * length);
		return area_rect;
	}
	public double area(double height, double length) {
		double area_rect = 0.5 * (height * length);
		return area_rect;
	}
	
	
	
	
	
}