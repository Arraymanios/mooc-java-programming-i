/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int sightings;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.sightings = 0;
    }
    
    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    public int getSightings(){
        return this.sightings;
    }
    
    public void incrementSightings(){
        this.sightings++;
    }
    
    @Override
    public String toString(){
        if (this.sightings == 1){
            return (getName() + "(" + getLatinName() + "): " + getSightings() + " observation");
        }
        return (getName() + "(" + getLatinName() + "): " + getSightings() + " observations");
    }
}
