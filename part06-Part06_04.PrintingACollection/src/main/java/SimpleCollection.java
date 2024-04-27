
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        
        String elementsList = "";
        
        for(String element: this.elements){
            elementsList += element;
        }
        
        if (this.elements.size() == 1){
            return "The collection " + getName() + " has 1 element:\n" + elementsList;
        }
        else if (this.elements.size() > 1){
            return "The collection " + getName() +  " has " + this.elements.size() + " elements:\n" + elementsList;  
        }
        return "The collection " + getName() + " is empty.";
    }
}
