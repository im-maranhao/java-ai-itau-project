package src;

public class Conta {

    private double saldoInicial;
    //guarda o valor da abertura da conta

    private double saldoAtual;
    // guarda o valor disponível naquele momento

    private double chequeEspecial;
    // guarda o limite calculado na abertura

    public Conta(double saldoInicial) {
        this.saldoInicial = saldoInicial;
        this.saldoAtual = saldoInicial;

        if (saldoInicial <= 500) {
            chequeEspecial = 50.0;
        } else {
            chequeEspecial = saldoInicial / 2;
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void depositar(double valor) {

        if (saldoAtual < 0) {

            double valorUtilizado = getChequeEspecialUtilizado();

            saldoAtual += valor;

            if (saldoAtual >= 0) {
                double taxa = valorUtilizado * 0.20;
                saldoAtual -= taxa;

                System.out.println("Taxa cobrada: " + taxa);
            }

        } else {
            saldoAtual += valor;
        }

        System.out.println("Saldo atual: " + saldoAtual);
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldoAtual + chequeEspecial) {
            System.out.println("Saldo insuficiente, tente outro valor. ");
        } else {
            saldoAtual -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public double getChequeEspecialUtilizado() {
        if (saldoAtual < 0) {
            double utilizado = Math.abs(saldoAtual);
            return utilizado;
        } else {
            return 0;
        }
    }


    public double calcularTaxa() {
        double utilizado = getChequeEspecialUtilizado();
        double taxa = utilizado * 0.20;
        saldoAtual -= taxa;
        return taxa;
    }
}