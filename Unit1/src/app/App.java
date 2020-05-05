package app;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
    
        Scanner input = new Scanner(System.in);

        System.out.println("how many hours are in a day?");
        String hoursString = input.nextLine();{
            if (hoursString.equals("24"))
            System.out.println("correct");
            }
            
        
        System.out.println("How many states are in the united states?");
        String statesString = input.nextLine();{
            if (statesString.equals("50"))
            System.out.println("correct");
            }

        
        System.out.println("How many classes does each student have?");
        String classesString = input.nextLine();{
            if (classesString.equals("5"))
            System.out.println("correct");
            }

         
       
         
    }   
}
        