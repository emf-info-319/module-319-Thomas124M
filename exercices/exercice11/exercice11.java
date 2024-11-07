package exercices.exercice11;

public class exercice11 {
    public final static int MAX = 100;
    public final static int MIN = 0;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }

        int[] tableauFinal = new int[4];
        tableauFinal = inverseLeTableau(tableauInitial);
        System.out.println("Contenu du tableau final :");
        for (int j = 0; j < tableauFinal.length; j++) {
            System.out.println("Tableau initial [" + j + "] = " + tableauFinal[j]);
        }

    }

    public static int[] inverseLeTableau(int[] tableauInitial) {
        int[] tableauFinal = new int[4];

        for (int i = tableauInitial.length - 1; i >= 0; i--) {

            tableauFinal[i] = tableauInitial[tableauInitial.length - 1 - i];

        }
        return tableauFinal;
    }
}
