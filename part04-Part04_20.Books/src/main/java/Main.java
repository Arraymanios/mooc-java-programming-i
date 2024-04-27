import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String title, information;
        int pages, year;
        
        while(true){
            System.out.print("Title: ");
            title = reader.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            pages = Integer.valueOf(reader.nextLine());
            System.out.print("Publication year: ");
            year = Integer.valueOf(reader.nextLine());
        }
        
        System.out.print("What information will be printed? ");
        information = reader.nextLine();
        if(information.equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }
        else if (information.equals("name")){
            for(Book book: books){
                book.getTitle();
            }
        }
    }
}
