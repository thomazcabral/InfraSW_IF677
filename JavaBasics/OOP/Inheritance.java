package Java.OOP;

class Inheritance {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Inheritance { // gets the infomation from the Inheritance class
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car(); // creating an object
        myCar.honk(); // using a method from the other class in an object from this class
        System.out.println(myCar.brand +  " " + myCar.modelName); // usinf the protected string from the other class here
    }
}