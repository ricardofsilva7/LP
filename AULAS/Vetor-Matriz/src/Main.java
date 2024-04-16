public class Main {
    public static void main(String[] args) {
        int n1=5, n2=3;

        sum(n1,n2);
    }
   static void sum (int a, int b){
        int sum = a+b;
       System.out.println(sum);

    }
}

//AULA SEXTA

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Soma = "+somar(receber()));
        System.out.println("Fatorial = "+fatorial(receber()));
    }

    static int receber(){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Digite um numero maior que 0:");
            n=in.nextInt();
        }while(n<=0);
        return n;
    }

    static int fatorial(int n){
        int resultado=1;
        for(int i=n;i>1;i--)
            resultado*=i;
        return resultado;
    }

    static int somar(int n){
        int soma=0;
        for (int i=1;i<=n;i++)
            soma+=i;
        return soma;
    }

}

//LISTA04 - EX08.

public class Main {
    public static void main (String[] args){
        int [][] matriz = { {3,1,3},
                            {2,4,1},
                            {1,2,2}};
        diag_principal(matriz);
        determinante(matriz);
    }
    static void diag_principal(int [][]matriz){
        if (matriz.length==matriz[0].length){
            for (int i=0; i <matriz.length; i++){
                for (int j = 0; j < matriz[0].length; j++){
                    if (i==j)
                        System.out.println(matriz[i][j]+ ", ");
                }
            }
        }else{
            System.out.println("A Matriz não é quadrada!");
        }
    }
    //EX09
    static void diag_secundaria (int [][]m){
        for (int i=0; i<m.length; i++) {
            for (int j=m[0].length-1; i--) {

                System.out.println(m[i][m[0].length-1-i]);

            }
        }

    }
    //LISTA04 - EX12

    public class Main {
        public static void main(String[] args) {
            int[][] matriz = {{1, 2, 1},
                    {3, 2, 2},
                    {1, 1, 3}};
            int resultado = determinante(matriz);
            System.out.println("Determinante = " + resultado);
        }

        static int determinante(int[][] m) {
            int cont_pos, mult_pos, det = 0;
            int cont_neg, mult_neg;
            for (int i = 0; i < m.length; i++) {
                cont_pos = i;
                cont_neg = i;
                mult_pos = 1;
                mult_neg = 1;
                for (int j = 0; j < m[0].length; j++) {
                    mult_pos *= m[j][cont_pos];
                    mult_neg *= m[j][cont_neg];
                    cont_pos++;
                    cont_neg--;
                    if (cont_pos > m.length - 1)
                        cont_pos = 0;
                    if (cont_neg < 0)
                        cont_neg = m.length - 1;
                }
                det += mult_pos - mult_neg;
            }
            return det;
        }
    }

