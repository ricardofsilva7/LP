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

//EX.10
public class Main {
    public static void main(String[] args) {
        int[][] a = {{5, 6},
                {8, 7},
                {3, 3}};

        int[][] b = {{9, 1},
                {6, 1}};

        int[][] c = new int[3][2];

        for (int i = 0; i < a.length; i++) {
            c[i][0] = a[i][0] * b[0][0] + a[i][1] * b[1][0];
            c[i][1] = a[i][0] * b[0][1] + a[i][1] * b[1][1];
        }
        for(int [] line : c) {
            for(int value:line)
                System.out.print(value + " ");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int size_lines,size_columns;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz 1 (separado por espaço):");
        size_lines = in.nextInt();
        size_columns = in.nextInt();

        int [][]a = new int[size_lines][size_columns];

        System.out.println("Digite o tamanho da matriz 2 (separado por espaço):");
        size_lines = in.nextInt();
        size_columns = in.nextInt();

        int [][]b = new int[size_lines][size_columns];

        if(a[0].length!=b.length){
            System.out.println("Impossível multiplicar as matrizes");
        }else{
            int [][]c = new int[a.length][b[0].length];

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.println("Digite a"+i+j+":");
                    a[i][j]=in.nextInt();
                }
            }

            for(int i=0;i<b.length;i++){
                for(int j=0;j<b[0].length;j++){
                    System.out.println("Digite b"+i+j+":");
                    b[i][j]=in.nextInt();
                }
            }

            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<a[0].length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                        System.out.println("c"+i+j+" a"+i+k+" b"+k+j);
                    }
                }
            }

            for(int [] line : c) {
                for(int value:line)
                    System.out.print(value + " ");
                System.out.println();
            }
        }
    }
}


