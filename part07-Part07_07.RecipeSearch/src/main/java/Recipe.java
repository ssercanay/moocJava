import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
       
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setCookingTime(int time){
        this.cookingTime = time;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public void setIngredient(String ingredient){
       
        this.ingredients.add(ingredient);
       
    }

    public ArrayList<String> getIngredient(){
        return this.ingredients;

    }    
    
    public void printList(){
        System.out.println("Recipes:");
        System.out.println(this.name + ", " + "cooking time: " + this.cookingTime);                
    }
}