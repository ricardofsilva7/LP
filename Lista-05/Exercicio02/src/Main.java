import java.util.Scanner;
public class Main {
    public static int obterNumero (Scanner scanner) //FUNÇÃO PARA RECEBER NUMERO DO USUARIO
    {
        System.out.println("Digite um numero, para exibir seu fatorial \n");
        return scanner.nextInt();
    }

    public static int fatorial (int a) //FUNÇÃO PARA REALIZAR OPERAÇÃO MAT. FATORIAL
    {
        int fatora = 1;
        for (int i = 1; i <= a; i++){
            fatora *= i;
        }
            return fatora;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero = obterNumero(scanner);
        int result = fatorial(numero);
        System.out.println("O fatorial de "+numero+" é igual a: "+result);
    }
}