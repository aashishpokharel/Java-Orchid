package classwork;
import java.util.ArrayList;

public class ArrayListP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("JOHN");
		a1.add("1");
		a1.add("Bhul Bhulaiya");
		System.out.println(a1); 
		
		for(String str: a1) {
			System.out.println("Welcome" + str);
		}
		System.out.println("Size is "+a1.size());
		a1.remove("1");
		
//		set and get <store data in custom position>
		a1.set(0, "My name is Khan");
		System.out.println("Item at 1 : "+ a1.get(0)+ " Size is:"+ a1.size());
	}

}

