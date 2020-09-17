import java.util.Scanner;

public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scan, SimpleDictionary dictionary){
        this.scan = scan;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            //programs end when user enters "end"
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            //adds words to dictionary when user uses "add" command
            else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.println("Translation: ");
                String translation = scan.nextLine();
                dictionary.add(word, translation);
            }
            
            else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String search = scan.nextLine();
                if (dictionary.translate(search).equals("")) {
                    System.out.println("Word " + search + " was not found");
                    
                } else{
                    System.out.println("Translation: " + dictionary.translate(search));
                }
                
            }
            else{
                System.out.println("Unknown command");
        }       }
        
    }
    
}
