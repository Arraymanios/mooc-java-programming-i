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
import java.util.Scanner;

public class BirdList {
    
    private ArrayList<Bird> database;
    
    public BirdList(){
        this.database = new ArrayList<>();
    }
    
    public void addBird(Scanner scan){
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        Bird bird = new Bird(name, latinName);
        this.database.add(bird);
    }
    
    public void printOne(String birdName){
        for(Bird bird: this.database){
            if(bird.getName().equals(birdName)){
                System.out.println(bird);
            }
        }
    }
    
    public void printAll(){
        for(Bird bird: this.database){
                System.out.println(bird);
        }
    }
    
    public void addObservation(String birdName){
        for(Bird bird: this.database){
            if(bird.getName().equals(birdName)){
                bird.incrementSightings();
            } else{
                System.out.println("Not a bird!");
            }
        }
    }
}
