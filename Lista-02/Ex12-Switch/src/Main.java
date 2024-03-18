import java.util.Scanner;
//EX.12
public class Main {
    public static void main(String[] args) {
        int n1, n2, funcao, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = in.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = in.nextInt();
        System.out.println("MENU \n 1. SOMA \n 2. SUBTRAÇÃO \n 3. MULTIPLICAÇÃO \n 4. DIVISÃO");
        funcao = in.nextInt();

        switch (funcao) {
            case 1:
                resultado = (n1 + n2);
                System.out.println("A SOMA DE " + n1 + " + " + n2 + " É IGUAL A: " + resultado);
                break;
            case 2:
                resultado = (n1 - n2);
                System.out.println("A SUBTRAÇÃO DE " + n1 + " - " + n2 + " É IGUAL A: " + resultado);
                break;
            case 3:
                resultado = (n1 * n2);
                System.out.println("A MULTIPLICAÇÃO DE " + n1 + " * " + n2 + " É IGUAL A: " + resultado);
                break;
            case 4:
                resultado = (n1 / n2);
                System.out.println("A DIVISÃO DE " + n1 + " / " + n2 + " É IGUAL A: " + resultado);
                break;
            default:
                System.out.println("VALOR INVÁLIDO");
                break;
        }
    }
}