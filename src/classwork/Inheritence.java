package classwork;
//import java.util.Scanner;
import java.io.*; // better compared to <Scanner>: which is a utility

public class Inheritence {

	public static void main(String[] args) throws IOException {
		PhysicalInfo p = new PhysicalInfo();
		p.getInfo();
		p.printInfo();
	}

}

class StudentInfo{
	int regNo;
	String name;
}

class AcademicInfo extends StudentInfo{
	String stream, level;
}

class PhysicalInfo extends AcademicInfo{
	double height, weight;
	
	public void getInfo() throws IOException{
		this.name = "Aashish";
		this.regNo = 20786;
		this.stream = "CSIT";
		this.level = "Fourth Year";
		//	Scanner s = new Scanner(System.in);
		//	System.out.println("Enter height:");
		//	this.height = s.nextDouble();	
		//	System.out.println("Enter weight:");
		//	this.weight = s.nextDouble();	
		//	s.close();
		InputStreamReader input 	= new InputStreamReader(System.in);
		BufferedReader br 			= new BufferedReader(input);
		System.out.println("Enter height:");
		this.height = Double.parseDouble(br.readLine());	
		System.out.println("Enter weight:");
		this.weight = Double.parseDouble(br.readLine());
	}
	public void printInfo() {
		
		System.out.println("Name:"+ this.name);
		System.out.println("Height(<Foot>.<Inch>): " + height + "\nWeight: "+ weight);
		
	}
}