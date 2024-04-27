
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container(), second = new Container();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                first.add(amount);
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            } else if (command.equals("move")){
                if(first.contains() < amount){
                    second.add(first.contains());
                    first.remove(first.contains());
                } else {
                first.remove(amount);
                second.add(amount);
                }
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            } else if (command.equals("remove")){
                second.remove(amount);
                System.out.println("First: " + first);
                System.out.println("Second: " + second);
            }
        }
    }
}
