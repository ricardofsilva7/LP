import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            double number, result;
            Scanner in = new Scanner(System.in);
            System.out.println("Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit");
            number = in.nextDouble();
            result = (number * 1.8 + 32);
            System.out.println("A temperatura em Fahrenheit é: " + result);
        }
}
