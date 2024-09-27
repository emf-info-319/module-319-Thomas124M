package exercices;

public class MaoE00 {
    public final static int nombre_pts_victoire = 1;
    public final static int MAX = 10;
    public final static int MIN = 1;

    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone";
        String nomEquipe2 = "Madrid";

        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;

        for (int i = 0; i < 10; i++) {
            int scoreEquipe1 = (int) (Math.random() * (MAX - MIN + 1)) + 1;
            int scoreEquipe2 = (int) (Math.random() * (MAX - MIN + 1)) + 1;
            System.out.println(nomEquipe1 + "joue contre " + nomEquipe2 + "et le résultat est : " + scoreEquipe1 + " à "
                    + scoreEquipe2);
            if (scoreEquipe1 > scoreEquipe2) {
            nombrePointEquipe1 = nombrePointEquipe1 + nombre_pts_victoire;
            System.out.println(nomEquipe1 + "a gagné");
            } else if(scoreEquipe1<scoreEquipe2) {nombrePointEquipe2 = nombrePointEquipe2 + nombre_pts_victoire;
        System.out.println(nomEquipe1+ " a gagné");}

        else {
            nombrePointEquipe1++;
            nombrePointEquipe2++;
            System.out.println("match null");
        }
      
    }
 System.out.println(nomEquipe1+ " a "+nombrePointEquipe1+ " points");
 System.out.println(nomEquipe2+ " a "+nombrePointEquipe2+ "points");
}}