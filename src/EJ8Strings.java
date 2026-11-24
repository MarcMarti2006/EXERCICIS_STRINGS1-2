import java.util.Scanner;

public class EJ8Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pelicula = "Forrest Gump";
        String oculta = "";

        for (int i = 0; i < pelicula.length(); i++) {
            if (i == 0) {
                oculta += pelicula.charAt(i);
            } else if (pelicula.charAt(i) == ' ') {
                oculta += " ";
            } else {
                oculta += "*";
            }
        }

        System.out.println("Benvingut al Mini joc del penjat");
        System.out.println("Intenta endevinar la pel·lícula");
        System.out.println(oculta);

        for (int intent = 0; intent < 3; intent++) {
            System.out.println("Introdueix una lletra:");
            String lletraText = input.nextLine();
            char lletra = lletraText.charAt(0);

            String novaOculta = "";
            for (int i = 0; i < pelicula.length(); i++) {
                if (pelicula.charAt(i) == lletra) {
                    novaOculta += lletra;
                } else {
                    novaOculta += oculta.charAt(i);
                }
            }

            oculta = novaOculta;
            System.out.println(oculta);
        }
    }
}