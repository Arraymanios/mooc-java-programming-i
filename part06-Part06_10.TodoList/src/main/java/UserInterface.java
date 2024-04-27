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
    
    private TodoList taskList;
    private Scanner reader;
    
    public UserInterface(TodoList list, Scanner reader){
        this.taskList = list;
        this.reader = reader;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = this.reader.nextLine();
            if(command.equals("add")){
                System.out.print("To add: ");
                String task = this.reader.nextLine();
                this.taskList.add(task);
            } else if(command.equals("list")){
                this.taskList.print();
            } else if(command.equals("remove")){
                System.out.print("Which one is removed?");
                int i = Integer.valueOf(this.reader.nextLine());
                this.taskList.remove(i);
            } else if(command.equals("stop")){
                break;
            }
        }
    }
}
