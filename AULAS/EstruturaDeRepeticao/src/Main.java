import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int i = 0;
        int op;
        int n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para imprimir a tabuada: ");
        n1 = in.nextInt();


        while (i < 100) {
            System.out.println(i);
            i++;
            //IMPRIMINDO TABUADA
            while (i <= 100) {
                System.out.println(i);
                i += n1;
            }

            do {
                System.out.println("1. opcao1\n2. opcao2\n3. opcao3\nEscolha uma opcao:");
                op = in.nextInt();
            } while (op < 1 || op > 3);
            System.out.println("voce escolheu " + op);


            // * for
            // *
            // * for (int i = 100; i > 0; i--) {
            // * System.out.println(i);
            // * }

           // for (int i = 1; i <= 10; i++) {
            //    for (int j = 1; j <= 5; j++) {
             //       System.out.println(j);
                }
              //  System.out.println("Sequencia " + i);
            }

        }
    }
}
