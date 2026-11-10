package basic.exercises.bank;

public class Conta {

    private String name;
    private String cpf;
    private String tipoConta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Conta() {
    this.name = "Miriam";
        this.cpf = "454.689.718-95";
        this.tipoConta = "Conta corrente";
    }

}