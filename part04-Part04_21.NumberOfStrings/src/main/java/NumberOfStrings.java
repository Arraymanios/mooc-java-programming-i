
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = 0;
        
        while(true){
            String line = scanner.nextLine();
            
            if(line.equals("end")){
                break;
            } else {
                numberOfLines++;
            }
        }
        
        System.out.println(numberOfLines);
    }
}
