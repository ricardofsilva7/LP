import java.util.Scanner;

public class Main {
    public static boolean palindromo(String palavra) {

        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        return verificarPalindromo(palavra, 0, palavra.length() - 1);
    }

    private static boolean verificarPalindromo(String palavra, int inicio, int fim) {

        if (inicio >= fim) {
            return true;
        }
        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }

        return verificarPalindromo(palavra, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();

        if (palindromo(palavra))
            System.out.println("É UM PALÍNDROMO");
        else
            System.out.println("NÃO É UM PALÍNDROMO");
    }
}
