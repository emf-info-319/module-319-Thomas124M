package devoirs.devoir02;

public class devoir02 {
    public static void main(String[] args) {
        int réservoirA = 0;
        int réservoirB = 0;
        int remplissage = (int) (Math.random() * (8 - 1 + 1)) + 1;

        System.out.println("il y a 5 litre à remplir.");
        do {
            System.out.println("remplisage du réservoir A...");
            remplissage--;
            réservoirA++;
            System.out.println("le réservoir A : " + réservoirA + "le réservoir B : " + réservoirB);
        } while (réservoirA < 4);
        do {
            System.out.println("remplissage du réservoir B...");
            remplissage--;
            réservoirB++;
            System.out.println("le réservoir A : " + réservoirA + "le réservoir B : " + réservoirB);

        } while (réservoirB < 6);
        if (remplissage == 0) {
            System.out.println("Remplissage terminé!");
        }

    }

}
