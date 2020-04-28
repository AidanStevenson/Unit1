package app;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
    
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you first name");
        String firstName = input.nextLine();
        System.out.println("Please enter your last name");
        String lastName = input.nextLine();
        System.out.println("Please enter you age");
        String age = input.nextLine();
        System.out.println("Please enter your favorite color");
        String color = input.nextLine();

        System.out.println("Your first name is " + firstName);
        System.out.println("Your Last name is " + lastName);
        System.out.println("Your age is " + age);
        System.out.println("Your favorite colors are " + color);
    }   
}
        