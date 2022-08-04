import java.util.HashMap;
import java.util.Map;

/* 
Réservé aux riches
*/

public class ReserveAuRiche {
    public static HashMap<String, Integer> creerMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Test1", 1500);
        map.put("Test2", 1500);
        map.put("Test3", 1500);
        map.put("Test4", 1500);
        map.put("Test5", 200);

        map.put("Test6", 200);
        map.put("Test7", 200);
        map.put("Test8", 200);
        map.put("Test9", 1500);
        map.put("Test10", 1500);
        return map;
    }

    public static void supprimerElementMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copie = new HashMap<String, Integer>(map);

        for (Map.Entry<String, Integer> paire : copie.entrySet()) {
            if (paire.getValue() < 500) {
                map.remove(paire.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map = creerMap();
        supprimerElementMap(map);
        System.out.println(map);
    }
}
