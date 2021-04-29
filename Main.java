
package sample;

public class Main {

    public static void main (String[] args ) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Igor Borba");
        p1.setIdade(17);

        System.out.println(p1.toString());

        Pessoa p2 = new Pessoa();
        p2.setNome("Rodrigo");
        p2.setIdade(20);

        System.out.println(p2.toString());

        if(p1.getIdade() > p2.getIdade()){
            System.out.println(p1.getNome() + " é mais velho!!!");
        }else{
            System.out.println(p2.getNome() + " é mais velho!!!");
        }

    }
}

