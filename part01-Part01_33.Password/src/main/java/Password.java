
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Passport?");
        String key = scan.nextLine();
        if (key.equals("Caput Draconis")) {
            System.out.println("Welcome!");
            
        } else{
            System.out.println("Off with you!");
        }

        // Write your program here 
    }
}
