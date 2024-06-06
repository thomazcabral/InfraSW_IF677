package Java.OOP;

public class Encapsulation {
    private String name; // private -> restricted acess -> we need to have a get and a set function to acess it

    public String getName() { // only get method -> read-only
        return name;
    }

    public void setName(String newName) { // only set method -> write-only
        this.name = newName;
    } 
}
