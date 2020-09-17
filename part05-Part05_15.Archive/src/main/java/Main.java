
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();
        while (true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Items item = new Items(id, name);
            
            if (items.contains(item) == false) {            
                items.add(item);
                
            } 
        }
        System.out.println("==Items==");
        
        for (Items item: items) {
            System.out.println(item);
            
        }

    }
}
