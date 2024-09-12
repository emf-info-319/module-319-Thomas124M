package exercices.exercice08;

public class Exercice08ex2 {
    public static void main(String[] args) {

        // Décollage avec la boucle "for"
        System.out.println("boucle for:");
        for (int décollage = 5; décollage > 0; décollage--) {
            System.out.println(décollage);
        }
        System.out.println("Décollage!!");

        // Décollage avec la boucle "while"
        System.out.println("boucle while:");
        int décollage = 5;
        while (décollage > 0) {
            System.out.println(décollage);
            décollage--;
        }
        System.out.println("Décollage!!");

        // Décollage avec la boucle "while" mais en utilisant BOOLEAN
        System.out.println("boucle while(boolean): ");
        int décollages = 5;
        boolean pendant = true;
        while (pendant) {
            System.out.println(décollages);
            décollages--;
            if (décollages == 0) {
                pendant = false;
            }
        }
        System.out.println("Décollage!!");

        // Décollage avec la boucle "do-while"
        System.out.println("boucle do.while");
        int décollage1 = 6;
        do {
            décollage1--;
            System.out.println(décollage1);
        } while (décollage1 > 1);
        System.out.println("Décollage!!");

    }

}
