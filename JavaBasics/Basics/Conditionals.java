package Java.Basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        int x = 19;
        int y = 21;
        
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is equal to y");
        }

        Scanner scanner = new Scanner(System.in);  // initializing the input
        System.out.print("Type the current time (hours only): "); // text to the input
        int time = scanner.nextInt(); // reading the input
        scanner.close(); // not leaking memory :)
        
        System.out.println((time < 18) ? "Good day!" : "Good evening!");

        int num = 3;
        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }
    }
}
