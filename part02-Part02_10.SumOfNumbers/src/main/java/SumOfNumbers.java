
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if(nbr == 0) {
                break;
            }
            sum = sum + nbr;
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
