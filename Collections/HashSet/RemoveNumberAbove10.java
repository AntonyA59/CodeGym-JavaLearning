import java.util.HashSet;


/* 
Plus de 10 ? Ça ne va pas marcher.
*/

public class RemoveNumberAbove10 {
    public static HashSet<Integer> creerSet() {
        HashSet<Integer> listInt = new HashSet<Integer>();
        
        for(int i = 0; i < 20; i++){
            listInt.add(i);
        }
        return listInt;
    }

    public static HashSet<Integer> supprimerNombresSuperieursA10(HashSet<Integer> ensemble) {
        HashSet<Integer> listIntUnder10 = new HashSet<Integer>();
        for(int x : ensemble){
            if(x <= 10){
                listIntUnder10.add(x);
            }
        }
        return listIntUnder10;
    }

    public static void main(String[] args) {
        HashSet<Integer> listInt = new HashSet<Integer>();
        HashSet<Integer> listIntUnder10 = new HashSet<Integer>();
        
        listInt = creerSet();
        listIntUnder10 = supprimerNombresSuperieursA10(listInt);
        
        System.out.println(listIntUnder10);
    }
}

