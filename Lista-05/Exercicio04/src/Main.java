import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static boolean palindromo (String palavra) //FUNÇÃO QUE VERIFICA SE PALAVRA DIGITADA É UM PALINDROMO
    {
        if (palavra.length() <= 1) {
            return true;
        } else {
            if (palavra.charAt(0) != palavra.charAt(palavra.length() - 1)) {
                return false;
            } else {
                return palindromo(palavra.substring(1, palavra.length() - 1)); //SUBSTRING CRIA UMA COPIA DA VARIAVEL INICIAL E COMPARA 
            }
        }
    }

    public static void main(String[] args) //FUNÇÃO RECEBE PALAVRA E EXECUTA FUNÇÃO 'PALINDROMO'
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();
        
        if (palindromo(palavra))
            System.out.println("É UM PALINDROMO");
        else
            System.out.println("NÃO É UM PALINDROMO");
    }
}