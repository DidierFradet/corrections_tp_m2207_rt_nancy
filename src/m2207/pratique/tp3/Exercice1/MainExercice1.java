package m2207.pratique.tp3.Exercice1;

/**
 * Created by Didier Fradet on 03/06/2020.
 */
public class MainExercice1 {
    public static void main(String[] args) {
        Personne p1 = new Personne("Martin","Olivia");
        /*
        On peut utiliser System.out.println(p1) à la place de
        System.out.println(p1.toString()) car l'appel à la méthode toString()
        est sous-entendu. C'est ce qui sera fait par la suite.
         */
        System.out.println(p1.toString());
        Personne p2 = new Personne("Durand","Jean", "jeannot");
        System.out.println(p2);
        Personne p3 = new Personne("Dupont","Michel", "mimich");
        System.out.println(p3);
        p3.setSurnom("renard");
        System.out.println(p3);
        Personne [] tab = {p1,p2,p3};
        /* On utilise une boucle de type for each plus intéressante ici (on n'a pas besoin
        d'un indice mais seulement d'une référence).
         */
        for (Personne p:tab) {
            System.out.println(p.getPrenom());
        }

    }
}
