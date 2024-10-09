package devoirs.devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int day = 8;
        System.out.println("la date entrée est le " + day + "." + month + "." + year);
        int[] tab = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (year % 4 == 0) {
            tab[1] = 29;
        }
        
        if (year < 0 || year > 9999) {
            System.out.println("l'année [" + year + "] est hors limites !");
        } else if (day < 0 || day > 31) {
            System.out.println("le jour [" + day + "] est hors limites !");
        } else if (year < 0 || year > 9999 && day < 0 || day > 31) {
            System.out.println("le jour et l'année [" + day + "] [" + year + "] sont hors limites !");

        } else
            switch (month) {

                case 1:
                    System.out.println("la date formatée est le " + day + " janvier " + year);
                    break;
                case 2:
                    System.out.println("la date formatée est le " + day + " février " + year);
                    break;
                case 3:
                    System.out.println("la date formatée est le " + day + " mars " + year);
                    break;
                case 4:
                    System.out.println("la date formatée est le " + day + " avril " + year);
                    break;
                case 5:
                    System.out.println("la date formatée est le " + day + " mai " + year);
                    break;
                case 6:
                    System.out.println("la date formatée est le " + day + " juin " + year);
                    break;
                case 7:
                    System.out.println("la date formatée est le " + day + " juillet " + year);
                    break;
                case 8:
                    System.out.println("la date formatée est le " + day + " août " + year);
                    break;
                case 9:
                    System.out.println("la date formatée est le " + day + " septembre " + year);
                    break;
                case 10:
                    System.out.println("la date formatée est le " + day + " octobre " + year);
                    break;
                case 11:
                    System.out.println("la date formatée est le " + day + " novembre " + year);
                    break;
                case 12:
                    System.out.println("la date formatée est le " + day + " décembre " + year);
                    break;
                default:
                    System.out.println("le mois [" + month + "] est hors limites !");
                    break;

            }
    }
}
