import java.util.Scanner;

public class EJ3Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix un text: ");
        String text = scanner.nextLine();

        System.out.println("Majúscules: " + text.toUpperCase());
        System.out.println("Minúscules: " + text.toLowerCase());
    }
}