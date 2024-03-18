import java.util.Scanner;
//EX.10
public class Main {
    public static void main(String[] args) {
      int n, n1, n2, aux;
      n1=0;
      n2=1;

        System.out.println("\nDigite o limite esperado para a sequência Fibonacci");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(0);
        while (n2<n){
            System.out.println(n2);
            aux=n1;
            n1=n2;
            n2=aux+n2;
        }


    }
}