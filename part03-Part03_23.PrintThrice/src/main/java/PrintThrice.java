
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word:");
        String str = scanner.nextLine();
        
        System.out.print(str);
        System.out.print(str);
        System.out.println(str);
    }
}
