import java.util.HashMap;
import java.util.Map;

public class HashMapValuesList{

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Bébé", "Bébé");
        map.put("Chat", "Chat");
        map.put("Chien", "Chien");
        map.put("Manger", "Manger");
        map.put("Nourriture", "Nourriture");
        map.put("Gevey", "Gevey");
        map.put("Câlins", "Câlins");

        imprimerCles(map);
    }

    public static void imprimerCles(Map<String, String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}