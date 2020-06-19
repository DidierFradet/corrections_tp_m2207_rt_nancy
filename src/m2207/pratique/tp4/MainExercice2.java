package m2207.pratique.tp4;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Didier Fradet on 15/06/2020.
 */
public class MainExercice2 {
    public static void main(String[] args) {
        String hote = "google.fr";
        /*
        if (args.length > 0){
            hote = args[0];
        }
        */
        System.out.println(hote + " a pour IP :");
        try {
            InetAddress[] arrayIP = InetAddress.getAllByName(hote);
            for (InetAddress inetAddress : arrayIP) {
                System.out.println(inetAddress.getHostName()
                        + " : " + inetAddress.getHostAddress());
                System.out.println(inetAddress.getCanonicalHostName());
            }
            System.out.println("Adresse locale");
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local.getHostName() + " : " + local.getHostAddress());
            System.out.println(local.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}