import java.util.Calendar;





public class JourDepuisDebutAnnee {
    public static void main(String[] args) throws Exception
    {
        Calendar dateDebutAnnee = Calendar.getInstance();
        dateDebutAnnee.set(dateDebutAnnee.get(Calendar.YEAR), 0, 1, 0, 0, 0);

    
        Calendar heureActuelle = Calendar.getInstance();
        long differenceTempsMs = heureActuelle.getTimeInMillis() - dateDebutAnnee.getTimeInMillis();
        long msJour = 24 * 60 * 60 * 1000;  // Le nombre de millisecondes dans 24 heures
    
        int nombreJours = (int) (differenceTempsMs/msJour); // Le nombre de jours complets
        System.out.println("Jours depuis le début de l'année : " + nombreJours);
    }
}
