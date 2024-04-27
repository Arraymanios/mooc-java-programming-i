
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int nbr = Integer.valueOf(scanner.nextLine()), factorial = 1;
        if(nbr == 0 || nbr == 1){
            System.out.println("Factorial: " + factorial);
        } else if (nbr > 1){
            for(int i = 1; i <= nbr; i++){
                factorial = factorial*i;
            }
            System.out.println("Factorial: " + factorial);
        }
    }
}
