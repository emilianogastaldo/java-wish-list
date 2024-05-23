package bonus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola");
//        Recupero la parola
        String parola = scanner.nextLine().trim().toLowerCase();
//        La trasformo in un array
        String[] arrayCaratteri = parola.split("");
//        Creo il Map per salvare i risultati
        HashMap<String, Integer> risultato = new HashMap<>();
//        Ciclo le lettere della parola
        for (String lettera : arrayCaratteri) {
//            Se ho già la chiave aumento il contatore, altrimenti lo creo nuovo
            if (risultato.containsKey(lettera)) {
                risultato.put(lettera, risultato.get(lettera) + 1);
            } else {
                risultato.put(lettera, 1);
            }
//            Versione PRO
//            risultato.put(lettera, risultato.containsKey(lettera) ? risultato.get(lettera) + 1 : 1);
        }
//        Stampo il risultato
        System.out.println(risultato);

    }
}
