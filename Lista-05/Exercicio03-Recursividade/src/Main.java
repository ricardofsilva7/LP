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
        if (expoente==0) //CONDIÇÕES PARA EXECUTAR A OPERAÇÃO MATEMATICA
        {
            return 1;
        }
        else if (expoente==1)
        {
            return base;
        }
        else if (expoente % 2 == 0)
        {
            int multi = calculate(base, expoente /2);
            return multi * multi;
        }
        else
            return base * calculate(base, expoente - 1);
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