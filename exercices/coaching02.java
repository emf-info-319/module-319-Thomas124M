package exercices;

public class coaching02 {
    public static void main(String[] args) {
        String[] tableau = new String[10];
        int reponse = additionne(3, 3);
        int reponse2 = additionne(5, 5);
        System.out.println("la répond est : " + reponse + " et " + reponse2);
        remplitTableau(tableau);

    }

    public static int additionne(int valeur1, int valeur2) { // méthode pour qu va faire des additions,
        // dans les paramètres c'est les valeurs qu'on ajoute quand on va l'appelé dans
        // la méthode main

        int resultat = valeur1 + valeur2;
        return resultat;
    }

    public static String[] remplitTableau(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = "bonjour";
            System.out.println(tableau[i]);
        }
        return tableau;
    }
}
