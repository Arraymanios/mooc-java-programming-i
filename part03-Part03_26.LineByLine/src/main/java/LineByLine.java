
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        while(true){
            String str = scanner.nextLine();
            
            if(str.equals("")){
                break;
            }
            
            String[] words = str.split(" ");
            
            for(i = 0; i < words.length; i++){
                System.out.println(words[i]);
            }
        } 
    }
}
