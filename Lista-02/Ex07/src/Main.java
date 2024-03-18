import java.util.Scanner;
//EX.07
public class Main {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o coeficiente A");
        a = in.nextDouble();
        System.out.println("Digite o coeficiente B");
        b = in.nextDouble();
        System.out.println("Digite o coeficiente C");
        c = in.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("O resultado da equação do segundo grau é X1: " + x1 + " e X2 é igual: " + x2);
        } else if (delta < 0){
            System.out.println("NÃO HÁ RAIZES NO CONJUNTO DE NUMEROS REAIS");
        }   }
}