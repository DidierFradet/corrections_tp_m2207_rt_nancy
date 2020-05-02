package m2207.pratique.tp1;

/**
 * Created by Didier Fradet on 01/05/2020.
 */
public class MainExercice1 {
    public static void main(String[] args) {
        int duree = 127452;
        int h = duree / 3600;
        int r = duree % 3600;
        int m = r / 60;
        int s = r % 60;
        System.out.println(duree +" s : " + h + "h " + m + "min " + s + "s");
    }
}