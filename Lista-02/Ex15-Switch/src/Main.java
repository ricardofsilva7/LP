import java.util.Scanner;
//EX.15
public class Main {
    public static void main(String[] args) {
        int dinheiro, parcela, escolha;
        double n1, n2, pi, resultado, percentual;
        Scanner in = new Scanner(System.in);
        System.out.println("INSIRA O DINHEIRO: ");
        dinheiro = in.nextInt();
        System.out.println("MENU: \n 1. CAFÉ EXPRESSO \n 2. CAFÉ LONGO   \n 3. CAPUCCINO \n 4. Chocolate ");
        escolha = in.nextInt();

        switch (escolha) {
            case 1:
                resultado = dinheiro - 0.50;
                System.out.println("Bebida Selecionada: CAFÉ EXPRESSO \n O seu troco é: " + resultado);
                break;

            case 2:
                resultado = dinheiro - 1.00;
                System.out.println("Bebida Selecionada: CAFÉ LONGO \n O seu troco é: " + resultado);
                break;

            case 3:
                resultado = dinheiro - 2.50;
                System.out.println("Bebida Selecionada: CAPUCCINO \n O seu troco é: " + resultado);
                break;

            case 4:
                resultado = dinheiro - 2.00;
                System.out.println("Bebida Selecionada: CHOCOLATE \n O seu troco é: " + resultado);
                break;

            default:
                System.out.println("VALOR INVÁLIDO, TENTE NOVAMENTE");
                break;

        }
    }
}