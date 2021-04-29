package sample;

import sample.model.Cliente;
import sample.model.Pessoa;

public class Main{

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Emílio Santiago");
        cliente1.setCpf("200.900.111-90");
        cliente1.setEndereco("Sete de setembro", 12);
        Cliente cliente2 = new Cliente("Raul Seixas", "888.999.111.90");
        Cliente cliente3 = new Cliente("Dom Pedro I", "1-01", "pedrao@brasil.br");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
    }
}

