package devoirs.devoir02;

public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {
        int réservoirA = 0;
        int réservoirB = 0;
        int remplissage = (int) (Math.random() * (CAPACITE_RESERVOIR_A+CAPACITE_RESERVOIR_B - 1 + 0)) + 1;

        System.out.println("il y a " +remplissage+ " litre à remplir.");
        do {
            System.out.println("remplisage du réservoir A...");
            remplissage--;
            réservoirA++;
            System.out.println("le réservoir A : " + réservoirA + "le réservoir B : " + réservoirB);
        } while (réservoirA<3);
        do {
            System.out.println("remplissage du réservoir B...");
            remplissage--;
            réservoirB++;
            System.out.println("le réservoir A : " + réservoirA + "  réservoir B : " + réservoirB);

        } while (réservoirB <5);
        if (remplissage == 0) {
            System.out.println("Remplissage terminé!");
        }

    }

}
