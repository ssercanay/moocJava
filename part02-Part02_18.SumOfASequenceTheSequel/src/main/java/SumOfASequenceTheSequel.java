
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int first = Integer.valueOf(scanner.nextLine());        
        System.out.println("First number?");
        int num = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = first; i <= num; i++) {
            sum = sum + i;           
        }
        System.out.println("The sum is " + sum);
    }
}
