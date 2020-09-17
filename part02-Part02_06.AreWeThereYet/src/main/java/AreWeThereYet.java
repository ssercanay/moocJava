
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 4;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == target) {
                break;
                
            }
        }

    }
}
