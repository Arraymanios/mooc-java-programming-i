
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner reader = new Scanner(Paths.get(fileName))){
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] data = line.split(",");
                int age = Integer.valueOf(data[1]);
                
                if (age == 1){
                    System.out.println(data[0] + ", age: " + age + " year");
                } else{
                    System.out.println(data[0] + ", age: " + age + " years");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
