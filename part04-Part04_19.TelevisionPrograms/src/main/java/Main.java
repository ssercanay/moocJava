import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Name: ");
            String tvPrograms = scanner.nextLine();
            if (tvPrograms.isEmpty()) {
                break;                
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(tvPrograms, duration));
        }
        
        System.out.println("Program's maximum duration? ");
        int maxDuration = scanner.nextInt();
        for(TelevisionProgram serie: programs){
            if (serie.getDuration() <= maxDuration) {
                System.out.println(serie.getName() + ", " + serie.getDuration() + " minustes");
                
            }
        }

    }
}
