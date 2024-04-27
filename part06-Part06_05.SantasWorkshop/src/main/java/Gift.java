/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
public class Gift {
    
    private String name;
    private int weight;
    
    public Gift(String initialName, int initialWeight){
        this.name = initialName;
        this.weight = initialWeight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return getName() + "(" + getWeight() + " kg)";
    }
}
