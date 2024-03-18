import java.util.Scanner;
//EX.09
public class Main {
    public static void main(String[] args) {
        int valor1, valor2, valor3;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do LADO1: ");
        valor1 = in.nextInt();
        System.out.println("Digite o valor do LADO2: ");
        valor2 = in.nextInt();
        System.out.println("Digite o valor do LADO3: ");
        valor3 = in.nextInt();

        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("O triângulo é: EQUILÁTERO");
        }
        else if (valor1 == valor2 || valor2 == valor3 || valor3==valor1) {
            System.out.println("O triângulo é: ISÓSCELES");
        }
        if (valor1 != valor2 && valor2 != valor3 && valor3 != valor1) {
            System.out.println("O triângulo é: ESCALENO");
        }
    }
}