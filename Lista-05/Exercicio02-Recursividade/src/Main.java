import java.util.Scanner;
public class Main
{
        public static int obterNumero (Scanner scanner)
        {
            System.out.println("Digite um numero, para exibir seu fatorial \n");
            return scanner.nextInt();
        }

        public static int fatorial (int a)
        {
            if (a==1)
                return 1;
            else
                return a*fatorial(a-1);
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int numero = obterNumero(scanner);
            int result = fatorial(numero);
            System.out.println("O fatorial de "+numero+" é igual a: "+result);
        }
}
