import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, pi, result;
        pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio de um circulo");
        number = in.nextDouble();
        result = 3.14 * Math.pow(number,2);
        System.out.println("A área correspondente é: " + result);
    }
}