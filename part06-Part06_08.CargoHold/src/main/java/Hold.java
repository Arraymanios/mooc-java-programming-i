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

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseHold;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseHold = new ArrayList<>();
    }
    
    public int getMaxWeight(){
        return this.maxWeight;
    }
    
    public int getWeight(){
        int totalWeight = 0;
        
        for(Suitcase suitcase: this.suitcaseHold){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){ 
        this.suitcaseHold.add(suitcase);
        if(getWeight() > getMaxWeight()){
            this.suitcaseHold.remove(suitcase);
        }
    }
    
    @Override
    public String toString(){
        return this.suitcaseHold.size() + " suitcases " + "(" + getWeight() + " kg)"; 
    }
    
    public void printItems(){
        for(Suitcase suitcase: this.suitcaseHold){
            suitcase.printItems();
        }
    }
}
