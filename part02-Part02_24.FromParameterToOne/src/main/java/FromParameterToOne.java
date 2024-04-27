

public class FromParameterToOne {
    
    public static void printFromNumberToOne(int number){
        if(number > 1){
            while(number >= 1){
                System.out.println(number);
                number--;
            }
        }
    }

    public static void main(String[] args) {
        printFromNumberToOne(8);
    }
}
