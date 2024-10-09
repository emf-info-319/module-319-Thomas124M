package devoirs.devoir05;

import java.util.Scanner;

public class devoir05 {
    public final static int limiteSupComprise = 100;
    public final static int limiteInfComprise = 1;

    public static void main(String[] args) {
        int nbraléatoire = (int) (Math.random() * (limiteSupComprise - limiteInfComprise + 1)) + limiteInfComprise;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une valeur svp : ");
        int valeur = scanner.nextInt();
        scanner.nextLine();
        do {
            if (valeur > nbraléatoire) {
                System.out.println("trop grand");
                System.out.println("Entrez une autre valeur svp : ");
                valeur = scanner.nextInt();
                scanner.nextLine();
            } else if (valeur < nbraléatoire) {
                System.out.println("trop petit");
                System.out.println("Entrez une autre valeur svp : ");
                valeur = scanner.nextInt();
                scanner.nextLine();
            }
        } while (valeur < nbraléatoire || valeur > nbraléatoire);
        if (valeur == nbraléatoire) {
            System.out.println("Bravo,trouvé !");
        }
        scanner.close();
    }
}
