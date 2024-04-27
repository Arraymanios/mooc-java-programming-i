import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = reader.nextLine(), command, word, ingredient;
        int cookingTime;
        
        Recipes recipes = new Recipes(); // Création d'une instance de la classe Recipes
        recipes.storeRecipes(file); // Appel de la méthode storeRecipes sur l'instance de Recipes
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            System.out.println("Commands:\n list - lists the recipes\n stop - stops the program\n find name - searches recipes by name\n find cooking time - searches recipes by cooking time\n find ingredient - searches recipes by ingredient");
    
            while (scanner.hasNextLine()) {
                System.out.print("Enter command: ");
                command = reader.nextLine();
                if(command.equals("stop")){
                    break;
                }else if(command.equals("list")){
                    recipes.listRecipes();
                }else if(command.equals("find name")){
                    System.out.print("Searched word: ");
                    word = reader.nextLine();
                    recipes.byName(word);
                }else if(command.equals("find cooking time")){
                    System.out.print("Max cooking time: ");
                    cookingTime = Integer.valueOf(reader.nextLine());
                    recipes.byCookingTime(cookingTime);
                }else if(command.equals("find ingredient")){
                    System.out.print("Ingredient: ");
                    ingredient = reader.nextLine();
                    recipes.byIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}