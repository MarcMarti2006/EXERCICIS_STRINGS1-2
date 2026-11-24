import java.util.Scanner;

public class EJ7Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indica quina de les següents opcions no és un tipus primitiu a Java:");
        System.out.println("a. int");
        System.out.println("b. char");
        System.out.println("c. boolean");
        System.out.println("d. String");

        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("d")) {
            System.out.println("Resposta correcta!");
        } else if (resposta.equalsIgnoreCase("a") || resposta.equalsIgnoreCase("b") || resposta.equalsIgnoreCase("c")) {
            System.out.println("Resposta incorrecta, la resposta correcta és: d");
        } else {
            System.out.println("Resposta no vàlida: a, b, c, d");
        }
    }
}