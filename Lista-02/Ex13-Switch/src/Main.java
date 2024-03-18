import java.util.Scanner;
//EX.13
public class Main {
    public static void main(String[] args) {
        int funcao;
        double n1, n2, pi, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("MENU: \n 1. CIRCULO \n 2. TRIANGULO RETANGULO \n 3. RETANGULO ");
        funcao = in.nextInt();



        switch (funcao) {
            case 1:
                System.out.println("Digite o raio de um circulo");
                n1 = in.nextDouble();
                resultado = 3.14 * Math.pow(n1, 2);
                System.out.println("A área correspondente é: " + resultado);;
                break;

            case 2:
                System.out.println("Digite o cateto (1)");
                n1 = in.nextDouble();
                System.out.println("Digite o cateto (2)");
                n2 = in.nextDouble();
                resultado = (n1 * n2) / 2;
                System.out.println("A área correspondente ao Triangulo Retangulo é: " + resultado);
                break;

            case 3:
                System.out.println("Digite a base: ");
                n1 = in.nextDouble();
                System.out.println("Digite a altura: ");
                n2 = in.nextDouble();
                resultado = (n1 * n2) / 2;
                System.out.println("A área correspondente ao Triangulo Retangulo é: " + resultado);
                break;
            default:
                System.out.println("VALOR INVÁLIDO");
                break;
        }

    }
}