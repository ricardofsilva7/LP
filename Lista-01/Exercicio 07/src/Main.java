import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Ler uma medida em milímetro e converter para polegadas");
        number =  in.nextDouble();
        result = (number* 25.4);
        System.out.println("A media em polegadas é: " + result);
    }
}