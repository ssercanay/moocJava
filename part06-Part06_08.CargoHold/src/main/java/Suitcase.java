import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.totalWeight = 0;
    }    

    public void addItem(Item item){
        if(this.totalWeight + item.getWeight() <= maxWeight){
            this.totalWeight = this.totalWeight + item.getWeight();
            items.add(item);
                        
        }
        //System.out.print(totalWeight);
    }
    
    public int totalWeight(){
        return this.totalWeight;
    }
    
    public void printItems(){
        System.out.println("The suitcase contains the following items:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
    
    public Item heaviestItem(){
        
        if (items.isEmpty()) {
            return null;
        }         
        Item heaviest = items.get(0);
        for (int i = 0; i < items.size(); i++) {
            if (heaviest.getWeight() < items.get(i).getWeight()) {
                heaviest = items.get(i);
            }
        }      
        return heaviest;
        
    }

        
    public String toString(){
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if(items.size() == 1){
            return "1 item (" + this.totalWeight + " kg)";
            
        }
        
        return items.size() + " items (" + this.totalWeight + " kg)";
        
    }

    
}
