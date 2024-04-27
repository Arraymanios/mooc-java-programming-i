
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        int nbr, sum = 0, values = 0;
        
        while(true){
            nbr = Integer.valueOf(scanner.nextLine());
            
            if(nbr == -1){
                break;
            }
            list.add(nbr);
            values = values + 1;
        }
        
        for(Integer num : list){
            sum = sum + num;
        }
      
        System.out.println("Average:" + ((1.0)*sum)/values);  
    }
}
