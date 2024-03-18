import java.util.Scanner;
//EX.09
public class Main {
    public static void main(String[] args) {

        int resposta, op;
        resposta = 0;
        Scanner in = new Scanner(System.in);
        do {
            for (int i = 1; i <= 10; i++) {
                int j;
                for (j = 0; j <= 10; j++) {
                    System.out.println(i + "x" + j + "=");
                    resposta = in.nextInt();

                    if (resposta != i *j) {
                        System.out.println("Você errou");
                        break;
                    }
                }
                if (resposta != i * (j-1))
                    break;
                if (i == 10 && j == 10)
                    System.out.println("Parabéns, você ganhou!");
            }
            System.out.println("Deseja jogar novamente \n1. Sim \n2. Não");
            op = in.nextInt();
        }while (op == 1);
            System.out.println("Obrigado por jogar.");

    }
}
