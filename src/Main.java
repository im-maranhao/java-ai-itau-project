package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(400.0);
        Conta conta2 = new Conta(1000.0);

        System.out.println(conta1.getChequeEspecial());
        System.out.println(conta2.getChequeEspecial());
    }


}

