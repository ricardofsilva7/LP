import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Ler uma medida em polegadas e converter para milímetros");
        number =  in.nextDouble();
        result = (number/25.4);
        System.out.println("A media em milímetros é: " + result);

    }
}