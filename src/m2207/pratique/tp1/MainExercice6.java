package m2207.pratique.tp1;

/**
 * Created by Didier Fradet on 18/05/2020.
 */
public class MainExercice6 {
    public static void main(String[] args) {
        /*
        On rappelle que si a et b sont des entiers, a%b est le reste dans la division entière de a par b. Donc
        a est divisible par b si le reste a%b est nul.
         */
        for (int n = 2; n < 9001; n = n + 1) {
            // Pour chaque n, on somme les diviseurs d'où l'initialisation de s à 0
            int s = 0;
            // On cherche tous les diviseurs de n compris entre 1 et n - 1 (on peut trouver plus performant)
            for (int i = 1; i < n; i = i + 1) {
                if (n % i == 0) {
                    // Si i est un diviseur, on l'ajoute à s
                    s = s + i;
                }
            }
            // On teste si  la somme des diviseurs stricts vaut n
            if (s == n) {
                System.out.println(n + " est un entier parfait");
            }
        }
        
    }
}