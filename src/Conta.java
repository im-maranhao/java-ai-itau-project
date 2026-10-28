package src;

public class Conta {

    private double saldoInicial;
    private double chequeEspecial;

    public Conta(double saldoInicial) {
        Conta conta1 = new Conta(400.0);
        Conta conta2 = new Conta(1000.0);

        this.saldoInicial = saldoInicial;

        if (saldoInicial <= 500) {
            System.out.println("O valor do cheque é 50 reais");
        } else {
            System.out.println("Se calcula dividindo em dois, 50% do saldo inicial. Resultando: " + saldoInicial / 2);
        }
    }
}