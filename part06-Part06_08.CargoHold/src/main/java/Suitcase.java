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

public class Suitcase {
    
    private ArrayList<Item> itemList;
    private int maxWeight;
    
    public Suitcase(int initialMaxWeight){
        this.itemList = new ArrayList<>();
        this.maxWeight = initialMaxWeight;
    }
    
    public int getMaxWeight(){
        return this.maxWeight;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Item item: this.itemList){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public void addItem(Item item){
        this.itemList.add(item);
        if(totalWeight() > this.getMaxWeight()){
            this.itemList.remove(item);
        }
    }
    
    @Override
    public String toString(){
        
        if(this.itemList.isEmpty()){
            return "no items (0 kg)";
        }
        if(this.itemList.size() == 1){
            return "1 item" + " (" + this.itemList.get(0).getWeight() + " kg)";
        }
        return this.itemList.size() + " items" + " (" + totalWeight() + " kg" +")";
    }
    
    public void printItems(){
        for(Item item: this.itemList){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if(this.itemList.isEmpty()){
            return null;
        }
        
        Item heaviest = this.itemList.get(0);
        
        for(Item item: this.itemList){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        return heaviest;
    }
}
