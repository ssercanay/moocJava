
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals(Object compared){

        Person comparedTwins = (Person) compared;
        if (this.name.equals(comparedTwins.name) &&
            this.birthday.equals(comparedTwins.birthday) &&
            this.height == comparedTwins.height &&
            this.weight == comparedTwins.weight) {
            return true;
            
        }
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
