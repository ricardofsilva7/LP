import java.util.Scanner;

public class Main {
    public static int obterNumero (Scanner scanner) //FUNÇÃO QUE IRÁ RECEBER O NUMERO DO USUARIO
    {
        System.out.println("Digite um numero: ");
        return scanner.nextInt();
    }

    public static int somar(int a) //FUNÇÃO QUE IRÁ EXECUTAR A OPERAÇÃO MATEMÁTICA//
    {
        int soma = 0;                   //VARIÁVEL QUE IRÁ ARMAZENAR O VALOR
        for (int i = 0; i <= a; i++) {  //LOOP PARA O PROGRAMA PERCORRER OS NUMEROS QUE IRÃO SER SOMADOS
            soma += i;
        }
        return soma;
    }
    public static void main(String[] args)  //FUNÇÃO MAIN, QUE IRÁ RECEBER E EXECUTAR AS FUNÇÕES ANTERIORES
    {
        Scanner scanner = new Scanner(System.in);
        int numero = obterNumero(scanner);
        int resultado = somar(numero);
        System.out.println("A soma de "+ numero+" mais seus antecessores é: "+resultado);
    }
}

