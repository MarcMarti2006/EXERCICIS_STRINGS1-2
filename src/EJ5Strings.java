import java.util.Scanner;

public class EJ5Strings {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevisima historia del tiempo",
                "La clave secreta del universo", "Mi universo", "Patria",
                "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner input = new Scanner(System.in);

        System.out.println("Benvingut a la nostra biblioteca");
        System.out.println("Escriu el títol del llibre que vols cercar:");
        String titulo = input.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].equalsIgnoreCase(titulo)) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("S'ha localitzat el llibre");
        } else {
            System.out.println("No s'ha localitzat el llibre");
        }
    }
}