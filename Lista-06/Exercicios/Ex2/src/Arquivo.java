class Arquivo {
    private String nome;
    private int tamanho;
    private StringBuilder conteudo;

    // Construtor que inicializa o nome e conteúdo do arquivo
    public Arquivo(String nome) {
        this.nome = nome;
        this.conteudo = new StringBuilder();
        this.tamanho = 0;
    }

    // Método para abrir o arquivo e exibir suas informações
    public void abrir() {
        System.out.println("Nome do Arquivo: " + nome);
        System.out.println("Conteúdo do Arquivo: " + conteudo.toString());
        System.out.println("Tamanho do Arquivo: " + tamanho + " bits");
        System.out.println();
    }

    // Método para editar o arquivo, concatenando novo conteúdo
    public void editar(String novoConteudo) {
        conteudo.append(novoConteudo);
        tamanho = conteudo.length() * 8; // 1 caractere = 8 bits
    }

    // Método para renomear o arquivo
    public void renomear(String novoNome) {
        nome = novoNome;
    }

    // Método para limpar o conteúdo do arquivo
    public void limpar() {
        conteudo.setLength(0);
        tamanho = 0;
    }
}