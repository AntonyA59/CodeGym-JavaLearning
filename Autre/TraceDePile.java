
/*
Renvoyer la trace d'une pile
Écrire cinq méthodes qui font appel l'une à l'autre.
Chaque méthode doit renvoyer sa trace de pile. 
*/
public class TraceDePile {
    public static void main(String[] args) throws Exception {
        methode1();
    }

    public static StackTraceElement[] methode1() {
        methode2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] methode2() {
        methode3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] methode3() {
        methode4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] methode4() {
        methode5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements;
    }

    public static StackTraceElement[] methode5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement element : stackTraceElements){
            System.out.println(element.getMethodName());
        }
        return stackTraceElements;
    }
}