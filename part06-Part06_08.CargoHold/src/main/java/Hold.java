import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
       
    public Hold(int weight){
        this.maximumWeight = weight;
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight + suitcase.totalWeight() <= maximumWeight){
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
            suitcases.add(suitcase);
                        
        }        
    }
    
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        for (int i = 0; i < suitcases.size(); i++) {
            suitcases.get(i).printItems();
        }
    }    
    
    public String toString(){
        return suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
