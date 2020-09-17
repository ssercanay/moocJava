
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String text = scanner.nextLine();        
            String[] splited = text.split(" ");
            if (text.equals("")) {
                break;                
            }
            for (int i = 0; i < splited.length; i++) {
                if (splited[i].contains("av")) {
                System.out.println(splited[i]);                    
                }
                
            }
            
        }

    }
}
