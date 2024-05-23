package esercizio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        ArrayList<String> wishList = new ArrayList<>();
        while (!stop){
            System.out.println("Che regalo vuoi inserire? Scrivi no per uscire");
            String regalo = scanner.nextLine();
            if(regalo.equals("no")){
                stop = true;
            }else {
                wishList.add(regalo);
            }
        }
        System.out.println(wishList.toString());
    }
}
