
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;

        while (true) {
            String input = scan.nextLine();
            if(input.equals("quit")){
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(amount > 0){
                if(command.equals("add")){
                if(first + amount > 100){
                    first = 100;
                } else {
                    first += amount;
                }
                System.out.print("First: " + first + "/100\n" + "Second: " + second + "/100\n");
            } else if(command.equals("move")){
                if(second + amount > 100){
                    second = 100;
                    first = 0;
                } else if (amount > first){
                    second += first;
                    first = 0;
                } else { 
                    second += amount;
                    if(first - amount < 0){
                        first = 0;
                    } else {
                        first -= amount;
                    }
                }
                System.out.print("First: " + first + "/100\n" + "Second: " + second + "/100\n");
            } else if(command.equals("remove")){
                if(amount > second){
                    second = 0;
                } else {
                    second -= amount;
                }
                System.out.print("First: " + first + "/100\n" + "Second: " + second + "/100\n");
            }
            }
        }
    }
}
