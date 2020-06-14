package m2207.pratique.tp3.Exercice2;

/**
 * Created by Didier Fradet on 08/06/2020.
 */
public class MainExercice2 {
    public static void main(String[] args) {
        Intervalle i1 = new Intervalle(3,4);
        System.out.println("La longueur de l'intervalle "+ i1 + " est : " + i1.longueur());
        System.out.println("Le milieu de l'intevalle " + i1 + " est : " + i1.milieu());
        System.out.println("Le symétrique de " + i1 + " est " + i1.symetrique()) ;
        double x = 0.75;
        if (i1.contient(x)){
            System.out.println("L'intervalle " + i1 + " contient le réel " + x);
        }else{
            System.out.println("L'intervalle " + i1 + " ne contient pas le réel " + x);
        }

        Intervalle i2 = new Intervalle();
        if (i2.contient(x)){
            System.out.println("L'intervalle " + i2 + " contient le réel " + x);
        }else{
            System.out.println("L'intervalle " + i2 + " ne contient pas le réel " + x);
        }
    }
}