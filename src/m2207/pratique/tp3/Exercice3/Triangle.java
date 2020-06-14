package m2207.pratique.tp3.Exercice3;

/**
 * Created by Didier Fradet on 08/06/2020.
 */
public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isEquilateral(){
        boolean equilateral = false;
        if (a == b && b == c){
            equilateral = true;
        }
        return equilateral;
    }

    /*
    Le plus simple est de vérifier les trois relations de Pythagore possibles
     */
    public boolean isRectangle(){
        boolean rectangle = false;
        if (a*a + b*b == c*c
                || a*a + c*c == b*b
                || b*b + c*c == a*a){
            rectangle = true;
        }
        return rectangle;
    }

    /*
    On applique la formule de Héron
     */
    public double aire(){
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /*
    On a déjà un constructeur avec trois réels en paramètres et on ne peut pas en ajouter
    un deuxième avec trois réels en paramètres. La seule possibilité est donc de faire une
    "static factory method", c'est à dire une méthode de classe (static) qui retourne
    ici un triangle. Et pour construire ce triangle dans la méthode de classe, on fait
    appel au constructeur
     */
    public static Triangle avecAnglesEtCote(double c, double alpha, double beta){
        double a = c*Math.sin(alpha)/Math.sin(alpha + beta);
        double b = c*Math.sin(beta)/Math.sin(alpha + beta);
        return new Triangle(a,b,c);
    }
}
