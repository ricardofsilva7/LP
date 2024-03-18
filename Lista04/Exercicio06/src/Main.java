public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotev = new int[vetor.length];
        int aux;

        for (int n: vetor) {
            System.out.print(n + " ");
        }
        for (int i=0; i<vetor.length/2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[(vetor.length - 1) - i];
            vetor[(vetor.length - 1) - i]=aux;
        }
        for (int n: rotev) {
            System.out.print(n + " ");
        }
    }
}