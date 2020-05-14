package m2207.pratique.tp1;

/**
 * Created by Didier Fradet.
 */
public class MainExercice2 {
    public static void main(String[] args) {
        for (int i = 3; i < 9; i++) {
            System.out.println("le carré de " + i + " est : " + i * i);
            /*
            Pour calculer une puissance plus importante que le carré,
            il faudrait utiliser la méthode de classe (static) pow
            de la classe Math. Par exemple pour calculer x à la puissance 5
            ce serait Math.pow(x,5)
             */

            /*
            Ou bien si l'on veut écrire sur une seule ligne :
            System.out.print(i*i + " ");
            */
        }
    }
}