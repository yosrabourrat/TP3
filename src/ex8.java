import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = sc.nextInt();

        // Création du tableau
        int[] tableau = new int[taille];

        // Remplissage du tableau
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i=0; i<taille; i++) {
            System.out.print("Élément " +(i+1)+ " : ");
            tableau[i] = sc.nextInt();
        }
        // Calcul du plus grand écart dans le tableau
        int ecart = maxEcart(tableau);

        // Affichage du plus grand écart
        System.out.println("Le plus grand écart dans le tableau est : " +ecart);
    }

    public static int maxEcart(int[] tableau) {
        int ecart2 = Integer.MIN_VALUE; //C'est le nombre le plus petit qu'on peut stocker dans une variable de type int
        for (int i=0; i<tableau.length-1; i++) {
            for (int j=i+1; j<tableau.length; j++) {
                int ecart1 = Math.abs(tableau[i]-tableau[j]);
                if (ecart1>ecart2) {
                    ecart2 = ecart1;
                }
            }
        }
        return ecart2;
    }
}
