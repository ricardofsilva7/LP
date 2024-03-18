import java.util.Scanner;
//EX.08
public class Main {
    public static void main(String[] args) {
        int valor, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        valor = in.nextInt();
        resultado = (valor % 2 );

        if (resultado>0){
            System.out.println("O valor digitado é: ÍMPAR");
        } else if (resultado==0) {
            System.out.println("O valor digitado é: PAR");
        }
        if (resultado <0){
            System.out.println("VALOR INVÁLIDO");
        }
    }
}