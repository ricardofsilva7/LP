import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado;
        Scanner in = new Scanner(System.in);

        for (int i=0; i< matriz.length; i++) {
            resultado = (i % 2);
            if (resultado == 0) {
                System.out.print(i+2);
            }
            if (resultado >0){
                System.out.print(" "+i*2 + " ");
            }
        }
    }
}
