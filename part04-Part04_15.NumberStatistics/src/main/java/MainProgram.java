
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        int nb;
        Scanner scanner = new Scanner(System.in);
        Statistics stat = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers: ");      
        while(true){
            nb = Integer.valueOf(scanner.nextLine());
            if(nb == -1){
                System.out.println("Sum: " + stat.sum());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                break;
            }
            stat.addNumber(nb);
            
            if(nb % 2 == 0){
                even.addNumber(nb);
            }
            
            if(nb % 2 != 0){
                odd.addNumber(nb);
            }
        }

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
