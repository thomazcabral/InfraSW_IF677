package Java.Basics;

public class Strings {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the alphabet is " + alphabet.length());
        System.out.println("The letter K is the letter number " + (alphabet.indexOf('K') + 1) + " of the alphabet");

        String greeting = "Hello, world!";
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
    }
}
