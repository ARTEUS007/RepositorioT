package herança;

public class Conta {
    //atributos
    private String nome;
    private int numero;
    private double saldo;

    //métodos
    public void deposito(double valor){
        setSaldo(getSaldo() + valor);
        //saldo += valor;
    }
    public void saque(double valor){
        setSaldo(getSaldo() - valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}