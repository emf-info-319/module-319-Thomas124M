package exercices.exercice12;

public class Exercice12 {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.println(maChaineDeCaractere);

        System.out.println(
                "nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());
        System.out.println("la mot \"contenu\" commence à la position : " + maChaineDeCaractere.indexOf("contenu"));
        System.out.println("le position 17 contient la lettre : " + maChaineDeCaractere.charAt(17));

        String monPrénom = "Thomas";
        for (int i = 0; i < monPrénom.length(); i++) {
            System.out.println("la lettre à la position " + i + " est : " + monPrénom.charAt(i));

        }
        if (monPrénom.contains("test")) {System.out.println("la chaîne de caractère \""+monPrénom+"\" contient le texte \"test\"");
    
}else {System.out.println("la chaîne de caractère \""+monPrénom+"\" ne contient pas le texte \"test\"");}
    }

}
