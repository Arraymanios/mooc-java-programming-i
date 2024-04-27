
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        
        while(true){
            str = scanner.nextLine();
            
            if(str.equals("")){
                break;
            }
            
            String[] words = str.split(" ");
            
            for(int i = 0; i < words.length; i++){
                if(words[i].contains("av")){
                    System.out.println(words[i]);
                }
            }
        }
    }
}
