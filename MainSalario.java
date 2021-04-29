package sample;

public class MainSalario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setNome("Igor");
        f1.setSalario(10.00);

        System.out.println(f1.toString());

        Funcionario f2 = new Funcionario();
        f2.setNome("Rodrigo");
        f2.setSalario(15.00);

        System.out.println(f2.toString());

        double media = (f1.getSalario() + f2.getSalario()) / 2;

        System.out.println("A media é " + media);
    }
}
