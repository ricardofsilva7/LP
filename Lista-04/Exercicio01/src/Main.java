import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner in = new Scanner(System.in);

        for (int i= numeros.length-1; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}