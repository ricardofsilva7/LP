import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do cone");
        number = in.nextDouble();
        System.out.println("Digite a altura do cone");
        number2 = in.nextDouble();
        result = (number * number2) / 3;
        System.out.println("O volume do cone é: " + result);
    }
}