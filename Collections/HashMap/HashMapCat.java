

import java.util.HashMap;
import java.util.Map;

public class HashMapCat{

    public static void main(String[] args) throws Exception {
        String[] chats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Chat> map = ajouterChatsAMap(chats);

        for (Map.Entry<String, Chat> paire : map.entrySet()) {
            System.out.println(paire.getKey() + " - " + paire.getValue());
            
        }
    }


    public static HashMap<String, Chat> ajouterChatsAMap(String[] chats) {
        HashMap<String, Chat> map = new HashMap<String, Chat>();
        
        for(int i = 0; i < chats.length; i++){
            map.put(chats[i], new Chat(chats[i]));
        }
        return map;

    }


    public static class Chat {
        String nom;

        public Chat(String nom) {
            this.nom = nom;
        }

        @Override
        public String toString() {
            return nom != null ? nom.toUpperCase() : null;
        }
    }
}