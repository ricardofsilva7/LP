import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            double v0, a, t, result;
            Scanner in = new Scanner(System.in);
            System.out.println("Insira a velocidade inicial");
            v0 = in.nextDouble();
            System.out.println("Insira a aceleração");
            a = in.nextDouble();
            System.out.println("Insira o tempo");
            t = in.nextDouble();
            result = v0+a*t;
            System.out.println(" A velocidade final é:  " + result);

    }

}