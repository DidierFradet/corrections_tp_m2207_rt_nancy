package m2207.pratique.tp3.Exercice1;

/**
 * Created by Didier Fradet on 03/06/2020.
 */
public class Personne {
    private String nom, prenom, surnom;

    /*
    Une fois les attributs déclarés, on peut faire générer automatiquement sur IntelliJ IDEA constructeur(s),
    getter(s) et setter(s). Sur PC, le raccourci clavier est "Alt Insert" et sur Mac "cmd N"
     */

    public Personne(String nom, String prenom, String surnom) {
        this.nom = nom;
        this.prenom = prenom;
        this.surnom = surnom;
    }

    // Pour ce deuxième constructeur, on va faire appel au premier par this(...)
    public Personne(String nom, String prenom) {
        this(nom, prenom, null);
    }

    /*
    La classe Personne hérite de la classe Object et il s'agit de redéfinir la méthode toString().
    Le plus simple avec IntelliJ IDEA est de taper le début du nom de la méthode est d'accepter
    la complétion proposée.
    Le mot-clé (ou annotation) @override est utilisé pour redéfinir une méthode d'une classe parente
     */

    @Override
    public String toString() {
        // Il faut tenir compte de l'existence ou non d'un surnom
        String presentation = "Personne{ nom = '" + nom
                + "', prenom = '" + prenom + "'}";
        if (this.surnom != null){
            presentation = "Personne{ nom = '" + nom
                    + "', prenom = '" + prenom + "', surnom = '"
                    + surnom + "'}";
        }

        return presentation;
    }

    /*
    Les classiques getters et setters générés automatiquement
     */
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSurnom() {
        return surnom;
    }

    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
}
