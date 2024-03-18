import java.util.Scanner;

//EXERCICIO 02\\
public class Main {
    public static void main(String[] args) {

        int [] vetor = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0; i<vetor.length;){
            if(i%2==0)
                vetor[i]+=2;
            else
                vetor [i]*=2;
            System.out.println(vetor[i]);
        }
    }
}
//EXERCICIO 03\\

public class Main {
    public static void main(String[] args) {

        int [] vetor = {0,1,2,3,4,5,6,7,8,9};
        int value;
        boolean found;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        value = in.nextInt();

        for (int i=0; i<vetor.length;) {
            if (vetor[i] == value) {
                System.out.println("Valor encontrado na posição" +i);
                found=true;
                break;
            }
        }
        if (found=false)
            System.out.println("Valor não encontrado");
        }
    }
//EXERCICIO 04\\

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int []maior = new int [2];
        int []menor = new int [2];
        Scanner in = new Scanner(System.in);

        for (int i=0; i<vetor.length; i++) {
            vetor[i] = in.nextInt();
        }
        maior[0]= vetor[0];
        menor[0]= vetor[0];
        for (int i = 0; i< vetor.length; i++){
            if (vetor[i] >maior[0]){
                maior[0] = vetor[i];
                maior[1] = i;
            }
            if(vetor [i]<menor[0]){
                menor[0] = vetor[i];
                menor[1] = i;
            }
        }
        System.out.println("Maior valor = "+maior[0]+ " na posição: "+maior[1]);
        System.out.println("Menor valor = "+menor[0]+ " na posição: "+menor[1]);
    }
}
//EXERCICIO 05\\

public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotev = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            rotev[(vetor.length - 1) - 1] = vetor[i];
        }
        for (int n: vetor) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n: rotev) {
            System.out.print(n + " ");
        }

    }
}
//EXERCICIO 06\\
public class Main {
    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rotev = new int[vetor.length];
        int aux;

        for (int n: vetor) {
            System.out.print(n + " ");
        }
        for (int i=0; i<vetor.length/2; i++) {
            aux = vetor[i];
            vetor[i] = vetor[(vetor.length - 1) - i];
            vetor[(vetor.length - 1) - i]=aux;
        }

        for (int n: rotev) {
            System.out.print(n + " ");
        }

    }
}

//EXERCÍCIO 07\\
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        int column_sum, line_sum, biggest_column_sum, biggest_line_sum;
        biggest_line_sum = Integer.MIN_VALUE;
        biggest_column_sum = Integer.MIN_VALUE;


        for (int i = 0; i < matrix.length; i++) {
            column_sum = 0;
            line_sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                line_sum += matrix[i][j];            //COMANDO P/SOMAR AS LINHAS
                column_sum += matrix[j][i];
            }
            if (i == 0) {
                biggest_column_sum = column_sum;
                biggest_line_sum = line_sum;
            } else {
                if (column_sum > biggest_column_sum)
                    biggest_column_sum = column_sum;
                if (line_sum > biggest_line_sum)
                    line_sum = biggest_line_sum;
            }
            System.out.println("Maior linha = " + biggest_line_sum);
            System.out.println("Maior coluna = " + biggest_column_sum);
        }
    }
}









    }
}


