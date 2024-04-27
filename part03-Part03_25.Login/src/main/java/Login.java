
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String username, password;
        
        System.out.print("Enter username:");
        username = scanner.nextLine();
        System.out.print("Enter password:");
        password = scanner.nextLine();
        
        if((username.equals("alex") && password.equals("sunshine")) || username.equals("emma") && password.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }  
    }
}
