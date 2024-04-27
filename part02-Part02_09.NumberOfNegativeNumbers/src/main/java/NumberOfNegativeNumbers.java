
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negatives = 0;
        while(true){
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if(nbr == 0) {
                break;
            }
            if(nbr < 0) {
                negatives = negatives + 1;
            }
        }
        System.out.println("Number of negative numbers: " + negatives);
    }
}
