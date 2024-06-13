public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe Arquivo
        Arquivo arquivo = new Arquivo("meuArquivo.txt");

        arquivo.abrir();

        // Editar o arquivo
        arquivo.editar("Este é o conteúdo inicial do arquivo.");
        arquivo.abrir();

        // Renomear o arquivo
        arquivo.renomear("novoNome.txt");

        // Limpar o arquivo
        arquivo.limpar();
        arquivo.abrir();
    }
}