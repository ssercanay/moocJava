
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int numThree = Integer.valueOf(scanner.nextLine());        
        System.out.println("The sum of the numbers is " + (numOne + numTwo + numThree));

        // Write your program here

    }
}
