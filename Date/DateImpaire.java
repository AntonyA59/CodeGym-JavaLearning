import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* 
Travail avec les dates
*/

public class DateImpaire {
    public static void main(String[] args)throws ParseException {
        System.out.println(dateImpaire("MAY 2 2013"));
    }

    public static boolean dateImpaire(String date)throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();

        cal.setTime(df.parse(date));
        int day = cal.get(Calendar.DAY_OF_YEAR);
        if(day % 2 == 0){
            return false;
        }else{

            return true;
        }
    }
}
