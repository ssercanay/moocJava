import java.util.Scanner;

public class Statistics {
    private int passed;
    private int sum;
    private Scanner scan;
    
    public Statistics(){
        this.passed = 0;
        this.sum = 0;
    }
    
    public void Sum(int point){
        this.sum = this.sum + point;
        
    }
    
    public int getAll(){
        return this.sum;
    }
    
    public void Passed(int point){
        this.passed = this.passed + point;
        
    }
    
    public int getPassed(){
        return this.passed;
    }    
}
