package exercices.exercice09;

public class Exercice09ex2 {
    public final static int MIN = 1;
    public final static int MAX = 6;

    public static void main(String[] args) {
        int[] montableau = new int[10];
        for (int i = 0; i < montableau.length; i++) {
            montableau[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Cellule "+i+ " : " +montableau[i]);
        }
        
    }

}
