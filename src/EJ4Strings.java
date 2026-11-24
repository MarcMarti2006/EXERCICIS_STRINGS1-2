import java.util.Scanner;

public class EJ4Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix un text: ");
        String texto = input.nextLine();

        if (!texto.isEmpty()) {
            System.out.println("Introdueix una paraula per cercar: ");
            String palabra = input.nextLine();

            if (texto.indexOf(palabra) != -1) {
                System.out.println("S'ha localitzat la paraula");
            } else {
                System.out.println("No s'ha localitzat la paraula");
            }
        }
    }
}