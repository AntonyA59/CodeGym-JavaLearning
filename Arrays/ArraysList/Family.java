package Arrays.ArraysList;

import java.util.ArrayList;
import java.util.Collections;

/* 
Créons une famille
*/

public class Family {
    public static void main(String[] args) {

        Humain enfant1 = new Humain("Test7", false, 5);
        Humain enfant2 = new Humain("Test8", true, 3);
        Humain enfant3 = new Humain("Test9", true, 1);    

        Humain pere = new Humain("Test5", true, 25, enfant1, enfant2, enfant3);
        Humain mere = new Humain("Test6", false, 25, enfant1, enfant2, enfant3);
        
        Humain grandmMere1 = new Humain("Test3", false, 58, pere);
        Humain grandMere2 = new Humain("Test4", false, 58, mere);

        Humain grandPere1 = new Humain("Test1", true, 58, pere);
        Humain grandPere2 = new Humain("Test2", true, 58, mere);

        System.out.println(grandPere1);
        System.out.println(grandmMere1);

        System.out.println(grandPere2);
        System.out.println(grandMere2);
        
        System.out.println(pere);
        System.out.println(mere);
        
        System.out.println(enfant1);
        System.out.println(enfant2);
        System.out.println(enfant3);
    }

    public static class Humain {
        String nom;
        boolean sexe;
        int age;
        ArrayList<Humain> enfants = new ArrayList<Humain>();

        public Humain(String nom, boolean sexe, int age){
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
        }

        public Humain(String nom, boolean sexe, int age, Humain... enfant){
            this.nom = nom;
            this.sexe = sexe;
            this.age = age;
            Collections.addAll(this.enfants, enfant);
        }

        public String toString() {
            String texte = "";
            texte += "Nom : " + this.nom;
            texte += ", sexe : " + (this.sexe ? "masculin" : "féminin");
            texte += ", âge : " + this.age;

            int nombreEnfants = this.enfants.size();
            if (nombreEnfants > 0) {
                texte += ", enfants : " + this.enfants.get(0).nom;

                for (int i = 1; i < nombreEnfants; i++) {
                    Humain enfant = this.enfants.get(i);
                    texte += ", " + enfant.nom;
                }
            }
            return texte;
        }
    }

}
