package m2207.pratique.tp1;

/**
 * Created by Didier Fradet.
 */
public class MainExercice4 {
    public static void main(String[] args) {
        // On pourrait demander à l'utilisateur de saisir jour, mois et année
        int j = 26, m = 1, a = 2017;
        int t, b;
        // Pour le calcul de t et b, on remarque que les conditions sont les mêmes (m<=2)
        if (m <= 2) {
            t = m + 10;
            b = a - 1;
        } else {
            t = m - 2;
            b = a;
        }

        /*
        Pour le calcul de t et b, on aurait pu utiliser l'opérateur ternaire :
        type result  = expression booléenne ? result 1 : result 2;
        Si expression booléenne est vraie, result vaut result 1, sinon result 2
        Ici, cela donnerait :
        int t = m <= 2 ? m + 10 : m - 2;
        int b = m <= 2 ? a - 1 : a;
         */

        /*
        On rappelle que si x et y sont deux entiers de type int, alors x/y
        (de même que x+y, x-y et x*y) est un entier. Donc dans ce cas,
        la partie entière de x/y est tout simplement x/y
         */
        int c = b / 100;
        int d = b - 100 * c;
        /*
        Pour obtenir la partie entière d'un réel, le plus simple est de
        faire un cast du réel (double ou float) en un int. Exemple :
        int n = (int) 14,345 donnera pour n la valeur 14
         */
        int w = j + (int) (2.6 * t - 0.2) + d + d / 4 + c / 4 + 5 * c;
        int n = w % 7;
        String jour;
        // on utilise un switch case pour le jour en écriture littéral
        switch (n) {
            case 0:
                jour = "dimanche";
                break;
            case 1:
                jour = "lundi";
                break;
            case 2:
                jour = "mardi";
                break;
            case 3:
                jour = "mercredi";
                break;
            case 4:
                jour = "jeudi";
                break;
            case 5:
                jour = "vendredi";
                break;
            default:
                jour = "samedi";
                break;
        }
        System.out.println("Le " + j + "/" + m + "/" + a + " est un " + jour);
    }
}