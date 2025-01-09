package revisions.E2_revision_2024_2025;

public class blackjack {
    public final static int MIN = 2;
    public final static int MAX = 14;

    public static void main(String[] args) {
        String[] joueurs = { "Jacques", "Pierre", "Paul" };
        int [] scores = new int[joueurs.length];
    }

    public static int tirerUneCarte() {
        int carteAleatoire = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return carteAleatoire;
    }

    public static int determinerIndexGagnant(int[] scores) {
        int scoresGagnant = 0;
        int indexGagnant = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= 21 && scores[i] > scoresGagnant) {
                indexGagnant = i;
                scoresGagnant = scores[i];
            }
        }
        return indexGagnant;
    }

    public static String donnerNomCarte(int carte) {
        String resultat = "";
        resultat = String.valueOf(carte);
        if (carte > 10) {
            switch (carte) {
                case 11:
                    resultat = "Valet";
                    break;
                case 12:
                    resultat = "Dame";
                    break;
                case 13:
                    resultat = "Roi";
                    break;
                case 14:
                    resultat = "as";
                    break;
                default:
                    resultat = "Indéterminé";
                    break;
            }
        }
        return resultat;
    }
}
