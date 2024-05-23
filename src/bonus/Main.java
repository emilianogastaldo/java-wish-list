package bonus;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola");
        String parola = scanner.nextLine().trim().toLowerCase();
        String[] arrayCaratteri = parola.split("");
        System.out.println(Arrays.toString(arrayCaratteri));
    }
}
