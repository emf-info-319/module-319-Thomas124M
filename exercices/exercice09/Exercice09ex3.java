package exercices.exercice09;

public class Exercice09ex3 {
    public final static int MIN = 1;
    public final static int MAX = 6;

    public static void main(String[] args) {
        int[] tableau1 = new int[10];
        for (int i = 0; i < tableau1.length; i++) {
            tableau1[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("l'élève " + i + " a une note de : " + tableau1[i]);

        }
        int cellule =0;
        for (int i =0 ; i <tableau1.length; i++) {cellule = cellule +tableau1[i];}
        System.out.println("la classe a une moyenne de :");

    }
}