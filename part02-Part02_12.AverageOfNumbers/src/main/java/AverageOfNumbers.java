
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            
            count = count + 1; 
            sum = sum + num;
        }
        System.out.println("Average of the numbers: " + (sum / count));

    }
}
