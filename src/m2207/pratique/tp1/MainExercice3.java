package m2207.pratique.tp1;

import java.util.Scanner;

/**
 * Created by Didier Fradet.
 */
public class MainExercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de réels à saisir ?");
        // On récupère le nombre de réels
        int n = sc.nextInt();
        // Connaissant le nombre de réels, on peut construire le tableau
        double[] tab = new double[n];
        // On alimente le tableau avec les saisies de l'utilisateur
        for (int i = 0; i < n; i++) {
            System.out.println("Saisir le réel numéro " + (i + 1));
            tab[i] = sc.nextDouble();
        }
        /*
        On ne peut pas afficher le tableau par System.out.println(tab)
        Il faut donc choisir un affichage. On choisit d'afficher le tableau
        sous la forme d'une chaine (String) : [ , , , , ]
        On va utiliser la concaténation
         */
        // On crée d'abord une chaine vide
        String strTab = "";
        /*
        On concatène chaque élément avec une virgule et un espace jusqu'à
        l'avant-dernier élément du tableau car on ne veut pas de virgule
        après le dernier.
         */
        for (int i = 0; i < tab.length - 1; i++) {
            strTab = strTab + tab[i] + ", ";
        }
        // On concatène le dernier élément
        strTab = strTab + tab[tab.length - 1];
        // On ajoute les crochets au début et à la fin
        strTab = "[" + strTab + "]";
        System.out.println(strTab);
    }
}