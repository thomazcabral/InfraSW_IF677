package Java.OOP;

public class Classes {
    int x = 5; // every object will have x = 5 (attribute)
    // we could also have done this:
/*  public class Classes {
    int x;

    public Classes() { //this is called a constructor
    x = 5;
    }
...}

*/

    public static void main(String[] args) {
        // static methods can be called without creating objects (staticMethod();)
        // public methods can only be called with objects (obj.publicMethod();)
        
        Classes obj1 = new Classes(); // creating an object
        Classes obj2 = new Classes();
        System.out.println(obj1.x); // . is used to acess the object's attributes and methods
        obj2.x = 25; // values can be easily changed
        System.out.println(obj2.x);
    }
}
