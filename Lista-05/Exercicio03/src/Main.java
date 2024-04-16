import java.util.Scanner;

public class Main
{
    public static int obterNumero(Scanner scanner, String mensagem) //FUNÇÃO PARA O USUARIO PODER DIGITAR OS NUMEROS
    {
        System.out.println(mensagem);
        return scanner.nextInt();
    }
    public static int calculate(int base, int expoente) //FUNÇÃO PARA REALIZAR A OPERAÇÃO MATEMÁTICA
    {
        int resultado =1;
        for (int i=0; i < expoente; i++)
        {
            resultado *= base;
        }
        return  resultado;
    }

    public static void main(String[] args) // ABAIXO ESTÃO TODAS AS CHAMADAS DAS FUNÇÕES
    {
        Scanner scanner = new Scanner(System.in);
        int base = obterNumero(scanner, "Digite o numerador");
        int expoente = obterNumero(scanner, "Digite o operador");
        int result = calculate(base, expoente);
        System.out.println(result);
    }
}
