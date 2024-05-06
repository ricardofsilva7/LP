public class Main
{
    public static void main(String[] args)
    {
        //INSTANCIA A CLASSE 'ContaBancaria' PARA O MAIN
        ContaBancaria c1 = new ContaBancaria(5684 ,86.3,"Ricardo");

        if(c1.depositar(200))
            System.out.println("Valor depositado com sucesso");
        else
            System.out.println("Valor indisponível");

        if(c1.sacar(13.40))
            System.out.println("Saque realizado com sucesso");
        else
            System.out.println("Saldo insuficiente");
        System.out.println(c1.toString());
    }
}