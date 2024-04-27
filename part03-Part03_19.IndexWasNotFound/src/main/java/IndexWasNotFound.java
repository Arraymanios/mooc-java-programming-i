

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int search, i = 0;
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        search = Integer.valueOf(scanner.nextLine());
        
        while(i < (array.length)-1){
            if(array[i]==search){
                System.out.println(search + " is at index " + i + ".");
                return;
            }
            i++;
        }
        
        System.out.println(search + " was not found.");
    }
}
