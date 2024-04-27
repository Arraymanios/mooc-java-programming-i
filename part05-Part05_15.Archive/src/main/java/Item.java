/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
public class Item {
    private String identifier, name;
    
    public Item(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
            return false;
        }
        
        Item otherItem = (Item) compared;
        
        if(this.identifier.equals(otherItem.identifier)){
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return getIdentifier() + ": " + getName();
    }
}
