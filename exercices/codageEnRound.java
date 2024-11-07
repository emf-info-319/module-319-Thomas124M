package exercices;

public class codageEnRound {
    public final static double PI = 3.14;

    public static void main(String[] args) {
        int[] rayons = new int[10];
        for (int i = 0; i < rayons.length; i++) {
            rayons[i] = gerereNombre(1, 10);
        }
        for (int i = rayons.length - 1; i >= 0; i--) {
            if (rayons[i] > 50) {
                System.out.println("Aire : " + PI * rayons[i] * rayons[i]);
            } else {
                System.out.println("Périmètre : " + PI * 2 * rayons[i]);
            }
            
        }
    }

    public static int gerereNombre(int min, int max) {
        int nombreAleatoire = (int) (Math.random() * (max - min + 1)) + min;
        return nombreAleatoire;
    }

}
