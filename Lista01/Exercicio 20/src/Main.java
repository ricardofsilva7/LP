import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b, c, x1, x2;
        Scanner in = new Scanner(System.in);
        System.out.println("X1: ");
        x1 = in.nextDouble();
        System.out.println("X2: ");
        x2 = in.nextDouble();

        b = -(x1+x2);
        c = x1*x2;

        System.out.println("X² + (" + b + ")x + (" +c+") = 0");
    }
}