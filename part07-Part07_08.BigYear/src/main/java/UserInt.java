
import java.util.ArrayList;
import java.util.Scanner;

public class UserInt {
    private ArrayList<Birds> birds; 
    
    public UserInt(){
        this.birds = new ArrayList<>();
    }
    
    public void start(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name  = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName  = scan.nextLine();
                birds.add(new Birds(name, latinName));
                
                for(Birds bird: birds){
                    bird.Add();
                    
                }
                
            }
            
            if (command.equals("Observation")) {
                System.out.print("Birds? ");
                String name  = scan.nextLine();
                for (Birds bird: birds) {
                    if (bird.getBirds().get(0).equals(name)) {
                        bird.Observation();                        
                    } else {
                        System.out.println("Not a bird!");
                    }
                    
                }
            }
            
            if (command.equals("All")) {
                for (Birds bird: birds) {
                    System.out.println(bird.getBirds().get(0) + "(" 
                            + bird.getBirds().get(1) 
                            + "): " + bird.getObservation()
                            + " observations");
                }
            }
            
            if (command.equals("One")) {
                System.out.print("Birds? ");
                String name  = scan.nextLine();
                for (Birds bird: birds) {
                    if (bird.getBirds().get(0).equals(name)) {
                        System.out.println(bird.getBirds().get(0) + "(" 
                            + bird.getBirds().get(1) 
                            + "): " + bird.getObservation() 
                            + " observations");                        
                        
                    }
                }
            }
            
            if (command.equals("Quit")) {
                break;
            }
        }
    }
}
