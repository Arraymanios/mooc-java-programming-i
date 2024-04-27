
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = Integer.valueOf(scanner.nextLine()), i = 0;
        if(nbr < 0){
            System.out.println("Not positive.");
        } else {
            while (i <= nbr) {
                System.out.println(i);
                i++;
            }
        }
    }
}
