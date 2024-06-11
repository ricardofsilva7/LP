import java.util.Scanner;
//EX.01
public class Main {
    public static void main(String[] args) {

        double valor1, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para receber sua raiz quadrada:");
        valor1 = in.nextDouble();

        if (valor1 <= 0) {
            System.out.println("Valor Inválido");

        } else if (valor1 > 0) {
            resultado = Math.sqrt(valor1);
            System.out.println("A raiz quadrada de " + valor1 + " é igual a: " + resultado);
        }

    }
}
