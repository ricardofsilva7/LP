import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Ler uma medida de distância em quilômetros e converter para milhas");
        number =  in.nextDouble();
        result = (number/1.61);
        System.out.println("A media em milhas é: " + result);

    }
}