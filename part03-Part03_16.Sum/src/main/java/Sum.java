
import java.util.ArrayList;

public class Sum {
    
    public static int sum(ArrayList<Integer> numbers) {
        
        if(numbers.size()==0){
            return -1;
        }
        
        int sum = 0;
        
        for(int number : numbers){
            sum = sum + number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nbrs = new ArrayList<>();
        
        nbrs.add(9);
        nbrs.add(8);
        nbrs.add(6);
        nbrs.add(3);
        System.out.println(sum(nbrs));
        nbrs.add(4);
        nbrs.add(13);
        System.out.println(sum(nbrs));
    }
}
