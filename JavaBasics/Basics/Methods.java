package Java.Basics;

import java.util.Scanner;

public class Methods {
    public static int intInput(Scanner scanner, String phrase) {
        
        System.out.print(phrase);
        return scanner.nextInt();
    }

    public static void helloWorld() {
        System.out.println("Hello, world!");
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = intInput(scanner, "Type a number: ");
        for (int i = 0; i < num; i++){
            helloWorld();
        }

        int num_fact = intInput(scanner, "Type another number: ");
        System.out.println("The factorial of " + num_fact + " is " + factorial(num_fact));
    }
}
