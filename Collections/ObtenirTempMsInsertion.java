package Collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Temps pour 10 000 insertions
*/

public class ObtenirTempMsInsertion {
    public static void main(String[] args) {
        System.out.println(obtenirTempsInsertionEnMs(new ArrayList()));
        System.out.println(obtenirTempsInsertionEnMs(new LinkedList()));
    }

    public static long obtenirTempsInsertionEnMs(List liste) {
        Date date1 = new Date();
        inserer10000(liste);
        Date date2 = new Date();
        return date2.getTime() - date1.getTime();
    }

    public static void inserer10000(List liste) {
        for (int i = 0; i < 10000; i++) {
            liste.add(0, new Object());
        }
    }
}
