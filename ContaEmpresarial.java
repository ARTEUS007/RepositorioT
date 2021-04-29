package herança;

public class ContaEmpresarial extends herança.Conta{
    //atributos
    private double limite;

    //métodos
    public void emprestimo(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }


}