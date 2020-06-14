package m2207.pratique.tp3.Exercice2;

/**
 * Created by Didier Fradet on 08/06/2020.
 */
public class Intervalle {
    // On admettra a <= b
    private int a,b;

    public Intervalle(int a, int b) {
        try {
            if(a>b) {
                throw new Exception("Erreur d'ordre");
            }else{
                this.a = a;
                this.b = b;
            }
        }catch (Exception e){
            this.a = 0;
            this.b = 1;
            System.out.println("a doit être plus petit que b");
        }
//        this.a = a;
//        this.b = b;
    }
    /*
    Au lieu de faire appel au constructeur "principal" en utilisant this(...), on pourrait faire :
    this.a = 0;
    this.b = 1;
     */
    public Intervalle() {
        this(0,1);
    }

    @Override
    public String toString() {
        return "[" + a + "," + b + "]";
    }
    /*
    a et b étant des entiers, il ne faut pas calculer (a + b)/2 qui est un entier
    et donnerait 1 pour a = 1 et b = 2. Comme il faut faire une division dans les réels,
    on peut écrire (a + b)/2.0
     */
    public double milieu(){
        return (a + b)/2.0;
    }

    public int longueur(){
        return b - a;
    }

    public boolean contient(double x){
        boolean result = false;
        if (x >= a && x <= b){
            result = true;
        }
        return result;
    }
    /*
    On construit un nouvel objet de type Intervalle que la méthode retourne
     */
    public Intervalle symetrique(){
        return new Intervalle(-b, -a);
    }
}
