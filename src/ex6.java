import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = sc.nextInt();
        int[] T = new int[taille];
        // Remplissage du tableau T
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i=0; i<taille; i++) {
            System.out.print("Élément " +(i+1)+ " : ");
            T[i] = sc.nextInt();
        }
        // Création des tableaux TP et TN
        int[] TP = new int[taille];
        int[] TN = new int[taille];
        int indiceTP = 0, indiceTN = 0;
        // Copie des valeurs positives dans TP et des valeurs négatives dans TN
        for (int i=0; i<taille; i++) {
            if (T[i]>0) {
                TP[indiceTP++] = T[i];
            } else if (T[i] < 0) {
                TN[indiceTN++] = T[i];
            }
        }

        // Affichage du tableau T
        System.out.println("Tableau T :");
        afficherTableau(T, taille);

        // Affichage du tableau TP
        System.out.println("Tableau TP (composantes positives) :");
        afficherTableau(TP, indiceTP);

        // Affichage du tableau TN
        System.out.println("Tableau TN (composantes négatives) :");
        afficherTableau(TN, indiceTN);
    }

    public static void afficherTableau(int[] tableau, int taille) {
        for (int i=0; i<taille; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }
}
