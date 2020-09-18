import java.util.ArrayList;

public class Birds {
    private ArrayList<String> birdList;
    private String name;
    private String latinName;
    private int observation;
    
    public Birds(String name, String latinName){
        this.birdList = new ArrayList<>();
        this.observation = 0;
        this.name = name;
        this.latinName = latinName;
        
    }   
    
    public void Add(){
        this.birdList.add(this.name);
        this.birdList.add(this.latinName);
        
    }

    public ArrayList<String> getBirds(){
        return this.birdList;

    }  
    
    public void Observation(){
        this.observation++;
    }
    
    public int getObservation(){
        return this.observation;
    }
    

}
