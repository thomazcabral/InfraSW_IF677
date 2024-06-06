package Java.Basics;

public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
        
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        String[] clubs = {"Sport", "Santa Cruz", "Náutico", "Íbis"}; // for-each loop
        for (String club : clubs) {
            System.out.println(club);
        }
    }
}
