import java.util.HashMap;
import java.util.Map;

/* 
HashMap d'objets
*/

public class HashMapObject {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Bébé", null);
        map.put("Chat", "Chat");
        map.put("Manger", new Long(56));
        map.put("Nourriture", new Character('3'));
        map.put("Gevey", '6');
        map.put("Câlins", 111111111111L);
        map.put("Comp", (double) 123);

        //écris ton code ici
        for (Map.Entry<String, Object> paire : map.entrySet()){
            String cle = paire.getKey();                      
            Object valeur = paire.getValue();                 
            System.out.println(cle + " - " + valeur);
        }
    }
}
