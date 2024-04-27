
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, numbers = 0;
        
        while(true) {
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if(nbr == 0) {
                break;
            }
            sum = sum + nbr;
            numbers = numbers + 1;
        }
        System.out.println("Average of the numbers: " + (1.0*sum)/numbers);
    }
}
