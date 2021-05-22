package m2207.pratique.tp1;

/**
 * Created by Didier Fradet on 18/05/2020.
 */
public class MainExercice5 {
    public static void main(String[] args) {
        /*
        Dans cet exercice il y a deux problèmes :
        1. Le cumul : si on veut calculer une somme s = f(a) + f(a+p) + f(a+2p) + f(a+3p) + …
        où f est une fonction ou expression, le procédé est toujours le même comme vu en M1207 :
        - déclarer et initialiser (généralement à 0) une variable s. En Java, ce pourrait être : double s = 0;
        - dans une boucle, faire deux choses :
            - faire évoluer un indice i (si c’est une boucle while, il aura fallu déclarer et initialiser i avant),
            par exemple ici  i = i + p
            - cumuler s, c’est à dire s = s + f(i)

        2. Le calcul de 1/i : 1 est un entier et si i est un entier, alors 1/i est un entier et vaut 0 pour n>1.
        Il y a donc plusieurs possibilités :
        - déclarer i comme réel. C'est assez bizarre mais ça marche
        - faire un cast de i en réel = 1/(double)i
        - écrire 1.0/i. Ainsi, conformément à ce qui est décrit au paragraphe 2.4 page 15 du polycopié, 1.0/i
        est un réel

        Évidemment il faut ici faire une boucle while.
         */
        double l = 10;
        double s = 0;
        int i = 0;
        while (s < l){
            i = i + 1;
            s = s + 1.0/i;
        }
        System.out.println("La somme vaut " + s + " pour i = " + i);
    }
}