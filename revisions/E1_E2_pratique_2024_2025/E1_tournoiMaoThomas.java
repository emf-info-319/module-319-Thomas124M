package revisions.E1_E2_pratique_2024_2025;

public class E1_tournoiMaoThomas {

    public final static String[] EQUIPES = { "FC Richmont", "FC Cental", "FC Schoenberg", "FC Beauregard",
            "Team AFF", "Etoile Sport" };
    public final static int MAX_GOAL = 10;
public static int[]pointsEquipes;

    public static void main(String[] args) {
        pointsEquipes = new int [EQUIPES.length];

        for (int i= 0; i < EQUIPES.length; i++) {
           if(i < EQUIPES.length-1){
            simuleMatch(i, i+1);
           }
           else{
            simuleMatch(i,0);
           }
        }
        System.out.println("--------------------------");

        for (int i = 0; i < EQUIPES.length; i++) {
            System.out.println("l'équipe " + EQUIPES[i] + " a " + pointsEquipes[i] + " points");

        }

        System.out.println("--------------------------");
        int [] gagnant = trouveGagnants();
for (int i = 0; i < gagnant.length; i++) {
    System.out.println("l'équipe "+ EQUIPES[gagnant[i]]+" a gagné");
}

    }

    public static void simuleMatch(int equipe1, int equipe2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) - 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) - 0;

if (scoreEquipe1>scoreEquipe2){
    pointsEquipes[equipe1] = pointsEquipes[equipe1]+3;
    System.out.println(EQUIPES[equipe1]+" a gagné contre "+EQUIPES[equipe2]);
}
else if (scoreEquipe2>scoreEquipe1){
    pointsEquipes[equipe2] = pointsEquipes[equipe2]+3;
    System.out.println(EQUIPES[equipe2]+" a gagné contre "+EQUIPES[equipe1]);
}
else {
    pointsEquipes[equipe1]=pointsEquipes[equipe1]+1;
    pointsEquipes[equipe2]=pointsEquipes[equipe2]+1;
    System.out.println("match nul entre "+EQUIPES[equipe1]+" et "+EQUIPES[equipe2]);
}
    }
public static int rechercheMaxPts(){
    int maxPts = 0;
    for ( int i = 0; i < EQUIPES.length; i++) {
        if (pointsEquipes[i]>maxPts){
            maxPts = pointsEquipes[i];
        }
    }
return maxPts;
}

public static int []trouveGagnants(){
    int [] equipeGagnante;
    int maxPts = rechercheMaxPts();


    int compteurDesGagnants = 0;
    for (int i = 0; i < EQUIPES.length; i++) {
        if (pointsEquipes[i] == maxPts){
        compteurDesGagnants++;
        }
    }
int compteur = 0;
equipeGagnante = new int [compteurDesGagnants];
    for (int i = 0; i < EQUIPES.length; i++) {
        if(pointsEquipes[i] == maxPts){
        equipeGagnante[compteur++]=i;
        }
    }
    return equipeGagnante;
}
}

