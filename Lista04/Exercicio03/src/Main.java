import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] matriz = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int numero;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor a consultar");
        numero = in.nextInt();

        for (int i = 0; i <=9; i++) {
            if (numero == matriz[i]) {
                System.out.println("A posição do numero "+numero+" é: " + i+"º");
                return;
            }
        }
                System.out.println("VALOR NÃO ENCONTRADO!");
    }
}