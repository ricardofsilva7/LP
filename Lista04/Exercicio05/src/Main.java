public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotev = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            rotev[(vetor.length - 1) - 1] = vetor[i];
        }
        for (int n: vetor) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n: rotev) {
            System.out.print(n + " ");
        }

    }
}