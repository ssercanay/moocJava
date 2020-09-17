
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        double count = 0;
        int countEven = 0;
        int countOdd = 0;
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }
            if (num % 2 == 0) {
                countEven ++;
            } else {
                countOdd ++;                
            }
            sum += num;
            count ++;
        }
        System.out.println("Thx! Bye!");
        if (count != 0) {
            System.out.println("Sum: " + sum);
            System.out.println("Numbers: " + (countEven + countOdd));
            double avg = sum / count;
            System.out.println("Average: " + avg);
            System.out.println("Even: " + countEven);
            System.out.println("Odd: " + countOdd);            
        }

        

            
            
        

    }
}
