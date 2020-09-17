
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        if (gift < 5000) {
            System.out.println("No tax!");
            
        } else if (gift >= 5000 && gift <25000) {
            double sum = (100 + (gift-5000)*0.08);
            System.out.println("Tax: " + sum);
            
        } else if (gift >= 25000 && gift <55000) {
            double sum = (1700 + (gift-25000)*0.10);
            System.out.println("Tax: " + sum);
            
        } else if (gift >= 55000 && gift <200000) {
            double sum = (4700 + (gift-55000)*0.12);
            System.out.println("Tax: " + sum);
            
        } else if (gift >= 200000 && gift <1000000) {
            double sum = (22100 + (gift-200000)*0.15);
            System.out.println("Tax: " + sum);
            
        } else {
            double sum = (142100 + (gift-1000000)*0.17);
            System.out.println("Tax: " + sum);
            
        }

    }
}
