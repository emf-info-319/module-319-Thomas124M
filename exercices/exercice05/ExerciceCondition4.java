package exercices.exercice05;

public class ExerciceCondition4 {public static void main(String[] args) {
int temperature = 35;

if (temperature<=-10)
 {System.out.println("Il fait très froid");

}else if (-10<=temperature && temperature<0)
 {System.out.println("Il fait froid");

}else if (0<=temperature && temperature<25)
 {System.err.println("la temperature est neutre");

}else if (25<=temperature && temperature<35)
 {System.out.println("Il fait chaud");

}else if (temperature>=35)
 {System.out.println("Il fait très chaud");
}




}
    
}
