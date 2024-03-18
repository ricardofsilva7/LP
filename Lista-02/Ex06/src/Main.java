import java.util.Scanner;
//EX.06
public class Main {
    public static void main(String[] args) {
        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções de Cédulas: \n 5 \n 6 \n 7 \n 8 \n 9 \n Digite o valor desejado: ");
        option =(int) in.nextDouble();
        if (option != 5 && option !=6 && option !=7 && option !=8 && option !=9){
            System.out.println("VALOR INVÁLIDO");
        }
    }
}