
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                if(line.equals(searchedFor)){
                    isFound = true;
                    System.out.println("Found!");
                    break;
                }
            }
            
            if(isFound == false)System.out.println("Not found.");
            
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
