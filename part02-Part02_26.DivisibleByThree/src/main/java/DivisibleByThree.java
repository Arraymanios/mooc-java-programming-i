
import java.util.Scanner;

public class DivisibleByThree {
    public static void divisibleByThreeInRange(int beginning, int end){
        if(end > beginning){
            for(int i = beginning; i <= end; i++){
                if(i % 3 == 0){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(1,19);
    }
}
