package exercices.exercice10;

import java.util.ArrayList;
import java.util.List;

public class exercice101 {

    public final static int MAX = 20;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int[] tableau = new int[50];
        System.out.println("le tableau a une taille de 50 cellules.");
        System.out.println("Contenu du tableau aléatoire :");
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (MAX - MIN + 1)) - MIN;
            System.out.println("tab[" + i + "] = " + tableau[i]);

        }
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int nombre : tableau) {
            if (nombre < minVal) {
                minVal = nombre;
            }
            if (nombre > maxVal) {
                maxVal = nombre;
            }
        }

        System.out.println("La valeur min trouvé = " + minVal);
        System.out.println("La valeur max trouvé = " + maxVal);
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici la contenu du >tableau :");
        int nombreRem = 12;
        int nombreMis = 5;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombreRem) {
                tableau[i] = nombreMis;
            }System.out.println("tab[" + i + "] = " + tableau[i]);
        }
int somme =0;
for (int i =0 ; i <tableau.length; i++) {somme = somme +tableau[i];}
int sommeTotal = somme + tableau.length;
System.out.println("La somme des cellules du tableau = "+sommeTotal);

int moyenne =0;
for (int i =0 ; i <tableau.length; i++) {moyenne = moyenne +tableau[i];}
float moyenneGénéral = (float) moyenne / tableau.length;
System.out.println("La moyenne des cellules du tableau = "+moyenneGénéral);
int nombreRecherche = 13;
            List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombreRecherche) {
                positions.add(i);
            }
        }
        System.out.println("Le nombre " + nombreRecherche + " a été trouvée à la position+ : " + positions);}
}
