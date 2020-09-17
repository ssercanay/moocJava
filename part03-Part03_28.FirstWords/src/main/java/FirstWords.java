
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.nextLine();        
            String[] splited = text.split(" ");
            if (text.equals("")) {
                break;                
            }
            System.out.println(splited[0]);
            
        }

    }
}
