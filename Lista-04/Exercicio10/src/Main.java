public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] matrix2 = {
                {7, 8},
                {9, 10}
        };
        int[][] matrixProduto = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrixProduto[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Matriz Produto:");
        for (int i = 0; i < matrixProduto.length; i++) {
            for (int j = 0; j < matrixProduto[0].length; j++) {
                System.out.print(matrixProduto[i][j] + " ");
            }
        }

    }
}