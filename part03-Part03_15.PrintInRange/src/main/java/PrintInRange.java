
import java.util.ArrayList;

public class PrintInRange {
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for(int number : numbers){
            if(number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nbrs = new ArrayList<>();
        nbrs.add(9);
        nbrs.add(7);
        nbrs.add(12);
        nbrs.add(4);
        nbrs.add(1);
        nbrs.add(0);
        
        System.out.println("The numbers in the range [0, 7]");
        printNumbersInRange(nbrs, 0, 7);
        
        System.out.println("The numbers in the range [8, 12]");
        printNumbersInRange(nbrs, 8, 12);
    }
}
