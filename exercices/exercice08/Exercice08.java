package exercices.exercice08;

public class Exercice08 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println("boucle for, itération" + i);
        }

        int boucle = 1;
        while (boucle < 6) {
            System.out.println("boucle while,itération" + boucle);
            boucle++;
        }

        int t = 1;
        boolean pendant = true;
        while (pendant) {
            System.out.println("t" + t);
            t++;
            if (t > 5) {
                pendant = false;
            }
        }

        int f = 0;
        do {
            f++;
            System.out.println("boucle do-while,itération" + f);
        } while (f < 5);

        for (int i = 0; i < 6; i++) {
            if (i == 3) {
                continue;

            }
            System.out.println("boucle for, itération" + i);
        }
        int croissant = 1;
        while (croissant < 4) {
            System.out.println("boucle while,itération" + croissant);
            croissant++;
        }
    }

}
