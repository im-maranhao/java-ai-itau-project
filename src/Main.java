package src;

import java.util.Scanner;
import src.Operacoes;

public class Main {

    public static void main(String[] args) {
//        Conta conta1 = new Conta(400.0);
//        Conta conta2 = new Conta(1000.0);


//
        Operacoes operacoes = new Operacoes(1000.0);

        System.out.println("Seu saldo atual é de: " + operacoes.getSaldoAtual());

        System.out.println("---------------");

        operacoes.sacar(1200);
        System.out.println("---------------");
        System.out.println("Seu saldo atual: " +  operacoes.getSaldoAtual());

        operacoes.depositar(200);
        operacoes.depositar(200);
        operacoes.depositar(300);

        System.out.println(operacoes.calcularTaxa());

    }


}

