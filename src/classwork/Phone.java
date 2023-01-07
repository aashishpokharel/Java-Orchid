package classwork;

public class Phone {public static void main(String[] args)
{
    MobilePhone mp1 = new MobilePhone("Rahul", "984209865");
    MobilePhone mp2 = new MobilePhone("Rohan", "985432189");

    mp1.dial(mp2);
    mp2.message(mp1, "I am busy, please call later");
}  }
class MobilePhone
{
    String name;
    String number;
    MobilePhone(String name, String number)
{
        this.name = name;
       this.number = number;
       }
    public void dial(MobilePhone mobile)
    {
        System.out.println("Dialing " + mobile.number + " " + name);
        mobile.receive(mobile);
    }
    public void receive(MobilePhone mobile)
    {
        System.out.println(mobile.number + " is calling you " + name);
    }
    public void message(MobilePhone mobile, String msg)
    {
        System.out.println("\nYou have sent the message " + msg + " to " + mobile.name + ", " + mobile.number);
    }
    public void display()
    {
        System.out.println("\nName: " + name + ", Number: " + number);
    } }
