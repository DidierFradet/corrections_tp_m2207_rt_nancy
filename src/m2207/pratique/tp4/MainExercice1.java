package m2207.pratique.tp4;

/**
 * Created by Didier Fradet on 15/06/2020.
 */
public class MainExercice1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println("Le résultat de la division de " + a + " par " + b + " est : " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Exception arithmétique : " + e.getMessage());
        }
        System.out.println("FIN");
    }
}