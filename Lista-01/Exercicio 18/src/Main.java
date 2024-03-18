import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, number2, x, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o coeficiente A");
        number = in.nextDouble();
        System.out.println("Digite o coeficiente B");
        number2 = in.nextDouble();
        result = x = -number2 / number;
        System.out.println("O resultado da equação de primeiro grau é: " + result);
    }
}