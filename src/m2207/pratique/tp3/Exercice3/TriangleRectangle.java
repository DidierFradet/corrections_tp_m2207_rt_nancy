package m2207.pratique.tp3.Exercice3;

/**
 * Created by Didier Fradet on 08/06/2020.
 */
/*
Un triangle rectangle est évidemment un triangle donc la classe TriangleRectangle hérite
de la classe Triangle. Le seuls attributs sont les longueurs des côtés de l'angle droit
 */
public class TriangleRectangle extends Triangle {
    private double a, b;

    public TriangleRectangle(double a, double b) {
        /*
        La première instruction consiste à faire appel au constructeur de la classe
        mère (Triangle). La longueur de l'hypoténuse est calculée par la formule
        de Pythagore
         */
        super(a, b, Math.sqrt(a*a + b*b)); // ou super(a, b, Math.hypot(a, b));
        this.a = a;
        this.b = b;
    }

    public double hypotenuse(){
        return Math.sqrt(a*a + b*b);
        // ou return Math.hypot(a, b);
    }

    /*
    Ce n'est pas demandé dans l'énoncé mais on peut redéfinir la méthode isRectangle().
    Ça évite les éventuels problèmes d'arrondis dans le calcul et on est sûr q'un triangle
    rectangle est rectangle !!
     */
    @Override
    public boolean isRectangle() {
        return true;
    }
}
