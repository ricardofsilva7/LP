import java.util.Scanner;
//EX.04
public class Main {
    public static void main(String[] args) {
        double nota1, nota2, notarecuperacao, resultado, resultado2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota (N1):");
        nota1 = in.nextDouble();
        System.out.println("Digite a nota (N2): ");
        nota2 = in.nextDouble();
        resultado = ((nota1+nota2) /2 );

        if (resultado > 50) {
            System.out.println("APROVADO");

        }
        else if (resultado < 50) {
            System.out.println("Digite a nota da Prova de Recuperação");
            notarecuperacao = in.nextDouble();
            resultado2 = ((resultado + notarecuperacao) / 2);
            if (resultado2 > 50) {
                System.out.println("APROVADO");
            } else if (resultado2 < 50) {
                System.out.println("REPROVADO");
            }
        }
    }
}