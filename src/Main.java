package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Conta conta1 = new Conta(400.0);
//        Conta conta2 = new Conta(1000.0);

//        conta.depositar(200);
//        conta.depositar(300);

        Conta conta = new Conta(1000.0);

        System.out.println("Seu saldo atual é de: " + conta.getSaldoAtual());

        System.out.println("---------------");

        conta.sacar(1200);
        System.out.println("---------------");
        System.out.println("Seu saldo atual: " +  conta.getSaldoAtual());

        conta.depositar(200);

        System.out.println(conta.calcularTaxa());

    }


}

