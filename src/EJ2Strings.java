public class EJ2Strings {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        System.out.println("Nom del fitxer: " + path.substring(10,15));
        System.out.println("Extensió del fitxer: " + path.substring(16));
    }
}