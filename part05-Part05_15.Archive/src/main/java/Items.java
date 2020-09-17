/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sercan
 */
public class Items {
    private String identifier;
    private String name;
    
    public Items(String id, String name){
        this.identifier = id;
        this.name = name;
    }
    
    public String getId(){
        return this.identifier;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }        

        if (compared instanceof Items) {
            Items itemCompared = (Items) compared;
            if (this.identifier.equals(itemCompared.identifier)) {
                return true;
            }
        }

        return false;
    }    
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
}
