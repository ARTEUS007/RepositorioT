package sample;

import sample.model.Conta;

public class Main {

    public static void main(String[] args) {

        int numeroConta = 8532;
        String nomeTitular = "Lucas Ecker";
        char temDeposito = 'n';
        double valor = 0.0;

        if(temDeposito == 's'){
            valor = 500.00;
        }

        Conta conta = new Conta(numeroConta,nomeTitular, valor);
        System.out.println("Dados da Conta:");
        conta.imprimir();

        conta.deposito(200);
        System.out.println("Dados da Conta Atualizado:");
        conta.imprimir();

        conta.saque(300);
        System.out.println("Dados da Conta Atualizado:");
        conta.imprimir();
    }
}
