import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;
        Scanner in = new Scanner(System.in);
        System.out.println("Ler um numero inteiro e exibir seu quadrado");
        number =  in.nextInt();
        result = number*number;
        System.out.println("O dobro do numero digitado " + result);


    }

}