import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int taille;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = sc.nextInt();
        } while (taille<10 || taille>50);

        // Déclaration
        int[] tableau = new int[taille];

        // Remplissage
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i=0; i<tableau.length; i++) {
            System.out.print("Élément " +(i+1)+ " : ");
            tableau[i] = sc.nextInt();
        }

        // Affichage
        System.out.println("Les éléments du tableau sont :");
        for (int i=0; i<tableau.length; i++) {
            System.out.println("Élément " +(i+1)+ " : " +tableau[i]);
        }
    }
}
