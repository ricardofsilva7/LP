import java.util.Scanner;
//EX.05
public class Main {
    public static void main(String[] args) {
        int valor;
        int i, fatorial=1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        valor= in.nextInt();

        for ( i=1; i<=valor; i++)
            fatorial = fatorial*i ;

        System.out.println("O fatorial de "+valor+ "! é: "+fatorial);

    }
}