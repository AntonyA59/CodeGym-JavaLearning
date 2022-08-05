package Arrays.ArraysList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Nombre du mois
*/

public class NumeroMois {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> month = new ArrayList<String>();
        month.add("Janvier");
        month.add("Février");
        month.add("Mars");
        month.add("Avril");
        month.add("Mai");
        
        month.add("Juin");
        month.add("Juillet");
        month.add("Août");
        month.add("Septembre");
        month.add("Octobre");
        
        month.add("Novembre");
        month.add("Décembre");

        String choice = r.readLine();

        if(month.contains(choice)){
            int monthNumber = month.indexOf(choice) + 1;
            System.out.println(choice + " est le mois numéro " + monthNumber);
        }else{
            System.out.println(choice + " n'est pas un mois");
        }
        
    }
}
