package m2207.pratique.tp4;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Didier Fradet on 15/06/2020.
 */
public class MainExercice3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.debian.org");
            URLConnection urlConnection = url.openConnection();

            /*
            On peut utiliser la Map. Dans un premier temps, on récupère les clés (Set<String> keySet = map.keySet();)
            dans une collection qui est un Set (ensemble comme en Maths). Ces clés correspondent ici aux noms
            des entêtes. Enfin pour chaque clé, on récupère la valeur et on affiche sous la forme clé : valeur
            Map<String, List<String >> map = urlConnection.getHeaderFields();
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                System.out.println(key + " : " + urlConnection.getHeaderField(key));
            }
            */

            System.out.println();
            /*
            Si on ne veut pas utiliser les spécificités d'une Map, on peut obtenir sa taille c'est à dire le nombre
            d'entêtes, faire une boucle et utiliser les méthodes getHeaderFieldKey(int n) pour la clé (nom de
            l'entête) et getHeaderField(int n) la valeur de l'entête de même indice
            */
            int size = urlConnection.getHeaderFields().size();
            for (int i = 0; i < size; i++) {
                System.out.println(urlConnection.getHeaderFieldKey(i) + " : " + urlConnection.getHeaderField(i));
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}