package classwork;

import java.util.Scanner;

public class functionAssignment1 {
    private static int[] empNums;
   private static double[] empSals;
   private static String[] empnames;

   public int[] getEmpNums(){
   return empNums;
   }
  public double[] getSalaries(){
  return empSals;
 }
 public String[] getnames(){
 return empnames;
 }
public static void display (int[] nums, String[] names, double[] sals){
for (int i = 0; i < 5; i++)
{
 System.out.println(nums[i] + " " + names[i] + " " + sals[i]);
}   }
   public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   empNums = new int[5];
   empnames = new String[5];
    empSals = new double[5];
    for (int i = 0; i < 5; i++){

 System.out.println("Please enter your employee number: ");
empNums[i] = sc.nextInt();
System.out.println("Please enter your Employee name: ");
sc.nextLine(); //so the input isn't skipped 
empnames[i] = sc.nextLine();
System.out.println("Please enter your Salary: ");
empSals[i] = sc.nextDouble();
}
display(empNums, empnames, empSals);
}   }