import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> values;
    
    public Stack(){
        this.values = new ArrayList<>();
        
    }
    
    public boolean isEmpty(){
        if (this.values.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.values.add(value);
    }
    
    public ArrayList<String> values(){
        
            return values;                
    }
    
    
    
    public String take(){
        
        System.out.println(this.values.get(values.size()-1));

        return this.values.remove(values.size()-1);
    }
}
