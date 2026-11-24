import java.util.Scanner;

public class EJ9Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introdueix un text acabat en punt:");
        String text = input.nextLine();

        String[] paraules = text.split(" ");
        int numParaules = paraules.length;

        String vocals = "aeiouAEIOU";
        int numVocals = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vocals.indexOf(c) != -1) {
                numVocals++;
            }
        }

        System.out.println("Nombre de paraules: " + numParaules);
        System.out.println("Nombre de vocals: " + numVocals);
    }
}