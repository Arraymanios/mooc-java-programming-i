/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnau
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Recipes {
    private ArrayList<String>[] recipes;
    private ArrayList<String> lines;
    
    public Recipes(){
        this.lines = new ArrayList<>();
    }
    
    public void storeRecipes(String filename){   
        int size = 1; // Size of the array containing the recipes
        String line;
        
        try(Scanner scanner = new Scanner(Paths.get(filename))){ // Reading the file a first time to determine the size of the array
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if(line.equals("")){
                    size++;
                }        
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        this.recipes = new ArrayList[size];
        for(int i = 0; i < size; i++){
            this.recipes[i] = new ArrayList<>();
        }
        
        try(Scanner reader = new Scanner(Paths.get(filename))){ // Reading the file a second time to store recipes in the array
            int i = 0;
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                if(line.equals("")){
                    i++;
                    continue;
                }
                this.recipes[i].add(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public int getSize(){
        return this.recipes.length;
    }
    
    public void printRecipe(int index){
        for(String line: this.recipes[index]){
            System.out.println(line);
        }
    }
    
    public void listRecipes(){
        System.out.println("Recipes:");
        for(int i = 0; i < getSize(); i++){
            System.out.println(this.recipes[i].get(0) + ", cooking time: " + this.recipes[i].get(1));
        }
    }
    
    public void byName(String word){
        System.out.println("Recipes:");
        for(int i = 0; i < getSize(); i++){
            if(this.recipes[i].get(0).contains(word)){
                System.out.println(this.recipes[i].get(0) + ", cooking time: " + this.recipes[i].get(1));
            }
        }
    }
    
    public void byCookingTime(int maximum){
        System.out.println("Recipes:");
        for(int i = 0; i < getSize(); i++){
            if(Integer.valueOf(this.recipes[i].get(1)) <= maximum){
                System.out.println(this.recipes[i].get(0) + ", cooking time: " + this.recipes[i].get(1));
            }
        }
    }
    
    public void byIngredient(String ingredient){
        System.out.println("Recipes:");
        for(int i = 0; i < getSize(); i++){
            if(this.recipes[i].contains(ingredient)){
                System.out.println(this.recipes[i].get(0) + ", cooking time: " + this.recipes[i].get(1));
            }
        }
    }
}
