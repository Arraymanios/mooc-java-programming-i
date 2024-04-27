/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner reader;
    
    public UserInterface(JokeManager manager, Scanner reader){
        this.manager = manager;
        this.reader = reader;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:\n 1 - add a joke\n 2 - draw a joke\n 3- list jokes\n X - stop\n");
            String command = this.reader.nextLine();
            if(command.equals("1")){
                System.out.println("Write the joke to be added:");
                String toAdd = this.reader.nextLine();
                this.manager.addJoke(toAdd);
            } else if(command.equals("2")){
                System.out.println(this.manager.drawJoke());      
            } else if(command.equals("3")){
                System.out.println("Printing the jokes.");
                this.manager.printJokes();
            } else if(command.equals("X")){
                break;
            }
        }
    }
}
