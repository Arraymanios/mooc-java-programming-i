/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> toDoList;
    
    public TodoList(){
        this.toDoList = new ArrayList<>();
    }
    
    public void add(String task){
        this.toDoList.add(task);
    }
    
    public void print(){
        for(int i = 0; i < this.toDoList.size(); i++){
            System.out.println((i+1) + ": " + this.toDoList.get(i));
        }
    }
    
    public void remove(int index){
        this.toDoList.remove(index - 1);
    }
}
