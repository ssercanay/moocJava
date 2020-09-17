
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int numto = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = num; i <= numto; i++) {
            System.out.println(i);
        // Write your program here
        }
    }
}
