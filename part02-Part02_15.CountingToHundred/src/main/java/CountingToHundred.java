
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = Integer.valueOf(scanner.nextLine());
        if(nbr >= 100){
            System.out.println("Please give a value inferior to 100.");
        } else {
            for(int i = nbr; i <= 100; i++) {
                System.out.println(i);
            }    
        }
    }
}
