package classwork;

import java.util.Scanner;
public class Application
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
boolean loop = true;
String[] drinks = {"Lassi", "Juice", "Cider", "Fanta"};
int[] price = {30, 100, 120, 150};
int[] quantity = new int[drinks.length];
DrinksMenu[] drinksMenus = new DrinksMenu[drinks.length];

for (int i = 0; i < drinks.length; i++) {
drinksMenus[i] = new DrinksMenu(drinks[i], price[i]);
quantity[i] = 0;
}
while (loop){
System.out.println("Choose from menu for orders and press 0 to finalize");
System.out.println("SNo." + "\t\t" + "AvailableItems" + "\t" + "Price");
for (int i = 0; i < drinks.length; i++){
drinksMenus[i].displayMenu(i);
}
System.out.print("Choice: ");
int choice = scanner.nextInt();
for (int i = 0; i < drinks.length; i++){
if (choice - 1 == i)
{
System.out.println("Enter how much quantity of " + drinksMenus[i].name + " you wish to purchase: ");
quantity[i] = quantity[i] + scanner.nextInt();
}
else if (choice == 0)
{
loop = false;
} } }
double total = 0;
for (int i = 0; i < drinks.length; i++)
{
total = total + drinksMenus[i].price * quantity[i];
}
System.out.println("The total is: " + total);
}  }
class DrinksMenu{
String name;
double price;

DrinksMenu()
{ }
DrinksMenu(String name, double price)
{
this.name = name;
this.price = price;
}
public void displayMenu(int i)
{
System.out.println((i + 1) + "\t\t\t" + name + "\t\t\t" + price);
}   }