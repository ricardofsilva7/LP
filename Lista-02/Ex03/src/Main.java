import java.util.Scanner;
//EX.03
public class Main {
    public static void main(String[] args) {
        double nota1, nota2, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota (N1):");
        nota1 = in.nextDouble();
        System.out.println("Digite a nota (N2): ");
        nota2 = in.nextDouble();
        resultado = ((nota1+nota2) /2 );

        if (resultado < 50) {
            System.out.println("REPROVADO");
        } else if (resultado > 50) {
            System.out.println("APROVADO");

        }

    }


}