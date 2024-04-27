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

public class Room {
    
    private ArrayList<Person> personList;
    
    public Room(){
        this.personList = new ArrayList<>();
    }
        
    public void add(Person person){
        this.personList.add(person);
    }
    
    public boolean isEmpty(){
        return this.personList.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        ArrayList<Person> listCopy = new ArrayList<>();
        
        for(Person person: this.personList){
            listCopy.add(person);
        }
        return listCopy;
    }
    
    public Person shortest(){
        if(this.personList.isEmpty()){
            return null;
        }
        Person shortest = this.personList.get(0);
        
        for(Person person: this.personList){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(this.personList.isEmpty()){
            return null;
        }
        
        Person shortest = this.personList.get(0);
        
        for(Person person: this.personList){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        this.personList.remove(shortest);
        return shortest; 
    }
}
