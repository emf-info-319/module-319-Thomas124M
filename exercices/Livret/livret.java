package exercices.Livret;

import java.util.Scanner;

public class livret {
    public final static int MIN = 5;
    public final static int MAX = 20;

    public static void main(String[] args) {
        int valeur1 = choisirUnNombre(MIN, MAX);
        int valeur2 = choisirUnNombre(MIN, MAX);
        String[] TableMultiplication = construireTableMultiplication(MIN, MAX);
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer une valeur entre : " + 1 + " et " + valeur2*valeur1);
        int valeurInserer = scanner.nextInt();
        scanner.nextLine();

        if (valeurInserer > valeur1 * valeur2 || valeurInserer < 0) {
            System.out.println("Valeur incorrecte !");
            System.out.println("Entrez une valeur correcte :");
            valeurInserer = scanner.nextInt();
        } else {
            System.out.println(TableMultiplication[valeurInserer - 1]);
        }
    }

    public static int choisirUnNombre(int MIN, int MAX) {
        int nombreAleatoire = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return nombreAleatoire;
    }

    public static String[] construireTableMultiplication(int nombre1, int nombre2) {
        String[] tableau = new String[100];
        int facteur1 = 1;
        int facteur2 = 1;
        int nombre = 11;
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = facteur1 + " x " + facteur2 + " = " + (facteur1 * facteur2);
            facteur2++;
            if (facteur2 == nombre) {
                facteur1++;
            }
            if (facteur2 == nombre) {
                facteur2 = 1;
            }

        }
        return tableau;
    }
}
