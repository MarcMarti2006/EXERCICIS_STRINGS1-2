import java.util.Scanner;

public class EJ10Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alumnes = {"Paula", "Santiago", "Pascual", "Jorge", "Saul", "Enrique"};

        for (int i = 0; i < alumnes.length; i++) {
            System.out.print(alumnes[i]);
            if (i < alumnes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Quina posició vols canviar? (0 - " + (alumnes.length - 1) + "):");
        int posicio = input.nextInt();
        input.nextLine();

        if (posicio >= 0 && posicio < alumnes.length) {
            System.out.println("El nom actual és: " + alumnes[posicio]);
            System.out.println("Introdueix el nou nom:");
            String nouNom = input.nextLine();
            alumnes[posicio] = nouNom;

            for (int i = 0; i < alumnes.length; i++) {
                System.out.print(alumnes[i]);
                if (i < alumnes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("La posició entrada no existeix");
        }
    }
}