package exercices;

public class settableaux1 {
    public final static int MAX = 9;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int[] tableauNoir = new int[8];

        for (int i = 0; i < tableauNoir.length; i++) {
            tableauNoir[i] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("TableauNoir " + i + " : " + tableauNoir[i]);
        }
        int[] tableauBlanc = new int[8];

        for (int a = 0; a < tableauBlanc.length; a++) {
            tableauBlanc[a] = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
System.out.println("TableauBlanc " +a+ " : " + tableauBlanc[a]);
        }
        int tableauMétisse =0;
        for (int i =0 ; i <tableauMétisse.length; i++) {tableauMétisse = cellule +tableau1[i];}
            }

}
