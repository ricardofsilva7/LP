import java.util.Scanner;
//EX.05
public class Main {
    public static void main(String[] args) {
        double nota1, nota2, resultado;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Nota (N1)");
        nota1 = in.nextDouble();
        System.out.println("Digite a Nota (N2)");
        nota2 = in.nextDouble();
        resultado = ((nota1+nota2) /2);
        if (resultado <5){
            System.out.println ("A nota é: D");
        } else if (resultado >=5 && resultado < 7) {
            System.out.println("A nota é: C");
        }
        if (resultado >= 7 && resultado <8.5){
            System.out.println("A nota é: B");
        } else if (resultado > 8.5) {
            System.out.println("A nota é: A");

        }
    }
}