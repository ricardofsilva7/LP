import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, number2, pi, result;
        pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio do cilindro");
        number = in.nextDouble();
        System.out.println("Digite a altura do cilindro");
        number2 = in.nextDouble();
        result = pi * Math.pow(number,2) * number2;
        System.out.println("O volume do cilindro é: " + result);
    }
}