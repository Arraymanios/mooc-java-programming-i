
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0;
        String longest = "";
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] details = input.split(",");
            
            if(details[0].length() > longest.length()){
                longest = details[0];
            }
            
            sum += Integer.valueOf(details[1]);
            count++;
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + (1.0 * sum/count));
    }
}
