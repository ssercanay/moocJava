import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scan;
    private Statistics statistics;
    
    
    public UserInterface(Statistics statistics, Scanner scan){
        this.scan = scan;
        this.statistics = statistics;
        
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        int counter = 0;
        int passed = 0;
        ArrayList<Integer> grade = new ArrayList<>();
        
        while(true){
            int point = Integer.valueOf(scan.nextLine());
            
            if (point == -1) {
                break;
            }
            
            if (point >= 50 && point <= 100) {            
                statistics.Passed(point);
                passed++;                
            }
            
            if (point >= 0 && point <= 100) {                
                statistics.Sum(point);
                counter++;                
            }
            if (point >= 0 && point < 50) {
                grade.add(0);
            } else if (point >= 50 && point < 60) {
                grade.add(1);
            } else if (point >= 60 && point < 70) {
                grade.add(2);
            } else if (point >= 70 && point < 80) {
                grade.add(3);
            } else if (point >= 80 && point < 90) {
                grade.add(4);
            } else if (point >= 90 && point < 100){
                grade.add(5);
            }
        
            
            

            
        }
        
        double avgAll = (statistics.getAll() * 1.0) / counter;
        double avgPassed = (statistics.getPassed() * 1.0) / passed;
        double passingPercentage = (100.0 * passed) / counter;
        
        System.out.println("Point average (all): " + avgAll);
        System.out.println("Point average (passing): " + avgPassed);
        System.out.println("Pass percentage: " + passingPercentage);
        
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grade,i));
        }        
    }
    
          
        
    
    
     public String stars(ArrayList<Integer> grades, int number) {
        String star = "";

        for (Integer grade : grades) {
            if(grade==number) {
                star+="*";
            }
        }
        return star;
    }   
        
        

}
