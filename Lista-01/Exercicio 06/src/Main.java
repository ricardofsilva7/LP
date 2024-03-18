import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Ler uma velocidade em m/s e converter para km/h");
        number =  in.nextDouble();
        result = (number*3.6);
        System.out.println("A velocidade em km/s: " + result);
    }
}