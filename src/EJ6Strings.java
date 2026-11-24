import java.util.Scanner;

    public class EJ6Strings {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Introdueix un text i prem enter:");
            String text = input.nextLine();
            String invertit = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                invertit += text.charAt(i);
            }

            System.out.println("Text invertit: " + invertit);
        }
    }