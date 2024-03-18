import java.util.Scanner;
//EX.11
public class Main {
    public static void main(String[] args) {
        int n1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        n1 = in.nextInt();

        switch (n1){
            case 1:
                System.out.println( "1 - É DOMINGO");
                break;
            case 2:
                System.out.println( "2 - É SEGUNDA FEIRA");
                break;
            case 3:
                System.out.println( "3 - É TERÇA FEIRA");
                break;
            case 4:
                System.out.println( "4 - É QUARTA FEIRA");
                break;
            case 5:
                System.out.println( "5 - É QUINTA FEIRA");
                break;
            case 6:
                System.out.println( "6 - É SEXTA FEIRA");
                break;
            case 7:
                System.out.println( "7 - É SABADO");
                break;
            default:
                System.out.println("VALOR INVÁLIDO");
                break;
        }
    }
}
