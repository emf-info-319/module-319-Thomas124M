package exercices;

import java.util.Scanner;

public class IntroMethodes {
    public static void main(String[] args) {
        debut();

        int valeur0 = demandeNombre();

        int valeur1 = demandeNombre();

        int valeur2 = demandeNombre();

        somme(valeur0, valeur1, valeur2);

        fin();
    }

    public static void debut() {
        System.out.println("Bonjour et bienvue sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours.");

    }

    public static void fin() {
        System.out.println("Programme terminé");
    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int resultat = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Merci, j'enregistre " + resultat + " !");
        return resultat;

    }

    public static int somme(int nombre1, int nombre2, int nombre3) {
        int resultat = nombre1 + nombre2 + nombre3;
        System.out.println("la somme est : " + resultat);
        return resultat;
    }
}
