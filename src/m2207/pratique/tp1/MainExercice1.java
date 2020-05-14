package m2207.pratique.tp1;

/**
 * Created by Didier Fradet.
 */
public class MainExercice1 {
    public static void main(String[] args) {
        /*
        Il y a plusieurs façons de faire. Ici je calcule le nombre d'heures
        sachant qu'une heure contient 3600 s. Le reste qui est donc < 3600
        est à écrire en min et s.
         */
        int duree = 127452;
        int h = duree / 3600; // division entière
        int r = duree % 3600; // reste dans la division entière
        int m = r / 60;
        int s = r % 60;
        System.out.println(duree + " s : " + h + "h " + m + "min " + s + "s");
    }
}