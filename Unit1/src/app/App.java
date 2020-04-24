package app;

public class App{
    public static void main(String[] args) throws Exception{
    
        System.out.println("Start first loop");
        for (int i = 1; i < 11; i++){
            System.out.println(i);
            if (i == 5){
                System.out.println("Five");
            }
        }
        System.out.println("End first loop");
        System.out.println("Start second loop");
        for (int i = 100; i < 210; i = i + 10){
            System.out.println(i);
        }
        System.out.println("End second loop");
    }   
}
        