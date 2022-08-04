package Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Temps pour 10 000 appels get
*/

public class TempEnMs10000Get {
    public static void main(String[] args) {
        System.out.println(obtenirTempsObtentionEnMs(remplir(new ArrayList())));
        System.out.println(obtenirTempsObtentionEnMs(remplir(new LinkedList())));
    }

    public static List remplir(List liste) {
        for (int i = 0; i < 10000; i++) {
            liste.add(new Object());
        }
        return liste;
    }

    public static long obtenirTempsObtentionEnMs(List liste) {
        Date date1 = new Date();
        obtenir10000(liste);
        Date date2 = new Date();
        return date2.getTime() - date1.getTime();        
    }

    public static void obtenir10000(List liste) {
        if (liste.isEmpty()) {
            return;
        }
        int x = liste.size() / 2;

        for (int i = 0; i < 10000; i++) {
            liste.get(x);
        }
    }
}
