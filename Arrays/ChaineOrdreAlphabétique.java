package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Mission sur les algorithmes
*/

public class ChaineOrdreAlphabétique {
    public static void main(String[] args) throws Exception {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String[] tableau = new String[20];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = lecteur.readLine();
        }

        tri(tableau);

        for (String x : tableau) {
            System.out.println(x);
        }
    }

    public static void tri(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = i; j < tableau.length; j++) {
                if (estSuperieurA(tableau[i], tableau[j])) {
                    String temp = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temp;
                }
            }
        }
    }

    public static boolean estSuperieurA(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
