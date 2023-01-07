package classwork;

import java.io.*;
//import java.io.InputStreamReader;

public class SearchData {
	public static void main(String [] args) throws IOException{
//This program uses function overloading for displaying the data entered by user and searching the user //for providing details
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		int [] employeeId = new int[5] ;
		double [] salary = new double[5];
		String [] name = new String[5];
		String search_name = new String();
		int i;
		for( i =0; i<5; i++) {
			System.out.println("Enter "+(i+1)+"th employee's Id:");
			employeeId[i] = Integer.parseInt(br.readLine());
			System.out.println("Enter "+(i+1)+"th employee's Name:");
			name[i] = br.readLine();
			System.out.println("Enter "+(i+1)+"th employee's salary:");
			salary[i] = Double.parseDouble(br.readLine());
		}
//Executing all functions
		display(employeeId,name,salary);
		display(employeeId,name);
		System.out.println("Enter name to be searched within an array :");
		search_name = br.readLine();
		display(search_name, employeeId, name,salary);	
	}
//Function 1 with 3 arguments id/regNo , employee name and salary
	public static void display(int [] id, String [] name, double [] salary) {
		int j;
		System.out.println("\n\nId\t\t Name\t\t Salary\t\t");
		for (j=0;j<5;j++) {
			System.out.println(id[j]+"\t\t"+name[j]+"\t\t"+salary[j]);
		}  }
//Function 2 with 2 arguments id regNo and employee name
	public static void display(int [] id, String [] name) {
		int i;
		System.out.println("\n\nId\t\t Name");
		for (i=0;i<5;i++) {
			System.out.println(id[i]+"\t\t"+name[i]);
		}  }
//Function 3 with 4 arguments searched_name,id/regNo, employee name  and salary
	public static void display(String name, int [] regNo, String [] empName, double [] salary) {
//This functions searches the name in array, if found returns the data else returns no data found as output.
		int i,flag,j;
		flag =0;
		j = 5;
		for(i = 0; i<5;i++) {
			if(empName[i].equalsIgnoreCase(name)) {
				flag = 1;
				j = i;
			}  }
		if(flag ==1) {
			System.out.println("\n\nId\t\t Name\t\t Salary\t\t");
			System.out.println(regNo[j]+"\t\t"+empName[j]+"\t\t"+salary[j]);	
		}
		else if (flag == 0 && j == 5) {
			System.out.println("The name of '"+name+"' is not found in array.");
		}  }  }