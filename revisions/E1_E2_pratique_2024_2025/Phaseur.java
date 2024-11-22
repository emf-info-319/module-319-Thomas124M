package revisions.E1_E2_pratique_2024_2025;

public class Phaseur {public static void main(String[] args) {
    
String[]sujets = new String[]{"Filip","Ephram","Alex","Thomas",};
String[]verbes = new String[]{"promène","mange","construit","joue"};
String[]choses = new String[]{"des chiens","des mems","des usines","aux jeux vidéos"};
for (int i = 0; i < 10; i++) {
    System.out.println(choisiMot(sujets)+" "+choisiMot(verbes)+" "+choisiMot(choses));

    
}


}
    public static int nombreAleatoire(int min,int max){
        int nombre = (int)(Math.random()*(max-min+1))+min;
return nombre;
    }
    public static String choisiMot(String[]tab){
int indiceMin =0;
int indiceMax = tab.length;
return tab[nombreAleatoire(indiceMin, indiceMax)];
    }
}
