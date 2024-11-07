package exercices.exercice10;

import java.util.ArrayList;
import java.util.List;

public class exercice10 {
    public final static int MAX = 20;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int[] tableau = creertableau(50);

        valeurDuTableauAléatoire(tableau);

        direContenuInfo();

        tableau = valeurDuTableauAléatoire(tableau);

        intvaleurMinEtMax(tableau);

        messageChangementValeur();

        changementValeur(tableau);

        sommeDuTableau(tableau);

        moyenneDuTableau(tableau);

        positionDeLaValeur(tableau);

    }

    public static int[] creertableau(int taille) {
        int[] tab = new int[taille];
        return tab;
    }

    public static void direContenuInfo() {
        System.out.println("le tableau a une taille de 50 cellules.");
        System.out.println("Contenu du tableau aléatoire :");
    }
public static int [] valeurFixeDuTableau(int[]tableau, int valeur){
    for (int i = 0; i < tableau.length; i++) {
        tableau[i]= valeur;
    } return tableau;
}
    public static int[] valeurDuTableauAléatoire(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("tab[" + i + "] = " + tableau[i]);
        }
        return tableau;
    }
public static int retournerMin(int[]tableau){
    if (tableau.length == 0){
        return 0;
    }
    int min = tableau[0];
    for (int i = 1; i < tableau.length; i++) {
        min = Math.min(min,tableau[i]);
    }return min;
}
public static int retournerMax(int[]tableau){
    if (tableau.length == 0){
        return 0;
    }
    int max = tableau[0];
    for (int i = 1; i < tableau.length; i++) {
        max = Math.max(max,tableau[i]);
    }return max;
}
    public static int[] intvaleurMinEtMax(int[] tableau) {
        int minVal = MAX;
        int maxVal = MIN;

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
        return tableau;
    }

    public static void messageChangementValeur() {
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau :");
    }

    public static int[] changementValeur(int[] tableau) {
        int nombreRem = 12;
        int nombreMis = 5;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombreRem) {
                tableau[i] = nombreMis;
            }
            System.out.println("tab[" + i + "] = " + tableau[i]);
        }
        return tableau;
    }

    public static int[] sommeDuTableau(int[] tableau) {
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme = somme + tableau[i];
        }
        int sommeTotal = somme + tableau.length;
        System.out.println("La somme des cellules du tableau = " + sommeTotal);
        return tableau;
    }

    public static int[] moyenneDuTableau(int[] tableau) {
        int moyenne = 0;
        for (int i = 0; i < tableau.length; i++) {
            moyenne = moyenne + tableau[i];
        }
        double moyenneGénéral = (double) moyenne / tableau.length;
        System.out.println("La moyenne des cellules du tableau = " + moyenneGénéral);
        return tableau;
    }

    public static int[] positionDeLaValeur(int[] tableau) {
        List<Integer> positions = new ArrayList<>();
        int nombreRecherche = 13;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == nombreRecherche) {
                positions.add(i);
            }
        }
        System.out.println("Le nombre " + nombreRecherche + " a été trouvée à la position : " + positions);
        return tableau;
    }

      
    
 
 public static int premierOccurence(int[]tableau, int valeurRechercher){
    int position=-1;
    for (int i = 0; i < tableau.length; i++) {
        if(tableau[i] == valeurRechercher){
            position = i;
            break;
        }
    }return position;
 }
 public static int dernièreOccurence(int[]tableau,int valeurRechercher){
    int position = -1;
    for (int i = tableau.length-1; i>=0; i++) {
        if(tableau[i] == valeurRechercher){
            position = i;
            break;
        }
        
    }return position;
 }
}
