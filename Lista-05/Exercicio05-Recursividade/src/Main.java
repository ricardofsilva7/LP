import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] vetores() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos no array");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite os " + tamanho + " números do array");

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static int buscaBinariaRecursiva(int[] numeros, int alvo, int esquerda, int direita) {

        if (esquerda > direita) {
            return -1; // Elemento não encontrado
        }

        int meio = esquerda + (direita - esquerda) / 2;

        if (numeros[meio] == alvo) {
            return meio;
        }

        if (numeros[meio] < alvo) {
            return buscaBinariaRecursiva(numeros, alvo, meio + 1, direita);
        } else {
            return buscaBinariaRecursiva(numeros, alvo, esquerda, meio - 1);
        }
    }

    public static void main(String[] args) {

        int[] meuArray = vetores();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser buscado");
        int alvo = scanner.nextInt();

        Arrays.sort(meuArray);

        int posicao = buscaBinariaRecursiva(meuArray, alvo, 0, meuArray.length - 1);

        if (posicao != -1) {
            System.out.println("O valor " + alvo + " está na " + (posicao + 1) + "ª posição do array");
        } else {
            System.out.println("O valor " + alvo + " não foi encontrado no array");
        }
    }
}
