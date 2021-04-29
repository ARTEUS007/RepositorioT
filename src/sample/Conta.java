public class Conta {

    //atributos
    private double numAgencia;
    private double numConta;
    private double saldo;

    //meus métodos
    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return valor;
        }else{
            return 0;
        }
    }

    //getters and setters
    public double getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(double numAgencia) {
        this.numAgencia = numAgencia;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(double numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //toString
    @Override
    public String toString() {
        return "Conta: " +
                "Agencia:" + numAgencia +
                ", Conta corrente:" + numConta +
                ", Saldo:" + saldo;
    }

}
