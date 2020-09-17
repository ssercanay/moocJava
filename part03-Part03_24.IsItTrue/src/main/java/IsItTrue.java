
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String check = scanner.nextLine();
        if (check.equals("true")) {
            System.out.println("You got it wight!");
            
        } else {
            System.out.println("Try again!");
        }

    }
}
