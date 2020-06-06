package m2207.pratique.tp2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by Didier Fradet on 26/05/2020.
 */
public class MainExercice4 {
    /*
    Il suffit de regarder dans la documentation des API Java aux classes indiquées dans l'énoncé.
    Dans ces classes, il n'y a pas de constructeurs. Il faut utiliser des méthodes de classe
    pour créer des instances. C'est ce que l'on appelle en français des méthodes de fabrique statique
    et en anglais "static factory methods"
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        // Création d'un format pour l'affichage
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy HH:mm");
        System.out.println(formatterDateTime.format(now));
        /*
        Les méthodes plusHours() et plusMinutes() de LocalDateTime retournent un LocalDateTime,
        on peut donc les enchainer
         */
        LocalDateTime nowPlus = now.plusHours(2).plusMinutes(45);
        System.out.println(formatterDateTime.format(nowPlus));

        // Date de naissance d'une très grande athlète française
        LocalDate birthday = LocalDate.of(1968, Month.MAY,9);
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
        System.out.println(formatterDate.format(birthday));
        /*
        Plutôt que de créer une instance de LocalDate représentant la date courante (LocalDate.now()),
        on peut utiliser l'instance de LocalDateTime now et lui appliquer la méthode
        toLocalDate()
         */
        Period p = Period.between(birthday, now.toLocalDate());
        System.out.println("Cette athlète est agée de " + p.getYears() + " ans, "
                + p.getMonths() + " mois et " + p.getDays() + " jours");
    }
}