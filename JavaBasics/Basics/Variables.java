package Java.Basics;

/* Types:
- String
- int
- float
- double
- long: for numbers greater than 2 * 10**9
- char
- boolean
 */

// it's worth mentioning that the operators are the same as the c++'s

public class Variables {
    public static void main(String[] args) {
        String name = "Thomaz";
        System.out.println(name);

        int age = 19;
        System.out.println(age);

        final String club = "Sport"; // cannot be changed
        System.out.println(club);

        boolean var = true; // it is boolean instead of the normal bool

        float numFloat = 5.99f; // the f is needed so that it reads as a float
        System.out.println("The float is " + numFloat);

        // type casting
        int maxScore = 1000;
        int myScore = 854;
        float percentage = (float) myScore / maxScore * 100.0f;
        System.out.println("My percentage is: " + percentage);
    }
}
