package m2207.pratique.tp3.Exercice3;

/**
 * Created by Didier Fradet on 08/06/2020.
 */
public class MainExercice3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(36, 77, 85);
        if (t1.isRectangle()){
            System.out.println("Le triangle t1 est rectangle");
        }else{
            System.out.println("Le triangle t1 n'est pas rectangle");
        }
        System.out.println("L'aire du triangle t1 est : " + t1.aire());

        TriangleRectangle t2 = new TriangleRectangle(28,45);
        if (t2.isRectangle()){
            System.out.println("Le triangle t2 est rectangle");
        }else{
            System.out.println("Le triangle t2 n'est pas rectangle");
        }
        System.out.println("L'hypoténuse de t2 a pour longueur " + t2.hypotenuse());

        Triangle t3 = Triangle.avecAnglesEtCote(6,Math.PI/3, Math.PI/3);
        if (t3.isEquilateral()){
            System.out.println("Le triangle t3 est équilatéral");
        }else{
            System.out.println("Le triangle t3 n'est pas équilatéral");
        }
        if (t3.isRectangle()){
            System.out.println("Le triangle t3 est rectangle");
        }else{
            System.out.println("Le triangle t3 n'est pas rectangle");
        }
        System.out.println("L'aire du triangle t3 est : " + t3.aire());
    }
}