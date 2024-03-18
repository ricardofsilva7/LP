import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int maior = 0;
        int menor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite nº" + (i + 1) + ":");
            numbers[i] = in.nextInt();
            if (i == 0) {
                maior = numbers[i];
                menor = numbers[i];
            } else {
                if (numbers[i] > maior) {
                    maior = numbers[i];
                    posicaoMaior = i;
                }
                if (numbers[i] < menor) {
                    menor = numbers[i];
                    posicaoMenor = i;
                }
            }
        }

        System.out.println("A posição do maior numero "+maior+" é: " + posicaoMaior+"º");
        System.out.println("A posição do menor numero "+menor+" é: " + posicaoMenor+"º");
    }

}


