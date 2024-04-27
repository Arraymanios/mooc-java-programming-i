
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int nbr = Integer.valueOf(scanner.nextLine()), i = 1, sum = 0;
        if(nbr > 1) {
            while(i <= nbr){
                sum = sum + i;
                i++;
            }
            System.out.println("The sum is " + sum);
        }
    }
}
