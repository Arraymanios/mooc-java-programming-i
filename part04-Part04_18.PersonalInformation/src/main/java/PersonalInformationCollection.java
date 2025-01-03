
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName, id;
        
        while(true){
            System.out.print("First name: ");
            firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            id = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, id));
        }
        
        for(PersonalInformation info: infoCollection){
                    System.out.println(info.getFirstName() + " " + info.getLastName() + " ");
        }
    }
}
