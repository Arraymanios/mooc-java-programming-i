
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int nbr = 0, sum = 0, numbers = 0, even = 0, odd = 0;
        double average;
        System.out.println("Give numbers:");
        while(true){
            nbr = Integer.valueOf(scanner.nextLine());
            if(nbr == -1){
                break;
            }
            sum = sum + nbr;
            numbers++;
            if(nbr % 2 ==0){
                even++;
            } else {
                odd++;
            }
        }
        average = (1.0*sum)/numbers;
        System.out.println("Thx!Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average:" + average);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
    }
}
