import java.util.Scanner;
//EX.06
public class Main {
    public static void main(String[] args) {
        int valor1, valor2;
        int i;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        valor1 = in.nextInt();
        System.out.println("Digite o segundo valor desejado");
        valor2 = in.nextInt();

        if(valor1>valor2){
            int aux = valor1;
            valor1=valor2;
            valor2=aux;
        }
        for (i = valor1; i <= valor2; i++) {
                System.out.println(" " + i);
        }
    }
}