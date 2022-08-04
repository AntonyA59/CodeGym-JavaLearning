package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseArray{

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] tableau = new int[5];

        for(int i = 0; i < tableau.length; i++){
            tableau[i] = Integer.parseInt(r.readLine());
        }

        tri(tableau);

        for (int i : tableau) {
            System.out.println(i);
        }

    }

    public static void tri(int[] tableau) {
        for(int i = 0; i < tableau.length; i++){
            for(int j = i; j < tableau.length; j++){
                if(tableau[i] < tableau[j]){
                    int temp = tableau[i];
                    tableau[i] = tableau[j];
                    tableau[j] = temp;
                }
            }
        }
    }
}