
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb1 = Integer.valueOf(scanner.nextLine());
        int nb2 = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(nb1+nb2);
        System.out.println(squareRoot);
    }
}
