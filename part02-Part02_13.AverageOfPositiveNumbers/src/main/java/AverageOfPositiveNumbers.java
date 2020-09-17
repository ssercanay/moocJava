
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if (num > 0) {
                count = count + 1; 
                sum = sum + num;    
            } 

        }
        if (sum > 0) {
            System.out.println("Average of the numbers: " + (sum / count));

        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
