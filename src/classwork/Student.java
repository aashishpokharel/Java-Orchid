package classwork;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person P = new Person(10);
		P.print();
	}

}
class Person{
	int age;
	Person(int age){
		this.age = age;
	}
	public void print() {
		System.out.println(this.age);
	}
}