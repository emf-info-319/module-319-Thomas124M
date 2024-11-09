package devoirs.devoir06;

public class devoir06 {

    public final static int VALEURS_MIN = 0;
    public final static int VALEURS_MAX = 50;
    public final static int VALEURS_RECHERCHEE = 7;

    public static void main(String[] args) {
        int[] taille_tableau = new int[20];
        genereTableau(taille_tableau);
        System.out.println("La plus petite valeur trouvée est : " + rechercheMin(taille_tableau));
        System.out.println("La plus grande valeur trouvée est : " + rechercheMax(taille_tableau));
        rechercheValeur(taille_tableau,VALEURS_RECHERCHEE);
    }

    public static int[] genereTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (VALEURS_MAX - VALEURS_MIN + 1)) - VALEURS_MIN;
            System.out.println("Tableau[" + i + "] = " + tableau[i]);
        }
        return tableau;
    }

    public static int rechercheMin(int[] tableau) {
        if (tableau.length == 0) {
            return 0;
        }
        int min = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            min = Math.min(min, tableau[i]);
        }
        return min;
    }

    public static int rechercheMax(int[] tableau) {
        if (tableau.length == 0) {
            return 0;
        }
        int max = tableau[0];
        for (int i = 0; i < tableau.length; i++) {
            max = Math.max(max, tableau[i]);
        }
        return max;
    }

    public static int rechercheValeur(int[] tableau, int valeurRecherchee) {
        int position = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                position = i;
                break;
            } else {
                position = -1;
            }

        } System.out.println("Le nombre ["+VALEURS_RECHERCHEE+"] figure à la position ["+position+"] du tableau");
        return position;
    }
}
