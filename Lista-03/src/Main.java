import java.util.Locale;
import java.util.Scanner;

    public class primeNumbers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scan.nextInt();


        for (int a = 0; a <= n; a++) {
            if (a % 2 == 1) {

                System.out.println(+a);

            }
        }
    }
}
