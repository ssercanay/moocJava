
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numFirst = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int numSec = scan.nextInt();
        if (numFirst > numSec) {
            System.out.println("Greater number is: " + numFirst);
            
        } else if (numFirst < numSec) {
            System.out.println("Greater number is: " + numSec);            
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
