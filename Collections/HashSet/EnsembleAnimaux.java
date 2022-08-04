import java.util.HashSet;
import java.util.Set;

/* 
Ensemble d'animaux
*/

public class EnsembleAnimaux {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();
        Set<Chien> chiens = creerChiens();

        Set<Object> animaux = jointure(chats, chiens);

        imprimerAnimaux(animaux);
        System.out.println();
        supprimerChats(animaux, chats);
        imprimerAnimaux(animaux);
    }

    public static Set<Chat> creerChats() {
        HashSet<Chat> resultat = new HashSet<Chat>();

        resultat.add(new Chat());
        resultat.add(new Chat());
        resultat.add(new Chat());
        resultat.add(new Chat());


        return resultat;
    }

    public static Set<Chien> creerChiens() {
        HashSet<Chien> resultat = new HashSet<Chien>();
        
        resultat.add(new Chien());
        resultat.add(new Chien());
        resultat.add(new Chien());
        return resultat;
    }

    public static Set<Object> jointure(Set<Chat> chats, Set<Chien> chiens) {
        HashSet<Object> jointure = new HashSet<Object>();
        jointure.addAll(chats);
        jointure.addAll(chiens);

        
        return jointure;
    }

    public static void supprimerChats(Set<Object> animaux, Set<Chat> chats) {
        animaux.removeAll(chats);
    }

    public static void imprimerAnimaux(Set<Object> animaux) {
        for(Object animal : animaux){
            System.out.println(animal);
        }
    }

    public static class Chat{
        public Chat() {
            
        }
    }
    public static class Chien{
        public Chien() {
            
        }
    }
}
