import java.util.Scanner;

public class Inversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();

        StringBuilder invertido = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--) {
            invertido.append(original.charAt(i));
        }

        System.out.println("String invertida: " + invertido.toString());
        scanner.close();
    }
}