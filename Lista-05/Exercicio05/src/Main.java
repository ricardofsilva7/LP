import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] vetores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade elementos no array");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite os "+tamanho+ " números do Array");

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Valor "+ (i + 1)+ ": ");
            vetor[i]= scanner.nextInt();
        }
        return vetor;
    }

    public static int buscaBinaria(int[] numeros, int alvo)
    {
        int esquerda = 0;
        int direita = numeros.length - 1;

        while (esquerda <= direita)
        {
            int meio = esquerda + (direita - esquerda) / 2;

            if (numeros[meio] == alvo)
                return meio;

            if (numeros[meio] < alvo)
                esquerda = meio + 1;

            else
                direita = meio - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] meuArray = vetores();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser buscado");
        int alvo = scanner.nextInt();

        int posicao = buscaBinaria(meuArray, alvo);

        if (posicao != -1)
            System.out.println("O valor "+alvo+" está na "+(posicao+1)+ "º posição do array");
        else
            System.out.println("O valor de "+alvo+" não foi encontrado no array");
    }
}