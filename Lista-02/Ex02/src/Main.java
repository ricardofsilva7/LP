import java.util.Scanner;
//EX.02
public class Main {
    public static void main(String[] args) {

        double valor1, valor2, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = in.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = in.nextDouble();

        if (valor1 > valor2) {
            System.out.println("O valor real maior é: " + valor1);
        } else if (valor1 < valor2) {
            resultado = Math.sqrt(valor1);
            System.out.println("O valor real maior é: " + valor2);
        }
        if (valor1== valor2) {
            System.out.println("OS VALORES SÃO IGUAIS!");
        }


    }
}