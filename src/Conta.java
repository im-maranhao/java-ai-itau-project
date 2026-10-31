package src;

public class Conta {

    private double saldoInicial;
    //guarda o valor da abertura da conta

    private double saldoAtual;
    // guarda o valor disponível naquele momento

    private double chequeEspecial;
    // guarda o limite calculado na abertur

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
    public double getSaldoAtual(){
        return saldoAtual;
    }

    public void depositar(double valor){
         this.saldoAtual +=  valor;
    }
}