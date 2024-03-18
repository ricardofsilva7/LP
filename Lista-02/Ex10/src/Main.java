import java.util.Scanner;
//EX.10
public class Main {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do NUMERO 1: ");
        n1 = in.nextInt();
        System.out.println("Digite o valor do NUMERO 2: ");
        n2 = in.nextInt();
        System.out.println("Digite o valor do NUMERO 3: ");
        n3 = in.nextInt();

        if (n1 < n2 && n2 < n3){
            System.out.println("A ordem crescente é: " + n1 + " " + n2 + " " + n3);
        }
        else if (n3 < n2 && n2 < n1){
            System.out.println("A ordem crescente é: "+ n3 + " " + n2 + " " + n1);
        }
        else if (n2 < n1 && n1 < n3){
            System.out.println("A ordem crescente é: " + n2 + " " + n1 + " " + n3);
        }
        else if (n1 < n3 && n3 < n2){
            System.out.println("A ordem crescente é: " + n1 + " " + n3 + " " + n2);
        }
        else if (n2 > n1 && n3 < n2 && n1 > n3){
            System.out.println("A ordem crescente é: "+ n3 + " " + n1 + " " + n2);
        }
    }
}