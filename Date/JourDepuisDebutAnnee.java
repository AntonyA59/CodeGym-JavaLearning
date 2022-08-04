import java.util.Date;




public class JourDepuisDebutAnnee {
    public static void main(String[] args) throws Exception
    {
        Date dateDebutAnnee = new Date();
        dateDebutAnnee.setHours(0);
        dateDebutAnnee.setMinutes(0);
        dateDebutAnnee.setSeconds(0);
    
        dateDebutAnnee.setDate(1);      // Premier jour du mois
        dateDebutAnnee.setMonth(0);     // Janvier (les indices des mois vont de 0 à 11)
    
        Date heureActuelle = new Date();
        long differenceTempsMs = heureActuelle.getTime() - dateDebutAnnee.getTime();
        long msJour = 24 * 60 * 60 * 1000;  // Le nombre de millisecondes dans 24 heures
    
        int nombreJours = (int) (differenceTempsMs/msJour); // Le nombre de jours complets
        System.out.println("Jours depuis le début de l'année : " + nombreJours);
    }
}
