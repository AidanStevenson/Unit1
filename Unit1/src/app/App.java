package app;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
    
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a noun");
        String nounString = input.nextLine();

        System.out.println("Please enter a name");
        String nameString = input.nextLine();

        System.out.println("Please enter a verb");
        String verbString = input.nextLine();

        System.out.println("Please enter an adjective");
        String adjectiveString = input.nextLine();

        System.out.println("Please enter a place");
        String placeString = input.nextLine();

        System.out.println("Please enter a food");
        String foodString = input.nextLine();

        System.out.println("Please enter an animal");
        String animalString = input.nextLine();

        System.out.println("Please enter a number");
        String numberString = input.nextLine();

        System.out.println("You entered:");

        System.out.println("Noun: " + nounString);

        System.out.println("Name: " + nameString);

        System.out.println("Verb: " + verbString);

        System.out.println("Adjective: " + adjectiveString);

        System.out.println("Place: " + placeString);

        System.out.println("Food: " + foodString);

        System.out.println("Animal: " + animalString);

        System.out.println("Number: " + numberString);   
    }   
}
        