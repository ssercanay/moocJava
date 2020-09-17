import java.util.Scanner;

public class UserInterface {
    private TodoList todos;
    private Scanner scan;
    
    public UserInterface(TodoList todo, Scanner scan){
        this.todos = todo;
        this.scan = scan;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if(command.equals("add")){
                System.out.print("To add: ");
                String task = scan.nextLine();
                todos.add(task);
            } else if(command.equals("list")){
                todos.print();
            } else if(command.equals("remove")){
                System.out.println("Which one is removed? ");
                int toRemove = Integer.valueOf(scan.nextLine());
                todos.remove(toRemove);
            }
        }
        
    }
}
