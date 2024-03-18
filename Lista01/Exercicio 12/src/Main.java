import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota - N1");
        number1 = in.nextDouble();
        System.out.println("Digite a nota - N2");
        number2 = in.nextDouble();
        result = (number1 + number2 * 2) / 3;
        System.out.println("A media entre as duas notas é: " + result);
    }
}
