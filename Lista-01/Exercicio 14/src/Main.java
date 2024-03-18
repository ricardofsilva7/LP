import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do triangulo retangulo");
        number = in.nextDouble();
        System.out.println("Digite a altura do triangulo retangulo");
        number2 = in.nextDouble();
        result = (number * number2) /2;
        System.out.println("A área do triangulo retangulo é: " + result);
    }
}