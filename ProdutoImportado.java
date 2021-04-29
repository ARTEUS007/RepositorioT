package dominio;

public class ProdutoImportado extends dominio.Produto {

    private double taxa;

    //construtor
    public ProdutoImportado(){};
    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double totalPreco(double valor){
        return getPreco() + valor;
    }

    @Override
    public void imprimir(){
        System.out.println(getNome() +", R$"+(getPreco()+getTaxa())
                + " (taxa aduaneira: R$ "+getTaxa()+")");
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }


}