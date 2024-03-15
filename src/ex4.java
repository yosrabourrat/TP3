import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Demander à l'utilisateur de saisir la taille du tableau
        int taille;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = sc.nextInt();
        } while (taille<10 || taille>50);
        int[] T = new int[taille];
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i=0; i<taille; i++) {
            System.out.print("Élément " +(i+1)+ " : ");
            T[i] = sc.nextInt();
        }
        System.out.println("Tableau T avant la suppression des occurrences de 5 :");
        afficherTableau(T, taille);
        // Suppression des occurrences de 5 et tassement des éléments restants
        int taille2 = occETclassement(T, taille);
        System.out.println("Tableau T après la suppression des occurrences de 5 :");
        afficherTableau(T,taille2);
    }
    public static void afficherTableau(int[] tableau, int taille) {
        for (int i=0; i<taille; i++) {
            System.out.print(tableau[i]+ " ");
        }
        System.out.println();
    }
    // Méthode pour supprimer les occurrences de 5 et tasser les éléments restants
    public static int occETclassement(int[] tableau, int taille) {
        int taille2 = 0;
        for (int i=0; i<taille; i++) {
            if (tableau[i] != 5) {
                tableau[taille2++] = tableau[i];
            }
        }
        return taille2;
    }
}
