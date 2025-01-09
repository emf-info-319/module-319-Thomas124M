package revisions.E2_revision_2024_2025;

public class mao_E2_les_flechettes {
    public final static int NOMBRE_DE_JOUEURS = 3;
    public final static int NOMBRE_DE_FLECHETTES = 3;
    public final static int POINTS_TOTAUX = 301;
    public final static int MIN = 0;
    public final static int[] POINTS_POSSIBLES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 25 };

    public static void main(String[] args) {
        int[] joueurs = new int[NOMBRE_DE_JOUEURS];
        boolean partieTerminee = false;
        while (partieTerminee == false) {
            for (int i = 0; i < joueurs.length; i++) {
                System.out.println("C'est au tour du joueur " + (i + 1));
                int resultat = joue(joueurs[i]);
                joueurs[i] = resultat;
                if (resultat == POINTS_TOTAUX) {
                    System.out.println("Le joueur " + (i+1) + " a gagné! Partie terminée!");
                    partieTerminee = true;
                    break;
                }
            }
        }
    }

    public static int lanceFlechette() {
        int maxPoints = POINTS_POSSIBLES.length - 1;
        int indexFlechette = (int) (Math.random() * (maxPoints - MIN + 1)) + MIN;
        int pointsFLechette = POINTS_POSSIBLES[indexFlechette];
        System.out.println("La fléchette est tombée dans la zone qui donne " + pointsFLechette + " points.");
        return pointsFLechette;
    }

    public static int joue(int pointsAtuels) {
        int resultat = 0;
        int pointsDuTour = 0;
        int pointsFlechette = 0;
        for (int i = 0; i < NOMBRE_DE_FLECHETTES; i++) {
            pointsFlechette = lanceFlechette();
            pointsDuTour = pointsDuTour + pointsFlechette;
            System.out.println("le joueur a fait " + pointsFlechette + " points.");
            resultat = pointsAtuels + pointsDuTour;
            if (resultat > POINTS_TOTAUX) {
                System.out.println("Le total de " + POINTS_TOTAUX + " est dépassé. Il retourne à ses points précédents("
                        + pointsAtuels + ").");
                resultat = pointsAtuels;
                break;
            } else if (resultat == POINTS_TOTAUX) {
                System.out.println("Il a atteint le nombre de points requis.");
                break;
            } else {
                System.out.println("Il a actuellement " + resultat + " points.");
            }
        }
        return resultat;
    }
}
