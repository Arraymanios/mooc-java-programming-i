import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        Scanner scan = new Scanner(System.in);
        BirdList database = new BirdList();
        
        while(true){
            System.out.print("?");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }else if(command.equals("Add")){
                database.addBird(scan);
            }else if(command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                database.addObservation(name);
            }else if(command.equals("All")){
                database.printAll();
            }else if(command.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                database.printOne(name);
            }
        }
    }
}
