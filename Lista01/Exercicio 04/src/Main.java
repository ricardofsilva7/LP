import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Ler duas notas N1 e N2 e exibir a média.");
        number =  in.nextDouble();
        result = (number+number/2);
        System.out.println("A media das duas notas: " + result);
    }
}