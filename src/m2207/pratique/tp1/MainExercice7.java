package m2207.pratique.tp1;

import java.util.ArrayList;

/**
 * Created by Didier Fradet on 18/05/2020.
 */
public class MainExercice7 {
    public static void main(String[] args) {
        int n = 301;
        /*
        On rappelle qu'un entier n est premier s'il possède exactement deux diviseurs. Par exemple
        2, 3, 7, 7, 11, 13, 17, ... sont premiers. Un nombre qui n'est pas premier est dit
        composé et un nombre composé n possède au moins un diviseur premier inférieur à
        la racine carrée de n. Exemple avec n = 55 qui se décompose en 55 = 5*11. 5 est premier et
        inférieur à la racine carrée de 55.
        Si n = a*b, avec a <= b, alors a <= racine carrée de n et b est aussi un diviseur.
        On crée un tableau de booléens que l'on initialise à true et on ne s'occupera pas de t[0].
        Si i est un nombre composé, c'est à dire un multiple, on mettra t[i] = false
         */
        boolean[] t = new boolean[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = true;
        }
        // 1 n'est pas un entier premier
        t[1] = false;
        /*
        Au vu du rappel, il suffit de faire les calculs jusqu'à la partie entière
        de la racine carrée de n.
         */
        int limite = (int) Math.sqrt(n);
        for (int i = 2; i <= limite; i++) {
            /*
            Si t[i] est premier, on raye les multiples de i en faisant t[k*i] = false
            à partir de k = 2 jusqu'à k*i<n
             */
            if (t[i]) {
                int k = 2;
                while (k * i < n) {
                    t[k * i] = false;
                    k = k + 1;
                }
            }
        }
        // Pour faciliter l'affichage, on crée une ArrayList de nombres premiers que l'on remplit dans la boucle
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < t.length; i++) {
            if (t[i]) {
                list.add(i);
            }
        }
        // On affiche la liste des entiers premiers
        System.out.println("Liste des nombres premiers inférieurs à " + (n - 1));
        System.out.println(list);
    }
}