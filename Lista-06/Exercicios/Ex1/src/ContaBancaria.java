public class ContaBancaria
{
    //Atributos
    private int numero;
    private double saldo;
    private String titular;


    //Construtor
    public ContaBancaria(int numero, double saldo, String titular)
    {
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular;
    }
    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    //toString()


    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }

    //Métodos
    //this -  declara que determinada variavel é referente ao atributo que foi atribuido
    public boolean depositar (double valor)
    {
        if (valor < 0)
            return false;
        this.saldo+=valor;
        return true;
    }

    public boolean sacar (double valor)
    {
        if (valor <= 0 || this.saldo < valor)
            return false;
        this.saldo -= valor;
        return true;
    }

    //COMANDO GETTER, PARA RETORNAR O VALOR DE 'SALDO'
    public double getSaldo()
    {
        return this.saldo;
    }
}
