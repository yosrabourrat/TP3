import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tableau = new int[10];
        System.out.println("Veuillez entrer les éléments du tableau :");
        for (int i=0; i<tableau.length; i++) {
            System.out.print("Élément " +(i+1)+ " : ");
            tableau[i] = sc.nextInt();
        }
        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " +(i+1)+ " : " +tableau[i]);
        }
    }
}
