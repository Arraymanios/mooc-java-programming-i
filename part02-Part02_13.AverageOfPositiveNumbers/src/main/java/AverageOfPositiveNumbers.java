
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, numbers = 0;
        while(true){
            int nbr = Integer.valueOf(scanner.nextLine());
            if(nbr == 0){
                break;
            } else if (nbr > 0){
                sum = sum + nbr;
                numbers = numbers + 1;
            } 
        }
        if(sum <= 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((1.0*sum)/numbers);
        }
    }
}
