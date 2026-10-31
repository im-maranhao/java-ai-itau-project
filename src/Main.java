package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(400.0);
        Conta conta2 = new Conta(1000.0);

        Conta conta = new Conta(1000.0);

        conta.depositar(200);
        conta.depositar(300);

        System.out.println("Seu saldo atual é de: " + conta.getSaldoAtual());


        System.out.println("---------------");
    }


}

