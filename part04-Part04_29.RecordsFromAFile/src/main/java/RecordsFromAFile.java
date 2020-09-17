
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        try (Scanner readFile = new Scanner(Paths.get(fileName))){
            while (readFile.hasNextLine()){
                String line = readFile.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                System.out.println(name + ", " + age + " years");
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
