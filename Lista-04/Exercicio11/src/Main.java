import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de linhas da primeira matriz:");
        int linhasMatriz1 = scanner.nextInt();
        System.out.println("Informe o número de colunas da primeira matriz:");
        int colunasMatriz1 = scanner.nextInt();

        System.out.println("Informe o número de linhas da segunda matriz:");
        int linhasMatriz2 = scanner.nextInt();
        System.out.println("Informe o número de colunas da segunda matriz:");
        int colunasMatriz2 = scanner.nextInt();

        if (colunasMatriz1 != linhasMatriz2) {
            System.out.println("Não é possível calcular a matriz produto. O número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz.");
            return;
        }

        int[][] matriz1 = new int[linhasMatriz1][colunasMatriz1];
        int[][] matriz2 = new int[linhasMatriz2][colunasMatriz2];

        System.out.println("Informe os elementos da primeira matriz:");
        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz1; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Informe os elementos da segunda matriz:");
        for (int i = 0; i < linhasMatriz2; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }
        int[][] matrizProduto = calcularMatrizProduto(matriz1, matriz2);
        if (matrizProduto != null) {
            System.out.println("Matriz Produto:");
            exibirMatriz(matrizProduto);
        }
    }
    public static int[][] calcularMatrizProduto(int[][] matriz1, int[][] matriz2) {
        int linhasMatriz1 = matriz1.length;
        int colunasMatriz1 = matriz1[0].length;
        int linhasMatriz2 = matriz2.length;
        int colunasMatriz2 = matriz2[0].length;

        if (colunasMatriz1 != linhasMatriz2) {
            System.out.println("Não é possível calcular a matriz produto. O número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz.");
            return null;
        }
        int[][] matrizProduto = new int[linhasMatriz1][colunasMatriz2];

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    matrizProduto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return matrizProduto;
    }
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
