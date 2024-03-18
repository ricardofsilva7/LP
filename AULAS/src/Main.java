import java.util.Scanner;

public class Main {

    static int retornaMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return (maior);
    }

    // MAIOR E MENOR = ESTRUTURA DE REPETIÇÃO (INTERNET)
    static int retornaMenor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return (menor);
    }

    public static void main(String[] args) {

        int[] vetor = new int[4];
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("digite o " + (i + 1) + "ª valor: ");
            vetor[i] = dados.nextInt();


            System.out.println("maior valor:" + retornaMaior(vetor));
            System.out.println("menor valor:" + retornaMenor(vetor));
        }
    }
}