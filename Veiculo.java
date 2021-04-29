package sample.model;

/**
 * Classe abstrata veículo
 */
public abstract class Veiculo {
    /**
     * Atributos
     */
    private String nome;
    private Marca marca;
    private String desc;

    /**
     * Construtor da classe
     * @param nome
     */
    public Veiculo(String nome){
        this.nome = nome;
    }
    //Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(String nome, String descricao) {
        Marca marca = new Marca();
        marca.setNome(nome);
        marca.setDesc(descricao);
        this.marca = marca;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * ToString da classe
     * @return string do objeto
     */
    @Override
    public String toString() {
        return nome + ", " + marca
                + ((desc == null) ? "" : desc + "\n");
    }

}

