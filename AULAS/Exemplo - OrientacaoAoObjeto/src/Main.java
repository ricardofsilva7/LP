public class Main {
    public static void main(String[] args) {
        String str = "Hello Word";

        //PARA SABER A QUANTIDADE DE CARACTERES POSSUI
        System.out.println(str.length());

        //PARA SABER QUAL Nº DO INDICE SE ENCONTRA DETERMINADO CARACTERE
        System.out.println(str.indexOf("o"));

        String string = "ricardofsilva7@outlook.com";

        System.out.println(string.substring(string.indexOf('@')+1));

        System.out.println(string.replace('a', 'A'));
    }
}