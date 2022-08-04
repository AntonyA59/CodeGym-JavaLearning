import java.util.HashMap;
import java.util.Random;

/* 
Recensement
*/

public class RecensementNomPrenom {
    public static HashMap<String, String> creerMap() {
        Random random = new Random();
        String[] nom = {"Boon", "Dupond", "Haddock", "Wilson", "Smith", "Jones", "Brown", "Miller", "Jackson" , "Anderson"};
        String[] prenom = {"Danny", "Rudolph", "Tintin", "Henri", "Charles", "Francis", "Jane", "Kate"};
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < 10; i++){
            map.put(nom[i], prenom[random.nextInt(0, prenom.length)]);
        }
        return map;
    }

    public static int obtenirNombrePrenomsIdentiques(HashMap<String, String> map, String prenom) {
        int count = 0;
        for(String value : map.values()){
            if(value.equals(prenom)){
                count++;
            }
        }
        return count;

    }

    public static int obtenirNombreNomsIdentiques(HashMap<String, String> map, String nom) {
        int count = 0;
        for(String value : map.keySet()){
            if(value.equals(nom)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {


    }
}
