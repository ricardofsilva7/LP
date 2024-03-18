import java.util.Scanner;
//EX.14
public class Main {
    public static void main(String[] args) {
        int funcao, parcela;
        double n1, n2, pi, resultado, percentual;
        Scanner in = new Scanner(System.in);
        System.out.println("MENU: \n 1. PIX \n 2. DEBITO \n 3. CREDITO ");
        funcao = in.nextInt();

        switch (funcao) {
            case 1:
                System.out.println("Digite o valor da compra: ");
                n1 = in.nextDouble();
                percentual = 10.0 / 100.00;
                resultado = n1 - (percentual * n1);
                System.out.println("O valor total com desconto (PIX) é: R$ " + resultado);
                ;
                break;

            case 2:
                System.out.println("Digite o valor da compra: ");
                n1 = in.nextDouble();
                percentual = 5.0 / 100.00;
                resultado = n1 - (percentual * n1);
                System.out.println("O valor total com desconto (DEBITO) é: R$" + resultado);
                ;
                break;

            case 3:
                System.out.println("Digite o valor da compra: ");
                n1 = in.nextDouble();
                System.out.println("Digite o numero de parcelas: ");
                parcela = in.nextInt();
                if (parcela <= 4) {
                    resultado = n1 + n1 * parcela * 0.2;
                    System.out.println("O valor total em " + parcela +"x (CREDITO) é: R$ " + resultado);
                } else if (parcela > 4){
                    resultado = n1 + n1 * parcela * 0.5;
                    System.out.println("O valor total em "+ parcela +"x (CREDITO) é: R$ " + resultado);
                }
                break;

            default:
                System.out.println("VALOR INVÁLIDO");
                break;
        }
    }
}