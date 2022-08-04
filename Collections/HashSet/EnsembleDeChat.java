import java.util.HashSet;
import java.util.Set;

/* 
Ensemble de chats
*/

public class EnsembleDeChat {
    public static void main(String[] args) {
        Set<Chat> chats = creerChats();


        chats.remove(chats.toArray()[0]);

        imprimerChats(chats);
    }

    public static Set<Chat> creerChats() {
        Set<Chat> chats= new HashSet<Chat>();
        Chat chat1 = new Chat();
        Chat chat2 = new Chat();
        Chat chat3 = new Chat();
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);
        
        
        return chats;
    }

    public static void imprimerChats(Set<Chat> chats) {
        for(Chat chat : chats){
            System.out.println(chat);
        }
    }


    public static class Chat {
        
        public Chat(){
            
        }
    }
}

