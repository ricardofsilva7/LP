import java.util.Scanner;
//EX.03
public class Main {
    public static void main(String[] args) {

        int n1= 4;
        int op;


        for (int i=1; i<=200; i++) {
            op = (i % 4);                   //lembrar que % significa restar

            if (op == 0){
                System.out.println(i);
            }

        }
    }
}