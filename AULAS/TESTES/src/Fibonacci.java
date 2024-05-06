import java.util.Scanner;
//AULA (JAVA) THIAGO AGUIAR = #27
public class Fibonacci {

    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;
        int limit = input.nextInt();

        //Estrutura de repetição - com condição de rodar enquanto o 'f2' for menor que 'limit'(valor do usuario)//
        while (f2 < limit)
        {
            int fn = f1+f2;
            if (fn > limit) //Condição de parada quando o resultado 'f1+f2' for maior que 'limit'
                break;

            System.out.println(fn);
            //Recebe os valores atualizados da soma de fibonacci, sem eles o programa retornaria (0 e/ou 1)//
            f1=f2;
            f2=fn;
        }
    }

}
