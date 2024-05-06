import java.util.Scanner;
//FUNÇÃO SIMPLES - ESTUDOS//
public class Funcao {

    static void sum (int x, int y)
    {
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        sum(10 , 5);
        sum(10 , 5);
        sum(10 , 5);
        sum(10 , 5);
        Scanner.close();
    }
}

