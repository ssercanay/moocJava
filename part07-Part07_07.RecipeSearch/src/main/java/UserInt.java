
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
        
public class UserInt {
    private ArrayList<Recipe> recipes;
    private ArrayList<String> lines;
    
    public UserInt(){
        this.recipes = new ArrayList<>();
        this.lines = new ArrayList<>();                       
    }
    
    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Files to read:");
        String read = scan.nextLine();
        readPath(read);
               
        while(true){
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.print("Enter command: ");
            String command = scan.nextLine();
            
            if (command.equals("list")) {
                for (Recipe recipe:this.recipes) {
                    recipe.printList();
                }           
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String findRecipe = scan.nextLine();
                for (Recipe recipe:this.recipes) {
                    if (recipe.getName().contains(findRecipe)) {
                        recipe.printList();
                    }
                }           
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scan.nextLine());
                for (Recipe recipe:this.recipes) {
                    if (recipe.getCookingTime() <= maxCookingTime) {
                        recipe.printList();
                    }
                }           
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String findByIngredient = scan.nextLine();

                for (Recipe recipe:this.recipes) {
                    for (String ingredient:recipe.getIngredient()) {
                        if (ingredient.equals(findByIngredient)) {
                            recipe.printList();
                        break;
                        }                    
                    }

                }           
            }
            
            if (command.equals("stop")) {
                break;
            }
        }
    }
    
    public void readPath(String file){        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            // read all the lines of the file
            while (fileReader.hasNextLine()) {
                this.lines.add(fileReader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        String recipeName;
        int cookingTime;        
        int i = 0;
        int k = 0;
        
        while(i < lines.size()) {                               
            recipeName = lines.get(i++);
            cookingTime = Integer.valueOf(lines.get(i++));
            recipes.add(new Recipe(recipeName,cookingTime));
            
            while(i != lines.size()){
                if (lines.get(i).isEmpty()) {
                    break;
                }                
                recipes.get(k).setIngredient(lines.get(i));
                i++;               
            }    
            i++;
            k++;
        }                
    }

}
