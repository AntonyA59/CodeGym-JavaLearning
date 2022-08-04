import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;


/* 
La gentille Emma et les vacances d'été
*/

public class HashMapBirthday {
    public static HashMap<String, Date> creerMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Danny", df.parse("SEPTEMBER 1 1980"));
        map.put("Rudolph", df.parse("JULY 1 1980"));
        map.put("Henri", df.parse("OCTOBER 1 1980"));
        map.put("Charles", df.parse("FEBRUARY 1 1980"));
        
        map.put("Kate", df.parse("AUGUST 1 1980"));
        map.put("Francis", df.parse("JUNE 1 1980"));
        map.put("Jane", df.parse("JANUARY 1 1980"));
        map.put("Tintin", df.parse("JUNE 1 1980"));
        map.put("Robert", df.parse("JUNE 1 1980"));

        return map;
    }

    public static void supprimerToutesPersonnesEte(HashMap<String, Date> map) {
        HashMap<String, Date> copy = new HashMap<>(map);

        for(String key : copy.keySet()){
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if(month == 6 || month == 7 || month == 8){
                map.remove(key);
            }

        }

    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map =creerMap();
        supprimerToutesPersonnesEte(map);
        System.out.println(map);

    }
}
