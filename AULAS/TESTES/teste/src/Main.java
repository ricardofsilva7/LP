import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  value = 0.0;
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Digite um numero");
            value = in.nextDouble();

            System.out.println("Digite outro numero");
            value += in.nextDouble();
            System.out.println("A MÉDIA É: " + (value +value) / 2);

        }catch (Exception e) {
            System.out.println("Deu Ruim");

            
        }
        
    }
}