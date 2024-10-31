package exercices.exercice10;

public class exercice10 {
    public final static int MAX = 20;
    public final static int MIN = 1;

    public static void main(String[] args) {
int [] tab = creertableau(50);

        
      
    }

    public static int[] creertableau(int taille) {
        int[] tab = new int[taille];
        return tab;

    }


    public static int valeurdutableauAletoire() {
        int nombre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        return nombre;
    }
}
