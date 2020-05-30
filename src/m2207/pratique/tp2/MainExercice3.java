package m2207.pratique.tp2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Didier Fradet on 26/05/2020.
 */
public class MainExercice3 {
    public static void main(String[] args) {
        /*
        Une ArrayList ne peut pas contenir de types primitifs mais uniquement des objets.
        On utilise donc le "wrapper" correspondant aux entiers de type int, c'est à dire
        la classe Integer
         */
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(7);
        list1.add(3);
        System.out.println(list1);
        int[] tab = {1,6,9,3,5};
        /*
        Pour construire une Arraylist à partir d'un tableau de type primitifs, le plus simple
        est de parcourir le tableau et d'ajouter les éléments à chaque étape.
         */
        ArrayList<Integer> list2 = new ArrayList<>();
        // Le plus simple est d'utiliser une boucle de type for each
        for (int x : tab) {
            list2.add(x);
        }
        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(list1);
        if (list1.contains(3)){
            System.out.println("La première occurence de 3 " +
                    "est à l'index " + list1.indexOf(3));
        }
        System.out.println("L'élément d'index 5 est " + list1.get(5));
        list1.remove(1);
        System.out.println(list1);
        System.out.println("La taille du tableau est " + list1.size());
        /*
        Pour trier la liste, on peut utiliser la méthode sort(...) de l'interface List. Il faut passer
        en paramètre un comparateur (Comparator) qui sera Comparator.naturalOrder() pour l'ordre croissant
        et Comparator.reverseOrder() pour l'ordre décroissant.
        On peut aussi utiliser la classe utilitaire Collections et sa méthode static sort()
         */
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}