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

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command:");
            String command = this.scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")){
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation:");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if(command.equals("search")){
                System.out.println("To be translated:");
                String toTranslate = this.scanner.nextLine();
                if(this.dictionary.translate(toTranslate) == null){
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println(this.dictionary.translate(toTranslate));
                } 
            }
            System.out.println("Unknown command");
        }
    }
}
