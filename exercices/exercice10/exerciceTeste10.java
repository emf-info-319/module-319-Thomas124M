package exercices.exercice10;

import java.lang.Math;

public class exerciceTeste10 {
    public static void main(String[] args) {

        int nb1 = 4;
        int nb2 = 3;
        double nombre = Math.pow(nb1, nb2);
        System.out.println(nombre);

        int nombre1 = Math.max(nb1, nb2);
        System.out.println(nombre1);

        int nombre2 = Math.min(nb1,nb2);
        System.out.println(nombre2);


        double nombre3 = Math.sqrt(nb1);
        System.out.println(nombre3);


        int nombre4 = Math.abs(nb1);
        System.out.println(nombre4);
        direBoujour();

        dire();

    }

    public static void direBoujour() {
        System.out.println("bonjour");
    }

    public static String dire() {
        String nImporteQuoi = "moi";
        return nImporteQuoi;
    }

}
