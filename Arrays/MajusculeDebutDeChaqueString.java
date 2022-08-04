package Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Expansion nationale
*/

public class MajusculeDebutDeChaqueString {
    public static void main(String[] args) throws IOException {
        BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));
        String s = lecteur.readLine();

        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            sb.append(c);
        }
        System.out.println(sb);
    }
}
