
/* 
La trace de pile, revisit√©e
*/

public class TraceDePileRevisit√© {
    public static void main(String[] args) throws Exception {
        methode1();
    }

    public static String methode1() {
        methode2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String methode2() {
        methode3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String methode3() {
        methode4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String methode4() {
        methode5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String methode5() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

}
