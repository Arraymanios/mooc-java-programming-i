
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++){
            System.out.print(" ");    
        }
    }

    public static void printTriangle(int size) {
        int line, spaces = size - 1, stars = 1;
        for(line = 0; line < size; line++){
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int line, spaces = height - 1, stars = 1;
        
        for(line = 0; line < height; line++){
            printSpaces(spaces);
            printStars(stars);
            stars = stars + 2;
            spaces = spaces - 1;
        }
        
        for(line = 0; line < 2; line++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        christmasTree(4);
        System.out.println("--------------------");
        christmasTree(7);
    }
}
