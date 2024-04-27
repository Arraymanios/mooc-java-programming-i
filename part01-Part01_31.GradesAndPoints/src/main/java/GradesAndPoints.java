
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points[0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        if (grade < 0) {
            System.out.println("impossible!");
        } else if (grade >= 0 && grade <= 49) {
            System.out.println("failed");
        }
        if (grade >= 50 && grade <= 59) {
            System.out.println("1");
        } else if (grade >= 60 && grade <= 69) {     
            System.out.println("2");
        }
        if (grade >= 70 && grade <= 79) { 
            System.out.println("3");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("4");
        }
        if (grade >= 90 && grade <= 100) {  
            System.out.println("5");
        } else if (grade > 100) { 
            System.out.println("incredible!");
        }
    }
}
