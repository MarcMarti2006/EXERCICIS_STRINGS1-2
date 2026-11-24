import java.util.Scanner;

public class EJ5String2p {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevisima historia del tiempo",
                "La clave secreta del universo", "Mi universo", "Patria",
                "De mayor quiero ser feliz", "Empieza por los zapatos"};

        Scanner input = new Scanner(System.in);

        System.out.println("Benvingut a la nostra biblioteca");
        System.out.println("Escriu la paraula o paraules del títol del llibre que vols cercar:");
        String busqueda = input.nextLine();

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].contains(busqueda)) {
                System.out.println(catalogo[i]);
            }
        }
    }
}