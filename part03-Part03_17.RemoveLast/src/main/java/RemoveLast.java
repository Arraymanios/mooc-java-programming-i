
import java.util.ArrayList;

public class RemoveLast {
    
    public static void removeLast(ArrayList<String> strings) {
        if(strings.size()==0)return;
        
        strings.remove((strings.size())-1);
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("Ein");
        strings.add("Zwei");
        strings.add("Drei");
        
        System.out.println(strings);
        
        removeLast(strings);
        
        System.out.println(strings);
    }
}
