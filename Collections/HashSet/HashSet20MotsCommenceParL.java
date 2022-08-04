import java.util.Set;
import java.util.HashSet;

/* 
20 mots qui commencent par la lettre « L »
*/

public class HashSet20MotsCommenceParL {
    public static Set<String> creerSet() {
        HashSet<String> set = new HashSet<String>();
        
        for(int i = 0; i < 20; i++){
            set.add("L n°" + (i+1));
        }

        return set;

    }

    public static void main(String[] args) {
        System.out.println(creerSet()); 
    }
}
