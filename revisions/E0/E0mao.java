public class E0mao {
    public final static int nbr_MIN = 1;
    public final static int nbr_MAX = 6;
    public final static int nbr_NOTES = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[nbr_NOTES];
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * (nbr_MAX - nbr_MIN + 1)) + nbr_MIN;
            System.out.print("la note obtenue est " + notesObtenues[i] + " : ");
            switch (notesObtenues[i]) {
                case 4:
                    System.out.println("suffisant");
                    break;
                case 5:
                    System.out.println("bien");
                    break;
                case 6:
                    System.out.println("très bien");
                    break;
                default:
                    System.out.println("insuffisant");
            }
        }
        int totalNotes = 0;
        for (int i = 0; i < notesObtenues.length; i++) {
            totalNotes = totalNotes + notesObtenues[i];
        }
        double moyenne = totalNotes / nbr_NOTES;
        System.out.println("la moyenne est de : " + moyenne);
        if (moyenne >= 4) {
            System.out.println("l'éléve est promu");
        } else {
            System.out.println("l'éléve est non promu");
        }

    }

}
