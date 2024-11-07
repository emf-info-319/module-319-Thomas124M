package exercices;

public class coaching {
    public static void main(String[] args) {
        int[] notesModules = new int[5]; //là, on déclare et on crée un tableau.

        // notesModules[4] = 5;
        for (int i = 0; i < notesModules.length; i++) {
            notesModules[i] = 5; // là dans cette boucle, on le remplit notre tableau que de la valeur 5.

            System.out.println("note " + i + " : " + notesModules[i]); // là on va déclarer un sout pour afficher les valeurs de notre tableau et le i sert à numéroter de 0 jusqu'à la taille.
        }

    }

}
