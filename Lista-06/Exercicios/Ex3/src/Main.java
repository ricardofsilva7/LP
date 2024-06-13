<<<<<<< HEAD
class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    // Construtor que inicializa o nome, vida, ataque e defesa do personagem
    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        Random random = new Random();
        this.ataque = random.nextInt(11) + 20; // Gera um valor entre 20 e 30
        this.defesa = random.nextInt(6) + 10; // Gera um valor entre 10 e 15
    }

    // Método para o personagem atacar um adversário
    public void ataque(Personagem adversario) {
        int dano = this.ataque - adversario.defesa;
        if (dano > 0) {
            adversario.vida -= dano;
            System.out.println(this.nome + " atacou " + adversario.nome + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " atacou " + adversario.nome + " mas não conseguiu causar dano.");
        }
        if (adversario.vida < 0) {
            adversario.vida = 0;
        }
        System.out.println(adversario.nome + " agora tem " + adversario.vida + " de vida.");
    }

    // Método para verificar se o personagem está vivo
    public boolean estaVivo() {
        return this.vida > 0;
    }

    // Getter para o nome do personagem
    public String getNome() {
        return this.nome;
=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
>>>>>>> 3d91f720efe09e14da91368b5dd801df9da86fcd
    }
}