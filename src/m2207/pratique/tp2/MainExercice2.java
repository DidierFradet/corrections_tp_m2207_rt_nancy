package m2207.pratique.tp2;

/**
 * Created by Didier Fradet on 26/05/2020.
 */
public class MainExercice2 {
    // Les méthodes de la classe Integer sont majoritairement des méthodes de classe (déclarées static).
    public static void main(String[] args) {
        String chNumber = "1580";
        int x = Integer.parseInt(chNumber);
        Integer y = Integer.valueOf(chNumber);
        int z = 45789;
        String chz = Integer.toString(z);
        int u = 14526;
        System.out.println("L'entier "+ u + " s'écrit "
                + Integer.toBinaryString(u) + " sous forme binaire et "
                + Integer.toHexString(u) + " sous forme hexadécimale" );
    }
}