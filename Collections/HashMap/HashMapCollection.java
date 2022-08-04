import java.util.HashMap;
import java.util.Map;

public class HashMapCollection{

    public static void main(String[] args) {
        HashMap<String, String> plantes = new HashMap<String, String>();
        plantes.put("pastèque", "melon");
        plantes.put("banane", "fruit");
        plantes.put("cerise", "fruit");
        plantes.put("poire", "fruit");
        plantes.put("melon", "melon");
        
        plantes.put("mûre", "fruit");
        plantes.put("ginseng", "racine");
        plantes.put("fraise", "fruit");
        plantes.put("iris", "fleur");
        plantes.put("pomme de terre", "tubercule");
        
        for(Map.Entry<String, String> pairePlante : plantes.entrySet()){
            String cle = pairePlante.getKey();
            String valeur = pairePlante.getValue();
            System.out.println(cle + " - " + valeur);
        }
    }
}