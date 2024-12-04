package revisions.E1_E2_pratique_2024_2025;

import java.util.Scanner;

public class E2_leJeuDeNim {
    public final static int NOMBRE_BATONNETS = 21;
    public final static int MAX = 3;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }
        System.out.println("Bienvenue dans le jeu de Nim");
        System.out.println("règles : Vous et l'IA retirez tour à tour entr 1 et 3 bâtonnets.");
        System.out.println("le joueur qui retire le dernier bâtonnet perd");

        boolean tourJoueur = true;

        while (nbBatonnetrestants(batonnets) > 0) {
            afficherBatonnets(batonnets);
            tourJoueur = !tourJoueur;
            if (tourJoueur) {
                int nbEleve = demanderNombre(scanner);
                batonnets = enleverBatonnets(batonnets, nbEleve);
            } else {
                int nbEnleveIA = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
                System.out.println("L'IA enlève " + nbEnleveIA + " bâtonnet(s).");
                batonnets = enleverBatonnets(batonnets, nbEnleveIA);
            }
            }
            if (tourJoueur) {
                System.out.println("vous avez retiré le dernier bâtonnet. L'IA gagne !");
            } else {
                System.out.println("L'IA retire le dernier bâtonnet. vous gagnez !");
            }
        
        scanner.close();

    }

    public static void afficherBatonnets(int[] batonnets) {
        for (int batonnet : batonnets) {
            if (batonnet == 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.println("");
    }

    public static int nbBatonnetrestants(int[] batonnets) {
        int nbRestants = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbRestants++;
            }
        }
        return nbRestants;
    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEleve) {
        int nbRestants = nbBatonnetrestants(batonnets);
        int nbEnleveMax = Math.min(nbEleve, nbRestants);
        for (int i = batonnets.length - 1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;
            }
        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        int nbEnleve;
        do {
            System.out.println("entrer un nombre entre 1 et 3 :");
            nbEnleve = scanner.nextInt();
        } while (nbEnleve < 1 || nbEnleve > 3);

        return nbEnleve;
    }
}
