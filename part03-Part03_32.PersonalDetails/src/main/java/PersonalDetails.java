
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longest = "";
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;               
            }
            String[] parts = input.split(",");
            sum = sum + Integer.valueOf(parts[1]);
            count++;
            if (longest.length() < parts[0].length()) {
                longest = parts[0];
                
            }
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the bith years: " + (1.0*sum)/count);


    }
}
