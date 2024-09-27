package devoirs.devoir03;

public class Devoir03 {
    public static void main(String[] args) {
        int jour = 12;
        int mois = 12;
        int année = 2024;
        int ensemble = 365;
        if (jour == 1 && mois == 1) {
            System.out.println("le " + jour + "/" + mois + "/" + année + " est le jour 1 de l'An.");
        }

        else if (jour == 31 && mois == 12) {
            System.out.println("le " + jour + "/" + mois + "/" + année + "est le jour 365 de l'An.");
        }

        else {
            System.out.println(
                    "le " + jour + "/" + mois + "/" + année + " est le jour " + (ensemble - jour) + " de l'An.");

        }

    }
}
// int jour =21;
// int mois =9;
// int année =2024;
// int [] tab;
// tab = new int []{31,28,31,30,31,30,31,31,30,31,30,31};
// int jourtotal = 0;
//if (annee % 4 == 0){tab[1] == 29;}
//for (int i =0; i <mois -1;i++){jourtotal = jourtotal +tab[i];}
