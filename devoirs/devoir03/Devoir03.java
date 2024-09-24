package devoirs.devoir03;

public class Devoir03 {
    public static void main(String[] args) {
        int jour = 12;
        int mois = 11;
        int année = 2024;
        int ensemble = 365;
       

        if (jour == 1 && mois == 1) {
            System.out.println("le " + jour + "/" + mois + "/" + année + " est le jour 1 de l'An.");
        }

        else if (jour == 31 && mois == 12) {
            System.out.println("le " + jour + "/" + mois + "/" + année + " est le jour 365 de l'An.");
        }

        else {
            System.out.println(
                    "le " + jour + "/" + mois + "/" + année + " est le jour " + (ensemble - jour ) + " de l'An.");
        }

    }

}
