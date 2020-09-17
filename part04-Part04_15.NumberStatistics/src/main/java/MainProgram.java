
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics totalSum = new Statistics();        
        Statistics evenNumber = new Statistics();
        Statistics oddNumber = new Statistics();
        int number;
        System.out.println("Enter numbers: ");
        while(true){
            number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Sum: " + totalSum.sum());
                System.out.println("Sum of even numbers: " + evenNumber.sum());
                System.out.println("Sum of odd numbers: " + oddNumber.sum());
                break;
        }
            
            totalSum.addNumber(number);
            if (number % 2 == 0) {
                evenNumber.addNumber(number);
                
                
            } else if (number % 2 != 0) {
                oddNumber.addNumber(number);                
            }

            


            
        }
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
