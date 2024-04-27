/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
public class Container {
    
    private int liters;
    
    public Container(){
        this.liters = 0;
    }
    
    public int contains(){
        return this.liters;
    }
    
    public void add(int amount){
        if(amount < 0){
            ;
        } else {
            if(amount + this.liters > 100){
                this.liters = 100;
            } else {
                this.liters += amount;
            }
        }
    }
    
    public void remove(int amount){
        if(amount < 0){
            ;
        } else {
            if(this.liters - amount < 0){
                this.liters = 0;
            } else {
                this.liters -= amount;
            }
        }
    }
    
    @Override
    public String toString(){
        return this.liters + "/" + "100";
    }
}
