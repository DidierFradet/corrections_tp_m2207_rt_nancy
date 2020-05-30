package m2207.pratique.tp2;

/**
 * Created by Didier Fradet on 26/05/2020.
 */
public class MainExercice1 {
    /*
    Il s'agit tout simplement de regarder la documentation des API Java pour la classe String.
    Il faut être vigilent pour une méthode qui peut être :
    - de classe (static). Elle s'utilise alors par NomClasse.nomMethode(...)
    - d'instance. Elle s'utilise alors sur une instance par nomInstance.nomMethode(...)
    Il faut être également vigilent sur le type de retour
     */
    public static void main(String[] args) {
        String ch = "Before you start coding, it’s a good idea to sit down and think about your problem";
        System.out.println("La taille de la chaine est " + ch.length());
        System.out.println("Le premier caractère est  " + ch.charAt(0));
        System.out.println("Le dernier caractère est  " + ch.charAt(ch.length() - 1));
        System.out.println("La chaine en majuscule : ");
        System.out.println(ch.toUpperCase());
        /*
        Pour faire afficher le caractère guillemet (ou double quote)" dans une chaine de caractères
        encadrée elle-même par un guillemet ouvrant et un guillemet fermant, je dois l'échapper
        en écrivant \" pour qu'il ne soit pas interprété comme un guillemet fermant la chaine.
         */
        System.out.println("La première position du \"r\" est " + ch.indexOf('r'));
        char [] tab = ch.toCharArray();
        int compteur = 0;
        // Pour parcourir le tableau, j'utilise une boucle de type for each.
        for (char c : tab) {
            // je compare deux types primitifs (char) avec ==
            if (c == 'a'){
                compteur = compteur + 1;
            }
        }

        System.out.println("Le nombre de \"a\" dans la chaine est : " + compteur);

    }
}