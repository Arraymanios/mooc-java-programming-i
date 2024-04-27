
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0, sum = 0;
        while(true) {
            System.out.println("Give a number:");
            int nbr = Integer.valueOf(scanner.nextLine());
            if(nbr == 0){
                break;
            }
            numbers = numbers + 1;
            sum = sum + nbr;
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: "+ sum);
    }
}
