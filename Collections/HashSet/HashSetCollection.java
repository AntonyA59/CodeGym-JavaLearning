
/* 
HashSet de plantes
*/

import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) throws Exception {
        HashSet<String> plantes = new HashSet<String>();
        plantes.add("pastèque");
        plantes.add("banane");
        plantes.add("cerise");
        plantes.add("poire");
        plantes.add("melon");
        plantes.add("mûre");
        plantes.add("ginseng");
        plantes.add("fraise");
        plantes.add("iris");
        plantes.add("pomme de terre");
        
        for(String plante : plantes){
            System.out.println(plante);
        }
        

    }
}
