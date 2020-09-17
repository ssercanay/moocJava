
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {        
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            book.add(new Book(title, pages, year));
        }
        System.out.println("");

        System.out.print("What information will be printed? ");
        String desire = scanner.nextLine();
        
        for (Book info: book) {
            if (desire.equalsIgnoreCase("everything")) {
                System.out.println(info);            
            } 
            if (desire.equalsIgnoreCase("name")){
                System.out.println(info.getName());
            
        }
            
        }
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

    }
}
