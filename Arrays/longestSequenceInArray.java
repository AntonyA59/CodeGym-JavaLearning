package Arrays;
/* 
La plus longue séquence
*/

public class longestSequenceInArray {

    public static void main(String[] args){
        int[] ArrayNumber = {8, 9, 5, 5, 5, 10, 5, 5, 5, 5, 5, 50};


        int count = 1;
        int max = 1;
        for (int i = 0; i < ArrayNumber.length - 1; i++) {
            if (ArrayNumber[i] == ArrayNumber[i+1]) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
        }



        System.out.println(count);
    }
}
