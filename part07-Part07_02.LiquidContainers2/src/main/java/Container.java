
public class Container {
    private int amount;
    private int capacity;
    
    public Container(){
        this.amount = 0;
        this.capacity = 0;
    }
    
    public int contains(){

        return this.capacity;
    }
    
    public void add(int amount){
        if (amount > 0) {
            this.capacity = this.capacity + amount;
            if (this.capacity > 100) {
                this.capacity = 100;
            }
        }
    }
    
    public void remove(int amount){
        if (amount > 0) {
          this.capacity = this.capacity - amount;
            if (this.capacity < 0) {
                this.capacity = 0;
            }  
        }
    
    }
    
    public String toString(){
        return this.capacity + "/100";
    }
    
}
