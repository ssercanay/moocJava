import java.util.ArrayList;

public class Room {
    private ArrayList<Person> records;
    
    public Room(){
        this.records = new ArrayList<>();
    }
    
    public void add(Person person){
        records.add(person);
    }
    
    public boolean isEmpty(){
        if (records.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return records;
    }
    
    public Person shortest(){
        if (this.records.isEmpty()) {
            return null;
        }
        Person shortest = records.get(0);
        for(Person person: records){
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;                
            }
        }
        
        return shortest;
    }

    public Person take(){
        if (this.records.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.shortest();
        this.records.remove(shortestPerson);
        return shortestPerson;
    }
        
}
