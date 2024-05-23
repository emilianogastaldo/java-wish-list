package esercizio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> wishList = new ArrayList<>();
        File wishListText = new File("./resources/wish-list.txt");
        Scanner wishReader = new Scanner(wishListText);
        while(wishReader.hasNextLine()){
            String oldWish = wishReader.nextLine();
            wishList.add(oldWish);
        }
        wishReader.close();
        Scanner scanner = new Scanner(System.in);
//        Se inizializzo il Writer nel ciclo andrò a riscrivere ogni volta il file.
        FileWriter wishWriter = new FileWriter(wishListText, true);
        boolean stop = false;
        while (!stop){
            System.out.println("Che regalo vuoi inserire? Scrivi no per uscire");
            String regalo = scanner.nextLine();
            if(regalo.equals("no")){
                stop = true;
            }else {
                wishList.add(regalo);
                wishWriter.write(regalo+"\n");
            }
        }
        wishWriter.close();
        scanner.close();
        System.out.println(wishList.toString());
    }
}
