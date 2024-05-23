package esercizio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

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
        boolean stop = false;
        while (!stop){
            System.out.println("Lunghezza lista: "+wishList.toArray().length);
            System.out.println("Che regalo vuoi inserire? Scrivi no per uscire");
            String regalo = scanner.nextLine();
            if(regalo.equals("no")){
                stop = true;
//                Ordino la lista
                Collections.sort(wishList);
//                Riscrivo il file con la lista ordinata:
                FileWriter wishWriter = new FileWriter(wishListText);
                for (String wish : wishList) {
                    wishWriter.write(wish+"\n");
                }
                wishWriter.close();
            }else {
                wishList.add(regalo);
            }
        }
        scanner.close();
        System.out.println(wishList);
    }
}
